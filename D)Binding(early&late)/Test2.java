 class A {
    static void  add(){
        System.out.println(10+10);
    }
}
public class Test2 extends A{
    static void add(){
        System.out.println(20+30);

    }
    public static void main(String[] args) {
        Test2 T =new Test2();
        T.add();
        A a=new Test2();
        a.add();
    }
}

//add is a static method, so choose ref(ear;y binding)