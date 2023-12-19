abstract class  Animal {
    protected String name;

    Animal(){
        System.out.println("I am an animal");
    }   

    abstract void sound();//abstract method
    public void eat(){
        System.out.println("Animal eat");
    }
}

class Dog extends Animal{

    Dog(){
        super();// superclass constructor
        System.out.println("I am a dog");
    }
    public void getInfo(){
        System.out.println("My name is "+ name);
    }
    //abstract method implementation
    public void sound(){
        System.out.println("Dog barks");
    }
    public void eat(){
        super.eat();// superclass method
        System.out.println("Dog eat");
    }
}

public class Oops {
    public static void main(String[] args) {
        Dog tom = new Dog();
        tom.eat();
        tom.name = "Tom";
        tom.getInfo();
        tom.sound();
    }
    
}
