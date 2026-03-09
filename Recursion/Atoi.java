package Recursion;

public class Atoi {
    public int myAtoi(String s) {

        int i = 0;
        int n = s.length();
        int sign = 1;
        int res = 0;

        // 1. skip spaces
        while(i < n && s.charAt(i) == ' ')
            i++;

        // 2. sign
        if(i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')){
            if(s.charAt(i) == '-')
                sign = -1;
            i++;
        }

        // 3. digits
        while(i < n && Character.isDigit(s.charAt(i))){

            int digit = s.charAt(i) - '0';

            // 4. overflow check
            if(res > (Integer.MAX_VALUE - digit) / 10){
                if(sign == 1)
                    return Integer.MAX_VALUE;
                else
                    return Integer.MIN_VALUE;
            }

            res = res * 10 + digit;
            i++;
        }

        return res * sign;
    }
}

