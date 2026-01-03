 class A {
     void  add(){
        System.out.println(10+10);
    }
}
public class Test4 extends A{
     void add(){
        System.out.println(20+30);

    }
    public static void main(String[] args) {
        Test4 T =new Test4();
        T.add();
        A a=new Test4();
        a.add();
    }
}

//add is a non-static method, so choose ref(late binding)
    

