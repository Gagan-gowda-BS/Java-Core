import java.util.Scanner;
public class Gretest {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter two num");
     int a=sc.nextInt();
     int b=sc.nextInt();
     if(a>b){
        System.out.println("a is gretest");
     }
     else if(b>a){
        System.out.println("b is gretest");
     }
     else{
        System.out.println("both are equal");
     }
     }   
    }

