class Solution 
{
    public boolean areAlmostEqual(String s1, String s2) 
    {
        if(s1.equals(s2))
        {
            return true;
        }
        int change1 = -1;
        int change2 = -1;
        int count = 0;
        for(int i=0; i<s1.length(); i++)
        {
            if(s1.charAt(i) != s2.charAt(i))
            {
                if(change1 != -1)
                {
                    change2 = i;
                }
                else
                {
                    change1 = i;
                }
                count++;
            }
        }
        if(count > 2 || count < 2)
        {
            return false;
        }
        if(s1.charAt(change1) == s2.charAt(change2) && s1.charAt(change2) == s2.charAt(change1))
        {
            return true;
        }
        return false;
    }
}