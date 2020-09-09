package secondTry;

public class j_5_RepalceSpace  {

   static   class  Solution{

        public String replace(char[] str,int orignLength){
            if (str ==null || str.length==0){
                return null;
            }

            int totalLength = orignLength;
            int count = 0;
            for (int i = 0; i < totalLength; i++) {
                if (str[i] == ' '){
                    count += 1;
                }
            }
            int  total = totalLength + count* 2;
            int cur = totalLength ;
            total--;
            cur--;
            while (cur < total && cur >= 0){
                if (str[cur] == ' '){
                    str[total--] = '0';
                    str[total--] = '2';
                    str[total--] = '%';
                }else {
                    str[total--] = str[cur];
                }
                System.out.println(total+" " +cur);
                --cur;
            }

            return new String(str);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String str = "we are happy";
        char[] chars = new char[str.length()* 2];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        String we_are_happy = solution.replace(chars,str.length());
        System.out.println(we_are_happy);
    }

}
