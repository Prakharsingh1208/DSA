package Leetcode;

import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] Args){
        System.out.println(romanToInt("III"));
    }

    static int romanToInt(String s) {
        HashMap<Character, Integer> n = new HashMap<>(java.util.Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        ));
        int num = 0;
        for(int i =0;i<s.length();i++){
            int c=n.get(s.charAt(i));
            try{
                int nt=n.get(s.charAt(i+1));
                if(c < nt){
                    num-=c;
                }else{
                    num+=c;
                }
            } catch (Exception e) {
                num+=c;
            }

        }
        return num;
    }

}
