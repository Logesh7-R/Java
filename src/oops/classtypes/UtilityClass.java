package oops.classtypes;
final class UtilityTool{
    private UtilityTool(){
        System.out.println("No object is created");
    }
    public static int add(){
        return 0;
    }
    public static int add(int a){
        return a;
    }
    public static int add(int a,int... b){
        int sum=a;
        for(int i=0;i<b.length;i++){
            sum+=b[i];
        }
        return sum;
    }
}
public class UtilityClass {
    public static void main(String... args){
//        UtilityTool obj1 = new UtilityTool();
//        java: UtilityTool() has private access in oops.classtypes.UtilityTool
        System.out.println(UtilityTool.add());
        System.out.println(UtilityTool.add(1));
        System.out.println(UtilityTool.add(1,2));
        System.out.println(UtilityTool.add(1,2,3,4,5));
    }
}
