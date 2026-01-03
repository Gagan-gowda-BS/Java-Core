class A {
    static int x=10;
}
class Test1 extends A{
    static int x=20;
    public static void main(String[] args) {
        Test1 T=new Test1();
        System.out.println(T.x);
        A a=new Test1();
        System.out.println(a.x);
    }
}
//x is a static var ,so choose ref(Early binding).