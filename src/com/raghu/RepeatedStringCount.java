package com.raghu;

import java.math.BigInteger;

class RepeatedStringCount {
    long repeatedString(String s, long n) {
        long count = 0l;
        int len = s.length();
        BigInteger rem = BigInteger.valueOf(n%len);
        if(s.equals("a")){
            return n;
        }
        else{
            for(char c : s.toCharArray()){
                if(c == 'a')
                    count++;
            }
            count *= n/len;
            for(char c : s.substring(0, rem.intValue()).toCharArray()){
                if(c == 'a')
                    count++;
            }
        }
        return count;
    }
}
