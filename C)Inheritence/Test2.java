class B {
    int x=40;
    
}
public class Test2 extends B{
    int x=50;
    void display(){
        int x=10;
        System.out.println(x);
        System.out.println(this.x);
        System.out.println(super.x);
    }
    public static void main(String[] args) {
        Test2 T=new Test2();
        T.display();
    }
}
//calling global variable of same class(this keyword)and other class(extends keyword)