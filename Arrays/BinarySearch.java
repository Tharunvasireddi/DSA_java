import java.util.*;

public class BinarySearch {
    public static void main(String[]args){
        int [] arr = {1,2,3,4,5,6,7};
        System.out.println(BinarySearch(arr, 7));

    }
    public static boolean BinarySearch(int[]nums,int target){
        int low = 0;
        int high = nums.length;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]==target){
                return true;
            }else if(nums[mid]>target){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return false;
    }
}
