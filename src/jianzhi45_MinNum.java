
import java.util.ArrayList;
import java.util.List;

public class jianzhi45_MinNum {
    static class Solution {
        public String minNumber(int[] nums) {
            List<String> strList = new ArrayList<>();
            for (int num : nums) {
                strList.add(String.valueOf(num));
            }
            System.out.println("strlist排序前"+strList);
            /*
         Arrays.sort(strNumbers, new Comparator<String>() {
		@Override
		public int compare(String o1, String o2) {
			return (o1 + o2).compareTo(o2 + o1);//升序
		}
	    });
             */
            strList.sort((s1, s2) -> (s1 + s2).compareTo(s2 + s1));//
            System.out.println("strlist排序后"+strList);
            StringBuilder sb = new StringBuilder();
            for (String str : strList) {
                sb.append(str);
            }
            return sb.toString();
        }
    }

    /**
     *没通过大数测试
     * import java.util.*;
     *
     * public class Solution {
     *     ArrayList<List<Integer>> num = new ArrayList<>();
     *     List<Integer> temp = new LinkedList<>();
     *
     *    int [] used ;
     *     public String PrintMinNumber(int [] numbers) {
     *          used  = new int[numbers.length];
     *         permution(numbers,0);
     *         List<Integer> combin = new LinkedList<>();
     *         for(List<Integer> list : num){
     *             String str = "";
     *             for(Integer i : list){
     *                 str+= String.valueOf(i);
     *             }
     *             combin.add(Integer.parseInt(str));
     *         }
     *
     *         combin.sort(new Comparator<Integer>(){
     *             @Override
     *             public int compare(Integer o1,Integer o2){
     *                 return o1- o2;
     *             }
     *         });
     *         return combin.get(0) + "";
     *     }
     *     private void permution(int[] numbers,int index) {
     *         if(index == numbers.length){
     *             num.add(new LinkedList<>(temp));
     *             return;
     *         }
     *         for(int i = 0 ; i < numbers.length; i ++){
     *              if(used[i]== 0){
     *                  temp.add(numbers[i]);
     *                  used[i] = 1;
     *                  permution(numbers,index+1);
     *                  used[i] = 0;
     *                  int sz = temp.size();
     *                  temp.remove(sz-1);
     *              }
     *         }
     *     }
     * }
     */


    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {10,3,2};
        System.out.println(solution.minNumber(nums));
    }

}
