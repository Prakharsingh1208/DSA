class Solution {
    HashMap<Integer,Integer> map = new HashMap<>(); 
    public int climbStaisHelper(int n){
        if(n==2){
            return 2;
        }else if(n==0 || n==1){
            return 1;
        }

        if(map.containsKey(n)) return map.get(n);

        map.put(n,climbStaisHelper(n-1)+climbStaisHelper(n-2));
        return map.get(n);
    }

    public int climbStairs(int n) {
        return climbStaisHelper(n);
    }
}