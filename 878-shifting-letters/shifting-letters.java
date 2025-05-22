class Solution 
{
    public String shiftingLetters(String s, int[] shifts) 
    {
       char[] ch = s.toCharArray();
       int sum = 0;
       for(int i=ch.length-1; i>=0; i--)
       {
        sum = (sum + shifts[i])%26;
        ch[i] = (char) ('a' + (sum + ch[i] - 'a') % 26);
       }
       return new String(ch);
    }
}