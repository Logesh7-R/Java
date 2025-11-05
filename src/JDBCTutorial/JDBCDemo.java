package JDBCTutorial;
import java.sql.*;
import java.util.function.Consumer;

public class JDBCDemo {
    public static void main(String[] args) throws SQLException {
//        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/JDBCDemo";
        String userName = "root";
        String password = "root1234";
        Connection con = DriverManager.getConnection(url,userName,password);
        Statement stmt = con.createStatement();

        String sql = "Select * from student;";
        ResultSet rs = stmt.executeQuery(sql);
        System.out.println(rs);
        while(rs.next()){
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
        }
        System.out.println("Connection Established...");
        con.close();
    }
}
