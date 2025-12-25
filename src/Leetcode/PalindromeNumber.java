package Leetcode;

public class PalindromeNumber {
    public static void main(String[] Args){
        System.out.println(isPalindrome(12121));
    }

    static boolean isPalindrome(int x){
        if(x<0||(x%10==0 && x!=0)){
            return false;
        }
        int reverseHalf=0;
        while(x>reverseHalf){
            reverseHalf=+reverseHalf*10 + x%10;
            x/=10;
        }
        if(x==reverseHalf || x==reverseHalf/10){
            return true;
        }
        return false;
    }
}
