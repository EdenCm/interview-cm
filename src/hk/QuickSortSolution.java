package hk;

import java.util.Arrays;

public class QuickSortSolution {

    public  static void quickSort(int [] nums,int start, int end){
        if (start >= end) return;
        int l = start;
        int r = end;
        int mid = nums[start];
        while (l < r){
            while (l < r && nums[r] >= mid){
                r -=1;
            }
            nums[l] = nums[r];
            while (l < r && nums[l] <mid ){
                l +=1 ;
            }

            nums[r] = nums[l];
        }
        nums[l] = mid;
        quickSort(nums,start,l-1);
        quickSort(nums,l+1,end);

    }


    public static void main(String[] args) {
        int [] nums = {1,2,6,4,3,9};
        quickSort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

}
