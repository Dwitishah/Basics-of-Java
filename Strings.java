public class Main {

    // public static int getSquare(int a){
    //     return a*a;
    // }

    // String lang;

    // Main(){
    //     this.lang = "Java";
    // }
    // Main(String lang){
    //     this.lang = lang;
    // }

    // public void getName(){
    //     System.out.println("Programming lang:"+this.lang);
    // }

    // private static void display(int b){
    //     System.out.println("Integer");
    // }
    // private static void display(String a){
    //     System.out.println("String");
    // }
    // this keyword
    // private int a,b;

    // private Main(int i, int j){
    //     this.a = i;
    //     this.b = j;
    // }
    // private Main(int i){
    //     this(i, i);
    // }
    // private Main(){
    //     this(0);
    // }
    // public String toString(){
    //     return this.a +"+"+this.b;
    // }

    //final keyword
    // public final void display(){
    //     System.out.println("This is the final method");
    // }

    //recursive method

    // static int factorial(int n){
    //     if(n!=0){
    //         return n*factorial(n-1);
    //     }
    //     else{
    //         return 1;
    //     }

    // }


    public static void main(String[] args) {

        //instanceof operator

        String name = "Hello";

        boolean result = name instanceof String;
        System.out.println("name is an instanceof string-"+result);

        // int num=4, result;
        // result = factorial(num);
        // System.out.println("Factorial of "+ num+ ":is: "+result);

        // Main obj = new Main();
        // obj.display();

        // Main m1 = new Main(2,3);
        // Main m2 = new Main(3);
        // Main m3= new Main();

        // System.out.println(m1);
        // System.out.println(m2);
        // System.out.println(m3);
        // for(int i=1; i<=5;i++){
        //     int result = getSquare(i);
        //     System.out.println("Square of "+ i + ":is:" + result);
        // }

        // display(20);
        // display("Hello");

        // Main obj1 = new Main();
        // Main obj2 = new Main("Python");

        // obj1.getName();
        // obj2.getName();

        //String

        // String first = "Java";
        // String second = "Programming";
        // String regex = "^J..a$";

        // String joinstr = String.join(" ",first,second);
        // System.out.println(joinstr);
        // String result = first.concat(second);
        // Boolean result1 = first.equals(second);
        // System.out.println(result1);
        // System.out.println(result); 
        // System.out.println(first.subSequence(0, 2));
        // System.out.println(first.hashCode());
        // System.out.println(first.charAt(3));
        // System.out.println(first.endsWith("a"));
        // System.out.println(first.matches(regex));
        // System.out.println(first.toLowerCase());
        // System.out.println(first.toUpperCase());
    }
    
}
