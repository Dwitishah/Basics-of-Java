import java.lang.reflect.Array;
import java.util.Arrays;

public class arrays {

     public int add(int a, int b){
            int sum = a+b;
            return sum;
     }
    public static void main(String[] args) {
        //int[] age = {10,20,30,40,50};
        //System.out.println("First element:"+age[0]);
        //System.out.println("Second element:"+age[1]);
        //looping through elements:
        // for(int i=0;i<=age.length;i++){
        //     System.out.println(age[i]);
        // }
        // int sum=0;
        // Double avg;
        // //for each loop
        // for(int a:age){
        //     sum= sum + a;
        // }
        // int agelength = age.length;
        // avg = ((double)sum/(double)agelength);
        // System.out.println("Sum of age is :"+sum);
        // System.out.println("Average of age is:"+avg);
        
        //Multidimensional array:

        // int[][] ma = {
        //     {1,2,3},
        //     {4,5,6},
        //     {8},
        // } ;

        // for(int i=0;i<=ma.length;i++){
        //     for(int j=0;j<ma[i].length;j++){
        //         System.out.println(ma[i][j]);
        //     }
        // }
        //for each loop

        // for(int[] inner:ma){
        //     for(int data:inner){
        //         System.out.println(data);
        //     }
        // }
        //3D Array

        // int[][][] threed = {
        //    { {1,2,3},{4,5,6}},{{1,2,3},{7,8,9},{7}}
        // };

        // for(int[][] arr2D:threed){
        //     for(int[] arr1D : arr2D){
        //         for(int item: arr1D){
        //             System.out.println(item);
        //         }
        //     }
        // }

        //Copy Arrays
        //Using assignment operator

        //int[] arr = {1,2,3,4,5};
        // int[] arrtwo = arr;

        // for(int data: arrtwo){
        //     System.out.print(data+",");
        // }

        //Looping construct to copy array

        // int[] arrtwo = new int[5];

        // for(int i =0; i<arr.length;i++){
        //     arrtwo[i] = arr[i]; 
        // }
        // System.out.println(Arrays.toString(arrtwo));

        // Copy array

        // int[] arr2 = new int[5];
        // int[] arr3 = new int[arr.length];

        // System.arraycopy(arr,2,arr2,0,3);
        // System.out.println("arr2:"+Arrays.toString(arr2));

        //Copyofrange

        // int[] arr4 = Arrays.copyOfRange(arr, 0, arr.length);
        // System.out.println("arr4"+Arrays.toString(arr4));

       arrays obj = new arrays();
       int result = obj.add(10, 20);
       System.out.println("Result:"+result);
    }
}
