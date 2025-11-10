import java.util.Scanner    ;
public class Userinput {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your name");
    String name=sc.nextLine();
    System.out.println("enter your age");
    int age=sc.nextInt();
    System.out.println("hello"+name+",you are"+age+"years old");
   } 
}
