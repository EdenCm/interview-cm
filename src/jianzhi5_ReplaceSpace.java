public class jianzhi5_ReplaceSpace {



    static class Solution{
        public String replaceSpace(String s){
            int n = s.length();

            char[] chars = new char[n*3];

            int size = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i)==' '){
                    chars[size ++]='%';
                    chars[size ++]='2';
                    chars[size ++]='0';
                }else {
                    chars[size++] = s.charAt(i);
                }
            }
            return new String(chars,0,size);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = solution.replaceSpace("1 2 34");
        System.out.println(s);

        Double a = 3.14;
        char c = 'a';
        char c1 = c++;
        Double aDouble = a++;
        System.out.println(aDouble);
        System.out.println(c1);
    }
}
