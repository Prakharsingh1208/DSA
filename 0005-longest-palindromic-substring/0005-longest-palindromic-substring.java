class Solution {
    public String longestPalindrome(String s) {
        String lp1 = "";
        if(s.length()==1){
            return s;
        }
        for(int i=0; i<s.length()-1;i++){
            int l=i;
            int r=i+1;
            int lenP=0;
            String dummy ="";
            String dummy2 ="";
            if(s.charAt(i)==s.charAt(i+1)){
                dummy = Character.toString(s.charAt(i))+Character.toString(s.charAt(i+1));
                while(l-1>=0 && r+1<s.length()){
                    String a=Character.toString(s.charAt(l-1));
                    String b=Character.toString(s.charAt(r+1));
                    if(a.equals(b)){
                        l--;
                        r++;
                        dummy = a+dummy+b;
                    }else{
                        break;
                    }
                }
            }
            l=i-1;
            r=i+1;
            dummy2 =Character.toString(s.charAt(i));
            while(l>=0 && r<s.length()){
                String a=Character.toString(s.charAt(l));
                String b=Character.toString(s.charAt(r));
                if(a.equals(b)){
                    l--;
                    r++;
                    dummy2 = a+dummy2+b;
                }else{
                    break;
                }
            }
            if(dummy.length()>lp1.length()){
                lp1=dummy;
            }
            if(dummy2.length()>lp1.length()){
                lp1=dummy2;
            }
        }
        return lp1;
    }
}