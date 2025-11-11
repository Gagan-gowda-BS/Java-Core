import java.util.*;
public class eligible {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age");
        int a=sc.nextInt();
        if(a>=28 && a<=32){
            System.out.println("eligible");
        }
        else{
            System.out.println("not eligible");
        }
    }
}
