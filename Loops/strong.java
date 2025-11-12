public class strong {
    public static void main(String[] args) {
        int n=145;
        int temp=n;
        int sum=0;
        while(n>0){
            int d=n%10;
            int prod=1;
            for(int i=1;i<d;i++){
                prod*=i;
            }
            sum+=prod;
            n/=10;
            }
            System.out.println("sum="+sum);
            if(sum==temp){
                System.out.println("num is strong");
            }
            else{
                System.out.println("num is not strong");
            }
            }
        }

    
