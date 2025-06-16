class Solution 
{
    public String reverseWords(String s) 
    {
       char[] ch = s.toCharArray();
       int start = 0;
       int end = 0;
       while(end < s.length())
       {
        if(ch[end] == ' ')
        {
            reverse(ch, start, end-1);
            start = end+1;
        }
        end++;
       }
       reverse(ch, start,s.length()-1);
       return new String(ch);
    }

    public void reverse(char[] ch, int start, int end)
    {
        while(start < end)
        {
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
    }
}