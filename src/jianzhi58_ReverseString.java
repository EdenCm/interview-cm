public class jianzhi58_ReverseString {

     static class Solution {
        public String reverseWords(String s) {
            if (s.equals(" ")) return " ";
            String[] a = s.split(" ");
            StringBuilder sb = new StringBuilder();
//            StringBuffer sb = new StringBuffer();
            for(int i = a.length-1;i>=0;i--){
                if(!a[i].equals(""))  {
                    sb.append(a[i]);
                    sb.append(" ");}
            }
            return sb.toString().trim();
        }

    }

    public static void main(String[] args) {
        String s = " ";
        Solution solution = new Solution();
        System.out.println(solution.reverseWords(s));
    }
}
