import java.util.*;

class Maximum{
    public static void main(String[]args){
         int[] arr = {10, 45, 2, 89, 4};
         int max = maximum(arr);
         System.out.println(max);
    }
    public static int maximum(int[]arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}