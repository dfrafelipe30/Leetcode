public class reverse_integer {
    public static int reverse (int x){
        // System.out.println(x);
        // boolean negativo = (x > 0) ? false : true;
        // if (negativo){
        //     System.out.println("Entro");
        //     x = -1 * x;
        // } 
        // System.out.println(x);
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
    public static void main(String[] args) {
        int x = -2147483648;
        int sol = reverse(x);
        System.out.print(sol);
    }
}
