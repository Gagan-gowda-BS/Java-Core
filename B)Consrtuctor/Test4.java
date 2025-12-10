 class A {
    int i;
    void m1(){
        int i=1;
        System.out.println(i);
        System.out.println(this.i);
    }
}
class Test4{
    public static void main(String[] args) {
        A a1=new A();
        a1.i=10;
        A a2=new A();
        a2.i=20;
        a1.m1();
        a2.m1();
    }
}

