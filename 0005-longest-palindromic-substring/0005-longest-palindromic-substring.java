class Solution {
    public String longestPalindrome(String s) {
        if (s.length() <= 1) return s;

        String lp1 = "";

        for (int i = 0; i < s.length(); i++) {

            // EVEN palindrome
            int l = i, r = i + 1;
            String dummy = "";
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                dummy = s.charAt(l) + dummy + s.charAt(r);
                l--;
                r++;
            }
            if (dummy.length() > lp1.length()) lp1 = dummy;

            // ODD palindrome
            l = i - 1;
            r = i + 1;
            String dummy2 = Character.toString(s.charAt(i));
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                dummy2 = s.charAt(l) + dummy2 + s.charAt(r);
                l--;
                r++;
            }
            if (dummy2.length() > lp1.length()) lp1 = dummy2;
        }

        return lp1;
    }
}
