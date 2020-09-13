package hk;

public class leetCode5_LongestPalindrome {


    public String longestPalindrome(String s){
        if (s == null || s.length() == 0) return  s;

        String res = "";
        int n  = s.length();
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j <= n ; j++) {
                String temp = s.substring(i,j);
                if (isPalindrome(temp) && temp.length() > max){
                    res = temp;
                    max = temp.length();
                }
            }
        }
        return res;
    }

    private boolean isPalindrome(String temp) {

        boolean res = true;
        for (int i = 0; i < temp.length()/2; i++) {
            if (temp.charAt(i) != temp.charAt(temp.length()-i-1)){
                res = false;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String[] s = new String[2];
        char[] c = new char[2];
        String str = "";
        str.length();

    }


}
