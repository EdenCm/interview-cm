public class jianzhi47_GetMaxGiftValue {

    /**
     * 在一个 m*n 的棋盘的每一格都放有一个礼物，每个礼物都有一定的价值（价值大于 0）。
     * 你可以从棋盘的左上角开始拿格子里的礼物，并每次向右或者向下移动一格、直到到达棋盘的右下角。
     * 给定一个棋盘及其上面的礼物的价值，请计算你最多能拿到多少价值的礼物？
     *
     * 动态规划解决
     */
    static class Solution {
        public int maxValue(int[][] grid) {

            int n = grid.length,m = grid[0].length;
            int[][] f = new int[n+1][m+1];
            for (int i = 1; i <= n; i++) { // 从1开始算，不用判断边界条件0
                for (int j = 1; j <= m; j++) {
                    f[i][j] = Math.max(f[i-1][j],f[i][j-1]) +grid[i-1][j-1];
                    i-=1; j-=1;
                    System.out.println("f["+i+"]["+j+"]值为"+f[i+1][j+1]);
                    i+=1;j+=1;
                }
            }
            return f[n][m];
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] arr = {{1,3,1},{1,5,1},{4,2,1}};
        int maxValue = solution.maxValue(arr);
        System.out.println(maxValue);
    }

}
