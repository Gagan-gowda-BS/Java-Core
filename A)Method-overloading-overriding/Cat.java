  class Cat extends Animal{
     void makesound(){
        System.out.println("meow meow");
     }
     public static void main(String[] args) {
        Cat c= new Cat();
        System.out.println("Cat:");
        c.makesound();
        System.out.println("legs:"+c.legs);
     }
}
    

