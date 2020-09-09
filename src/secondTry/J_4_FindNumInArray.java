package secondTry;

import java.util.Scanner;

public class J_4_FindNumInArray {


        public boolean findNumIn2DArray(int[][] matrix, int target){
            boolean flag = false;

            int row = 0;
            int column = matrix[0].length - 1;

            while (row < matrix.length && column >= 0){
                int temp = matrix[row][column];
                if (temp == target){
                    flag = true;
                    break;
                }else if (temp > target){
                    column -= 1;
                }else {
                    row += 1;
                }
            }

            return flag;

        }

        public static void main(String[] args) {

            Scanner san = new Scanner(System.in);
            while (san.hasNext()){

            }
        }






}
