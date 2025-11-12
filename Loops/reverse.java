public class reverse {
    public static void main(String[] args) {
        int n=34567;
        while(n>0){
           int d=n%10;
            System.out.println(d);
            n=n/10;
        }
    }
}
