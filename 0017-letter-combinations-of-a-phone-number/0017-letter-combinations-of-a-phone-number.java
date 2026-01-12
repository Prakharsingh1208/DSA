class Solution {

    public void helper(String combination, String digits,HashMap<String, String> map,List<String> output) {

        if (digits.isEmpty()) {
            output.add(combination);
            return;
        }

        String letters = map.get(Character.toString(digits.charAt(0)));

        for (char ch : letters.toCharArray()) {
            helper(combination + ch,
                   digits.substring(1),
                   map,
                   output);
        }
    }

    public List<String> letterCombinations(String digits) {

        if (digits.isEmpty()) return new ArrayList<>();

        HashMap<String, String> keyboard = new HashMap<>();
        keyboard.put("2", "abc");
        keyboard.put("3", "def");
        keyboard.put("4", "ghi");
        keyboard.put("5", "jkl");
        keyboard.put("6", "mno");
        keyboard.put("7", "pqrs");
        keyboard.put("8", "tuv");
        keyboard.put("9", "wxyz");

        List<String> output = new ArrayList<>();
        helper("", digits, keyboard, output);
        return output;
    }
}