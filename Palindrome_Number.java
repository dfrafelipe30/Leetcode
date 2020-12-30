public class Palindrome_Number {
    public static int reverse (int x){
        long sol = 0;
        while (x != 0){
            sol = sol *10 + x %10;
            System.out.println("sol: " +  sol);
            x /= 10;
            System.out.println("x " +  x);
        }
        if (sol > Integer.MAX_VALUE || sol < Integer.MIN_VALUE ){
            return 0;
        }
        System.out.println(sol);
        //sol = (negativo) ? (-1 * sol) : sol;
        return (int)sol;
    }
    
    public static boolean isPalindrome(int x){
        if (x < 0){
            return false;
        }
        int aux = reverse(x);
        if (x == aux){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        int x = -121;
        boolean sol = isPalindrome(x);
        System.out.println(sol);
    }
}
