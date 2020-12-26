public class atoi {
    public static int myAtoi(String s){
        boolean isNeg = false;
        int i = 0;
        long num = 0;
        int length = s.length();
        //System.out.println(length);
        if (s == null || s.length() <= 0){
            return 0;
        }
        if (s.charAt(0) == ' '){ 
            s = s.trim();
            length = s.length();
            if (length == 0){
                return 0;
            }
        }
        if ((int) s.charAt(0) >= 65 &&  (int) s.charAt(0) < 90 ){
            return 0;
        }  
        if ((int) s.charAt(0) >= 97 &&  (int) s.charAt(0) < 122){
            return 0;
        }
        if( (int) s.charAt(0) >= 43 && (int)s.charAt(0) <= 45){
            if (length == 1){
                return 0;
            }
            if ((int)s.charAt(1) >= 43 && (int)s.charAt(1)<=45){
                return 0;
            }
        }
        if (s.charAt(0) == '-' || s.charAt(0) == '+'){
            if (s.charAt(0) == '-'){
                isNeg = true;
            }
            i ++;
        }
        System.out.println("s: " + s);
        while(i < length &&  s.charAt(i) >= 48 && s.charAt(i)<= 57){
                num *= 10;
                System.out.println("num: " + num);
                System.out.println("i: " + i);
                if (num >= Integer.MAX_VALUE){
                    System.out.println("entro");
                    if (isNeg){
                        return Integer.MIN_VALUE;
                    }else{
                        return Integer.MAX_VALUE;
                    }
                }
                num += (int)s.charAt(i++) - '0';
        }
        if (num >= Integer.MAX_VALUE){
            System.out.println("entro2");
            System.out.println(isNeg);
            if (isNeg){
                num = -1 *num;
                if (num < Integer.MIN_VALUE){
                    return Integer.MIN_VALUE;
                }
                else{
                    return (int)num;
                }
            }else{
                return Integer.MAX_VALUE;
            }
        }
        if (isNeg){
            num = -1* num; 
        }

        System.out.println(num);
        return (int)num;
    }
    public static void main(String[] args) {
        String s = "-2147483647";
        int resul = myAtoi(s);
        System.out.println(resul);
    }
}
