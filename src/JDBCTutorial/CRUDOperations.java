package JDBCTutorial;

import java.sql.*;

public class CRUDOperations {
    public static void main(String[] args) throws Exception{
        String url = "jdbc:mysql://localhost:3306/JDBCDemo";
        String userName = "root";
        String password = "root1234";
        Connection con = DriverManager.getConnection(url,userName,password);
        Statement st = con.createStatement();
        String sql;
        int val ;
        //Create a table
//        sql = "create table course (cNo int, cName varchar(20))";
//        val = st.executeUpdate(sql);
//        System.out.println("Table Created "+val);

        //Insert rows
        sql = "insert into course values(1,\"Maths\"),(2,\"Science\"),(3,\"Social\")";


        //Update
        sql = "update course set cName = \"Tamil\" where cNo = 1";
        val = st.executeUpdate(sql);
        System.out.println("Rows affected: "+val);

        //Delete
        sql = "delete from course where cNo = 1";
        val = st.executeUpdate(sql);
        System.out.println("Rows affected: "+val);

        //Read
        sql = "select * from course";
        ResultSet rs = st.executeQuery(sql);
        while(rs.next()){
            System.out.println(rs.getInt(1)+" "+rs.getString(2));
        }

        PreparedStatement preparedStatement = con.prepareStatement("insert into course values(?,?)");
        preparedStatement.setInt(1,12);
        preparedStatement.setString(2,"Maths");
        int res = preparedStatement.executeUpdate();
        System.out.println(res);
        preparedStatement = con.prepareStatement("select * from course");
        rs = preparedStatement.executeQuery();
        while(rs.next()){
            System.out.println(rs.getInt(1)+" "+rs.getString(2));
        }
        con.close();
    }
}
