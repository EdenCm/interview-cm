package other;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class HZBank_Test {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()){
            String str = scan.next();
            String temp = "";
            for (int i = 0; i < str.length(); i++) {
                if((str.charAt(i) >= '0' && str.charAt(i) <= '9')  || str.charAt(i) == '-'){
                    temp += str.charAt(i);
                }else {
                    temp += ',';
                }
            }
            String[] split = temp.split(",");
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < split.length; i++) {
                if (!split[i].equals("")){
                    list.add(Integer.parseInt(split[i]));
                }
            }
            Collections.sort(list);
            Collections.reverse(list);
            String res = "";
            for (int i = 0; i < list.size(); i++) {
                if (i == 0){
                    res += list.get(i);
                }else {
                    res += "," +list.get(i);
                }
            }
            System.out.println(res);
        }
    }
}
