package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class ValidPalindrome {
    public static void main(String... Args){
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
//    Input: s = "A man, a plan, a canal: Panama"
//    Output: true
//    Explanation: "amanaplanacanalpanama" is a palindrome.

    static boolean isPalindrome(String s){
        s= s.toLowerCase();
        List<Character> arr = new ArrayList<>();
        for(char a: s.toCharArray()){
            if(a>='a' && a<='z' || a>='0' && a<='9'){
                arr.add(a);
            }
        }
        int start=0;
        int end= arr.size()-1;
        while(start<end){
            if(arr.get(start)!=arr.get(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
