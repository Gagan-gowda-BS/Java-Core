public class Methodoverloading {
    public static void payment(String UPI,int password){
        if(UPI.equals("9686@cnr")){
            if(password==55678){
                System.out.println("valid pass and payment successful");
            }
            else{
                System.out.println("inavalid pass");
            }
            }
            else{
                System.out.println("invalid email");
            }
        }
        public static void payment(int num,int pass){
            if(num==9876){
              if(pass==8987){
                System.out.println("vallid pass and payment successful");
              }  
              else{
                System.out.println("invalid pass");
              }
              }
                else{
                    System.out.println("invalid num");
                }
              }   
              public static void main(String[]args){
                Methodoverloading.payment("9686@cnr", 55678);
                 Methodoverloading.payment(9876,8987);
              }         
        }
            
        
    
    
    

