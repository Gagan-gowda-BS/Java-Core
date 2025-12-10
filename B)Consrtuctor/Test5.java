class A {
    int i;
    A(int i){
        this.i=i;
    }
    }
    class B{
        int j;
        B(int j){
            this.j=j;
        }
        void m1(A a){
            System.out.println(a.i);
            System.out.println(j);
        }
    }
    class Test5{
        public static void main(String[] args) {
            A a1=new A(10);
            B b1=new B(20);
            b1.m1(a1);
            b1.m1(a1);
            b1.m1(new A(30));
        }
    }
    

