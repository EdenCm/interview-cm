import java.util.*;

public class jianzhi59_MaxSlidingWindow {

    // 滑动窗口最大值
    static class Solution {
        // 方法一暴力法，枚举执行用时 :1617 ms, 利用java优先队列
        public int[] maxSlidingWindow(int[] nums, int k) {
            int n = nums.length;
            if (nums == null || n== 0) return nums;

            if (k >= n) {
                List<Integer> l = new ArrayList<>();
                for (int i = 0; i < n; i++) {
                    l.add(nums[i]);
                }
                return new int[]{max(l)};
            }
            int[] res = new int[n -k +1];
//            int[] list = new int[k];
            List<Integer> list = new LinkedList<>();
            for (int i = 0; i < n - k + 1; i++) {
                if (list.size() == 0) {
                    for (int j = 0; j < k; j++) {
                        list.add(nums[j]);
                    }
                }else {
                    list.remove(0);
                    list.add(nums[i + k -1]);
                }
                System.out.println(list);
                res[i] = max(list);
//                Collections.max(list);
            }
            return res;
        }

        private int max(List<Integer> nums){
            PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2 - o1;
                }
            });

            for (int num : nums) {
                queue.add(num);
            }
            return queue.peek();
        }

        // 方法二，
        public int[] maxSlidingWindow2(int[] nums, int k) {
            if (nums == null || k < 1 || nums.length < k) {
                return new int[0];
            }
            int index = 0;
            int[] res = new int[nums.length - k + 1];
            LinkedList<Integer> qMax = new LinkedList<>();

            for (int i = 0; i < nums.length; i++) {
                // 在队列不为空的情况下，如果队列尾部的元素要比当前的元素小，或等于当前的元素
                // 那么为了维持从大到小的原则，我必须让尾部元素弹出
                while (!qMax.isEmpty() && nums[qMax.peekLast()] <= nums[i]) {
                    qMax.pollLast();
                }
                // 不走 while 的话，说明我们正常在队列尾部添加元素
                qMax.addLast(i);
                // 如果滑动窗口已经略过了队列中头部的元素，则将头部元素弹出
                if (qMax.peekFirst() == (i - k)) {
                    qMax.pollFirst();
                }
                // 看看窗口有没有形成，只有形成了大小为 k 的窗口，我才能收集窗口内的最大值
                if (i >= (k - 1)) {
                    res[index++] = nums[qMax.peekFirst()];
                }
            }
            return res;
        }

        public ArrayList<Integer> maxInWindows(int [] num, int size)
        {
            if(num == null || num.length == 0) return new ArrayList<Integer>();
            if(size <= 0 || size > num.length) return new ArrayList<Integer>();

            int n = num.length - size + 1;
            ArrayList<Integer> res = new ArrayList<Integer>();
            ArrayList<Integer> window = new ArrayList<Integer>();
            for(int i = 0 ; i < n ; i++){
                if(window.isEmpty()){
                    for(int j = 0 ; j < size;j ++){
                        window.add(num[j]);
                    }

                    System.out.println(window);
                    res.add( Collections.max(window));
                    window.add(num[i + size]);
                    window.remove(0);
//                    i++;
                    continue;
                }
                res.add( Collections.max(window));
                System.out.println(window.toString());
                if(i + size >= num.length){
                    break;
                }
                window.add(num[i + size]);
                window.remove(0);
            }
            return res;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {3,3,5,5,6,7};
//       int[] nums = {3,6};
//        int [] array = solution.maxSlidingWindow(nums,3);
        ArrayList<Integer> integers = solution.maxInWindows(nums, 3);

        System.out.println(integers);
    }
}
