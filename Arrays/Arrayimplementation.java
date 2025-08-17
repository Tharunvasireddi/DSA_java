import java.util.*;

class arrayimplementation{
    public static void main(String[]args){
         // array is a data structure it is used to store the collection of elements of the same type in a contiguous block of the memory .they are not one of the simplest and most widely used data structures

        /*
         how does array works ? 
         An array holds a fixed number of the elements and each element is assigned a unique index .these indexes start from the 0 .we can access the element directly by using the index number .this  is very fast operation no matter how many number if the elements are that an array contain,and this is called random access
         */

         // Declaration --> dataType [] arrayName;
         int [] arr;
         
         // intialiszation --> dataType [] arrayname = new dataType[size];
         int [] arr1 = new int[6];

         // intializaion with values 
         int [] nums = {1,2,3,4,5};

         // multidimenstional array {2D} The same principles apply to multi-dimensional arrays, which are arrays of arrays.

         // Declaration and intialisation 
         int[][] matrix = {{1,2,3},{4,5,6}};
        
         // *** jagged array (where each inner array can have a different length.)
         int [][] jaggedArray = new int[3][];
          jaggedArray[0] = new int[2];
          jaggedArray[1] = new int[6];

        // accessing the element in the java
        int [] numbers = {1,2,3,4,5,6,7};
        
        // Syntax: arrayName[index]
        int ele = numbers[4];
        System.out.println(ele);


        // length of the array --> arrayname.length
        System.out.println(numbers.length);

        /*
         traversing the array 
         we can traverse the arraying the by using loops 
         */

        // uisng for loop 
        System.out.println("printing the elements by using the for loop : ");
        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        } 

        // using while loop
        int i=0;
        System.out.println("printing the elements by using the for loop : ");
        while(i<numbers.length){
            System.out.println(numbers[i]);
            i++;
        }

        // using foreach loop
        System.out.println("printing the elements by using the foreach loop : ");
        for(Integer number : numbers){
            System.out.println(number);
        }


    }
}