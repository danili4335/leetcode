package string.easy.reversestring;

class Solution {
    public String reverseString(String s) {
        StringBuilder rs = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            rs.insert(0, s.charAt(i));
        }
        return rs.toString();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println("Reverse string \"Sunday\": " + s.reverseString("Sunday"));
    }
}
