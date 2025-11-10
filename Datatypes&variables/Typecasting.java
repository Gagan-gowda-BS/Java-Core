public class Typecasting {
    public static void main(String[] args) {
        //Widning(automatic conversion)
        int num=100;
        double widened=num;
        System.out.println("widened:"+widened);
        //Narrowing(manual conversion)
        double price=99.99;
        int narrowed=(int)price;
        System.out.println("narrowed:"+narrowed);
    }
}
