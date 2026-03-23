class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        Stack<Character> stack = new Stack<>();
        for(Character i:s.toCharArray()){
            if(i.equals('(') || i.equals('{') || i.equals('[')){
                stack.push(i);
            }else{
                if(stack.isEmpty()) return false;
                char a = stack.pop();
                if(i==')' && a!='(') return false;
                if(i=='}' && a!='{') return false;
                if(i==']' && a!='[') return false;
            }
        }
        return stack.isEmpty();
    }
}