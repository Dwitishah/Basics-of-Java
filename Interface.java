import java.lang.Math;
interface Polygon {

    void getArea();
    default void getPerimeter(int... sides){
        int perimeter =0;
        for(int side: sides){
            perimeter += side;
        }
        System.out.println("Perimeter is "+perimeter);
    }
}

class  Message {
    public void display(){
        for(int i=0; i<10;i++){
            System.out.print("*");
        }
    }

    public void display(char symbol){
        for(int i=0; i<10;i++){
            System.out.print(symbol);
        }
    }
}
class Age{
    private int age;
    public int getAge() {
        return age;
  }
     public void setAge(int age) {
        this.age = age;
  }
}
class  Triangle implements Polygon {

    private int a,b,c;
    private double s, area;
    Triangle(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
        s=0;
    }
    public void getArea(){
        s = (double) (a + b + c)/2;
        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area: " + area);
    }
}

public class Interface {
    public static void main(String[] args) {

        Age a = new Age();
        a.setAge(20);
        System.out.println("My age is "+a.getAge());

        Message m = new Message();
        m.display();
        m.display('#');
        Triangle t1 = new Triangle(2,3,4);
        t1.getArea();
        t1.getPerimeter(2,3,4);
        
    }
    
}
