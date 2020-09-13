package hk;

import java.util.LinkedList;
import java.util.List;

public class SuNumber {

    public static void main(String[] args) {

        List<Integer> res = new LinkedList<>();
        for (int i = 3; i < 20 ; i++) {
            boolean isSu = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0){
                    isSu = false;
                    break;
                }
            }
            if (isSu){
                res.add(i);
            }
        }
        for (Integer re : res) {
            System.out.println(re);
        }

    }
}
