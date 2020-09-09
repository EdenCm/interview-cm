import java.util.ArrayList;
import java.util.Arrays;

public class jianzhi29_printMatrix_Star {

    // 29 顺时针打印矩阵

    static class Solution {
        public int[] spiralOrder(int[][] matrix) {
            // 矩阵行数
            int[] res = {};
            int n = matrix.length;
            // 矩阵列数
            if (n == 0) return res;
            int m = matrix[0].length;
            // 结果数组
            res = new int[m * n];

            // 建立访问过的矩阵，访问过为false
            boolean[][] st = new boolean[n][m];
            // 上、右、下、左方向数组
            int[] dx = {-1,0,1,0} ,dy = {0,1,0,-1};
            // 当前搜素坐标 d表示从右开始搜索
            int x = 0 ,y = 0 ,d =1;
            // 遍历矩阵所有元素
            for (int i = 0; i < n * m; i++) {
                // 将矩阵数字加入返回数组
                res[i] = matrix[x][y];
                // 将该位置元素标记为true 已遍历过
                st[x][y] = true;
                // x  与y 向逆时针方向移动一位
                int a = x + dx[d], b = y + dy[d];
                // 如果元素出了范围或已经访问过则 向下一个方向移动
                if (a <0 || a >= n || b < 0 || b >= m || st[a][b]){
                    d = (d+1)%4;
                    // 确定新坐标
                    a = x + dx[d];
                    b = y + dy[d];
                }
                x = a;
                y = b;
            }
            return res;
        }

        public ArrayList<Integer> printMatrix(int [][] matrix) {
            if( matrix == null || matrix.length == 0 ) return null;
            ArrayList<Integer> res = new ArrayList<>();

            int[] dx = {0,1,0,-1}; // 右 下 左 上
            int[] dy = {1,0,-1,0};
            int row = matrix.length;
            int column = matrix[0].length;
            boolean[][] history = new boolean[matrix.length][matrix[0].length];

            int x = 0 ,y = 0,direction = 0,count = 0;
            while(count < row * column ){
                int a ,b;
                if (x!= 0 || y != 0){
                    direction = (++direction) %4;
                    a = x + dx[direction] ;
                    b = y + dy[direction] ;
                }else {
                    a = 0;b=0;
                }
                while( a < row && a >= 0 && b < column && b >= 0 && !history[a][b]){
                    x = a;
                    y = b;
                    res.add(matrix[a][b]);
                    count +=1 ;
                    history[a][b] = true;
                    a = x + dx[direction] ;
                    b = y + dy[direction] ;

                }
            }
            return res;


        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        Solution solution = new Solution();
        ArrayList<Integer> integers = solution.printMatrix(matrix);
        System.out.println(integers);
    }
}
