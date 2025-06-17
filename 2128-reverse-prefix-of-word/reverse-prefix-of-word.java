class Solution 
{
    public String reversePrefix(String word, char c) 
    {
        char[] ch = new char[word.length()];
        int index = 0;
        boolean found = false;
        for(char temp : word.toCharArray())
        {
            ch[index] = temp;
            index++;

            if(temp == c && !found)
            {
                reverse(ch, 0, index-1);
                found = true;
            }
        }
        return new String(ch);
    }

    public void reverse(char[] ch, int s, int e)
    {
        while(s < e)
        {
            char temp = ch[s];
            ch[s] = ch[e];
            ch[e] = temp;
            s++;
            e--;
        }
    }
}