class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        List<Character> list = new ArrayList<>();
        for(char i:s.toCharArray()){
            if((i>='a'&&i<='z')||(i>='0'&&i<='9')){
                list.add(i);
            }
        }

        int left=0;
        int right=list.size()-1;
        while(left<right){
            if(list.get(left)!=list.get(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}