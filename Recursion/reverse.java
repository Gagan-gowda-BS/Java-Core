public class reverse {
    public static void main(String[] args) {
        display(85672);
    }
    static void display(int n){
        if(n<=9){
            System.out.println(n);
            return;
        }
        System.out.println(n%10);
        display(n/10);
    }
    
}
