 class D {
    D(){
        System.out.println("no arg constructor");
    }
    D(int i){
        System.out.println(i);
    }
}
class Test2{
    public static void main(String[] args) {
        new D();
        new D(16);
    }
}
    

