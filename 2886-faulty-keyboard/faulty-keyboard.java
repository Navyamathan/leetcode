class Solution 
{
    public String finalString(String s) 
    {
        char[] ch = new char[s.length()];
        int n = s.length();
       int index = 0;
        for(char temp : s.toCharArray())
        {
            if(temp == 'i')
            {
                reverse(ch,0,index-1);
            }
            else
            {
                ch[index] = temp;
                index++;
            }
        }
        return new String(ch,0,index);
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