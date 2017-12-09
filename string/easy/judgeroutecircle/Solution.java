package string.easy.judgeroutecircle;

public class Solution {
    boolean judgeCircle(String route) {
        int x=0;
        int y=0;
        for (char c : route.toCharArray()) {
            if (c == 'L') x--;
            else if (c == 'R') x++;    
            else if (c == 'U') y++;
            else if (c == 'D') y--;
        }
        return (x == 0) && (y == 0);
    }
    
    public static void main (String[] args) {
        String test = "LRUD";
        Solution s = new Solution();
        System.out.println("Is " + "\"" + test + "\" a route circle: " +  s.judgeCircle(test));
    }
}
