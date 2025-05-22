class Solution 
{
    public String shiftingLetters(String s, int[] shifts) 
    {
       char[] ch = s.toCharArray();
       int sum = 0;
       for(int i=shifts.length-1; i>=0; i--)
       {
        sum = (sum + shifts[i]) % 26;
        ch[i] = (char) ('a' + (ch[i] - 'a' + sum) % 26);
       }
       return new String(ch);
    }
}




//   long maxofi = 0;
//         char[] chars = s.toCharArray();
//         for (int i = shifts.length - 1; i >= 0; i--) {
//             maxofi += shifts[i];
//             chars[i] = (char) 
//             ('a' + (chars[i] - 'a' + maxofi) % 26);
//         }
//         return new String(chars);