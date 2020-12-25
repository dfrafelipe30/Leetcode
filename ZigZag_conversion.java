public interface ZigZag_conversion {
    public static String convert(String s, int numRows) {
        int length = s.length();
        if (numRows >= length || numRows <= 1){
            return s;
        }
        char[] ZigZag = new char[length];
        int count = 0;
        int intervalo = 2*numRows - 2;
        for (int i = 0; i < numRows; i++){
            int step = intervalo - 2*i;
            for (int j = i; j < length; j += intervalo){
                ZigZag[count] = s.charAt(j);
                count ++;
                if (step > 0 && step < intervalo && j+step < length){
                    ZigZag[count] = s.charAt(j + step);
                    count++;
                }
            }
        }
        return new String(ZigZag); 
    }

    public static void main(String[] args) {
       String s = "PAYPALISHIRING";
       int  numRows = 3;
       String result = convert(s,numRows);
       System.out.print(result);
    }
}
