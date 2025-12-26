package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestCommonPrefix {
    public static void main(String[] Args){
        System.out.println(longestCommonPrefix(new String[] {"flower","flow","flight"}));
    }

    static String longestCommonPrefix(String[] strs){
        List<String> prefix;
        for(int i =0; i<strs[0].length();i++){
            char c= strs[0].charAt(i);
            for(int j=1;j< strs.length;j++){
                if (i>=strs[j].length()|| strs[j].charAt(i)!=c){
                    return strs[0].substring(0,i);
                }
            }

        }
        return strs[0];
    }
}
