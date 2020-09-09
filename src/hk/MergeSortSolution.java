package hk;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MergeSortSolution {

    public static int[] mergeSort(int[] nums,int l ,int r){

        if (l >= r )return new int[]{nums[l]};

        int mid = (r + l) / 2;

        int[] left_li = mergeSort(nums,l,mid);
        int[] right_li = mergeSort(nums,mid+1,r);

        return merge(left_li,right_li);


    }

    private static int[] merge(int[] left_li, int[] right_li) {
        List<Integer> temp = new LinkedList<>();
        int lp = 0 ,rp = 0;
        while (lp < left_li.length && rp < right_li.length){
            if (left_li[lp] < right_li[rp]){
                temp.add(left_li[lp]);
                lp += 1;
            }else {
                temp.add(right_li[rp]);
                rp += 1;
            }
        }
        if (lp == left_li.length){
            for (int i = rp; i < right_li.length; i ++ ){
                temp.add(right_li[i]);
            }
        }
        if (rp == right_li.length){
            for (int j = lp; j < left_li.length; j ++ ){
                temp.add(left_li[j]);
            }
        }
        int[] res = new int[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            res[i] = temp.get(i);
        }
        return res;
    }

    public static void main(String[] args) {
        int [] test = {4,2,6,8,1,3};
        int[] ints = mergeSort(test, 0, test.length - 1);
        System.out.println(Arrays.toString(ints));
    }

}
