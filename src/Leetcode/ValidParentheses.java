package Leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] Args){
        System.out.println(isValid("([)]"));
    }

    static boolean isValid(String s){
        Stack<String> stack = new Stack<>();
        String openBrackets = "({[";
        HashMap<String,String> m = new HashMap<>(Map.of(
                ")", "(",
                "}", "{",
                "]", "["
        ));

        for(int i =0;i<s.length();i++){
            String c= String.valueOf(s.charAt(i));
            if (openBrackets.contains(c)){
                stack.push(c);
            }else {
                if(stack.isEmpty()){
                    return false;
                } else if (stack.peek().equals(m.get(c))) {
                    stack.pop();
                }else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
        //heloow world
    }
}
