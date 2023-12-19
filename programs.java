public class programs {
    public static void main(String[] args) {
        // 1. Find ascii value of a character

        char ch = 'a';
        int ascii = ch;
        System.out.println("Ascii value of a is :" + ascii);

        // 2. Swap two numbers using 3 varaibles

        // int a=5, b=10, temp;
        // temp = a;
        // a = b;
        // b = temp;
        // System.out.println("After swapping value of a and b is :"+ a+", " +b );

        // Swap two numbers with 2 varaibles

        // int c=5, d=10;
        // c = c+d;
        // d = c-d;
        // c = c-d;
        // System.out.println("After swapping value of c and d is :"+ c+", " +d );

        // 3. Factorial of a number
        // int i,fact=1;
        // int num=5;
        // for(i=1;i<=num;i++){
        //     fact = fact*i;
        // }
        // System.out.println(fact);

        // 4. Generate multiplication table

        // int m = 5;
        // for(i=1;i<=10;i++){
        //     System.out.printf( "%d * %d = %d \n",m ,i ,m*i);
        // }
        //5.Reverse a number
        //  int r=1234, rev=0;
        //  while (r!=0) {
        //     int rem = r%10;
        //     rev = rev *10 +rem;
        //     r= r/10;
        //  }
        //  System.out.println("Reverse is "+rev);

         //6.check palindrome

         int r,sum=0,temp;    
         int n=454;
         
         temp=n;    
         while(n>0){    
          r=n%10;
          sum=(sum*10)+r;    
          n=n/10;    
         }    
         if(temp==sum)    
          System.out.println("palindrome number ");    
         else    
          System.out.println("not palindrome");    

         //7.Check armstrong
        //  int number = 371, temp, rem, result = 0;

        //  temp = number;
 
        //  while (temp != 0)
        //  {
        //      rem = temp % 10;
        //      result += Math.pow(rem, 3);
        //      temp /= 10;
        //  }
 
        //  if(result == number)
        //      System.out.println(number + " is an Armstrong number.");
        //  else
        //      System.out.println(number + " is not an Armstrong number.");

            //8. Factors of a number

            // int num = 10;
            // for(int i =1;i<=num;i++){
            //     if(num%i==0){
            //         System.out.println(i+" ");
            //     }
            //  }
    }
    
}