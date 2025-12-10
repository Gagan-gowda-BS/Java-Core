 class bike {
    int regNum;
    String color;
    private static int count=1000;
    bike(String c){
        color=c;
        regNum=count;
        count++;
    }
    void display(){
        System.out.println("color="+color);
        System.out.println("regNum="+regNum);
    }
}
public class Test1{
    public static void main(String[] args) {
        bike b1=new bike("grey");
        b1.display();
        bike b2=new bike("white");
        b2.display();
    }
}
    

