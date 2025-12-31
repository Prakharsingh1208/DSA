package Leetcode;

public class LengthofLastWord {
    public static void main(String... Args){
        String s="   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));

    }
    static int lengthOfLastWord(String s) {
        String b=s.trim();
        int len = 0;
        for(int i=b.length()-1;i>=0;i--){
            if(b.charAt(i)==' '){
                break;
            }
            len++;
        }
        return len;
    }
}
