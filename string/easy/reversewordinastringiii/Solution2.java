package string.easy.reversewordsinastringiii;

import java.util.ArrayList;

public class Solution2 {
   public String reverseWords(String s) {
      String[] words = split(s);
      StringBuilder res = new StringBuilder();
         for (String w : words) {
            res.append(reverse(w) + " "); 
         }
        return res.toString().trim();
   }
   String[] split(String s) {
      ArrayList < String > words = new ArrayList< String > ();
      StringBuilder word = new StringBuilder();
      for (int i = 0; i < s.length(); i++) {
          if (s.charAt(i) == ' ') {
              words.add(word.toString());
              word = new StringBuilder();
          }
          else
              word.append(s.charAt(i));
      }
      words.add(word.toString());//the last word
      return words.toArray(new String[words.size()]);
   }
   String reverse(String word) {
       StringBuilder rWord = new StringBuilder();
       for (int i = 0; i < word.length(); i++) {
           rWord.insert(0, word.charAt(i));
       }
       return rWord.toString();
   }

   public static void main(String[] args) {
        String test = "this is a holiday's test";
        Solution2 s = new Solution2();
        System.out.println(test);
        System.out.println(s.reverseWords(test));
   }
}
