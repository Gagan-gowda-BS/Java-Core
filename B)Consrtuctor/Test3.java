
class box{
    int length;
    int width;
    int breadth;

    box(int l,int w,int b){
        length=l;
        width=w;
        breadth=b;
    }

    box(int d){
        length=d; 
        width=d;
        breadth=d;
    }
    void display(){
        System.out.println("[lenght="+length+",width="+width+",breadth="+breadth+"]");
    }
}
public class Test3 {
    public static void main(String[] args) {
        box b1=new box(10,20,30);
        b1.display();
        box b2=new box(10);
        b2.display();
    }
}

    

