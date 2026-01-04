package Leetcode;

import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String... Args){
        String s="au";
        System.out.println(lengthOfLongestSubstring(s));
    }
    static int lengthOfLongestSubstring(String s) {
        //s = "a,b,c,a,b,c,b,b"
        HashMap<Character,Integer> map = new HashMap<>();
        int left=0;
        int maxLen=0;
        for(int right=0;right<s.length();right++){
            char currentChar = s.charAt(right);
            if(map.containsKey(currentChar)){
                left = Math.max(map.get(currentChar)+1,left);
            }
            map.put(currentChar,right);
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}
