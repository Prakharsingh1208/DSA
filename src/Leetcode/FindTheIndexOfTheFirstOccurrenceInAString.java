package Leetcode;

public class FindTheIndexOfTheFirstOccurrenceInAString {
    public static void main(String...Args){
        String haystack = "a";
        String needle = "a";
        System.out.println(strStr(haystack, needle));

    }
    static int strStr(String haystack, String needle){
        int LengthOfNeedle = needle.length();
        int LengthOfHaystack = haystack.length();
        if(LengthOfNeedle==0 || LengthOfHaystack<LengthOfNeedle){
            return -1;
        }
        for (int i=0; i<LengthOfHaystack-LengthOfNeedle+1;i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                if(haystack.substring(i,i+LengthOfNeedle).equals(needle)){
                    return i;
                }
            }

        }
        return -1;
    }
}
