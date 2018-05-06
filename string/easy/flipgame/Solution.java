package string.easy.flipgame;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> generatePossibleNextMoves(String s) {
        ArrayList < String > result = new ArrayList < String > ();
        for (int i = 0; i < s.length() -1; i++) {
            if (s.charAt(i) == '+' && s.charAt(i+1) == '+' ) {
                StringBuilder flip = new StringBuilder(s);
                flip.setCharAt(i, '-');
                flip.setCharAt(i + 1, '-');
                result.add(flip.toString());
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println("Flip game result of +++++-++--+++ :" );
        List<String> test = s.generatePossibleNextMoves("+++++-++--+++");
        for (String w : test) {
            System.out.println(w);
        }
    }
}
