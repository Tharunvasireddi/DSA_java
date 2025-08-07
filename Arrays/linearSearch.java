import java.util.*;

class linearSearch{
    public static void main(String[]args){
        int []nums = {1,5,26,7,8,0};
        int tar = 26;
        System.out.println(linearsearch(nums,tar));

    }
    public static boolean linearsearch(int []nums,int target){
        for(int i =0;i<nums.length;i++){
            if(nums[i]==target){
                return true;
            }
        }
        return false;
    }
}