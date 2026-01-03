class A {
    final void display(){
        System.out.println("Final method of A");
    }
}
class Test3 extends A{
    public static void main(String[] args) {
        A a=new Test3();
        a.display();//Final method of A
    }
}
//final method cannot be overridden ,so they are bound at compile time
