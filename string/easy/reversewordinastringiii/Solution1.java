package string.easy.reversewordsinastringiii;

public class Solution1 {
    public String reverseWords(String s) {
        String words[] = s.split(" ");
        StringBuilder res = new StringBuilder();
        for (String w : words) {
            res.append(new StringBuffer(w).reverse().toString() + " "); 
        } 
        return res.toString().trim();
   }

   public static void main(String[] args) {
        String test = "this is a holiday's test";
        Solution2 s = new Solution2();
        System.out.println(test);
        System.out.println(s.reverseWords(test));
   }
}
