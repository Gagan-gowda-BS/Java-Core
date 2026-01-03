class college {
    String cname="RIT";
    
}
class Dept extends college{
    String Dname="CSE";
}
public class Test3 extends Dept{
    public static void main(String[] args) {
        Test3 T=new Test3() ;
        System.out.println(T.cname);
        System.out.println(T.Dname);
       }
}
