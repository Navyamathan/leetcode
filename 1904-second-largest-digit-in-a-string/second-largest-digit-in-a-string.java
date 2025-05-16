class Solution 
{
    public int secondHighest(String s) 
    {
        
        int fr = -1;
        int sc = -1;

        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if(Character.isDigit(ch))
            {
                int temp = Character.getNumericValue(ch);
                if(temp == fr)
                {
                    continue;
                }
                if(fr < temp)
                {
                    sc = fr;
                    fr = temp;
                }
                else
                {
                    sc = Math.max(temp,sc);
                }
            }
        }
        return sc;
    }
}