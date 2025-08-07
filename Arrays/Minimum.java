import java.util.*;

class Minimum{
    public static void main(String[]args){
         int[] arr = {10, 45, 2, 89, 4};
         int min = minimum(arr);
         System.out.println(min);
    }
    public static int minimum(int[]arr){
        int min= Integer.MAX_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
}