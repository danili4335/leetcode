package string.easy.reversestring;

class Solution1 {
   public String reverseString(String s) {
      char[] word = s.toCharArray();      
      int i = 0;
      int j = s.length() -1;
      char temp;
      while (i < j) {
          temp = word[i];
          word[i] = word[j];
          word[j] = temp;
          i++;
          j--;
      }
      return new String(word);
   }

   public static void main(String[] args) {
       Solution1 s = new Solution1();
       System.out.println("Reverse string \'This's\' is: " +  s.reverseString("This's"));
   }
}
