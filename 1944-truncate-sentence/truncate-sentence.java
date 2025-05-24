class Solution {
    public String truncateSentence(String s, int k) 
    {
        String temp = "";
        int count = 1;
        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch == ' ')
            {
                if(count == k)
                {
                    break;
                }
                temp = temp+String.valueOf(ch);
                count++;
            }
            else
            {
                temp = temp+String.valueOf(ch);
            }
        }
        return temp;
    }
}