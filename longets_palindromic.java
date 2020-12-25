public class longets_palindromic {
    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";

        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++){
            int len1 = expandingFromMiddle(s, i, i);
            int len2 = expandingFromMiddle(s, i, i+1);
            int len = Math.max(len1, len2);
            System.out.println("len: " + len);
            if ( len >  end - start){
                System.out.println("(len - 1)/2: " + (len - 1)/2);
                start = i - ((len - 1)/2);
                System.out.println("(len)/2: " + (len)/2);
                end = i + (len/2);
            }
        }

        return s.substring(start,end+1);
    }

    public static int expandingFromMiddle(String s, int left, int right){
        if (s == null || left > right) return 0;

        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left --;
            right ++;
        }
        return right - left - 1;
    }

    public static void main(String[] args) {
        String s = "babad";
        String result = longestPalindrome(s);    
        System.out.println(result);
    }
}
