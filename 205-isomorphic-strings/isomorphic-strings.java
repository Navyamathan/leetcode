class Solution 
{
    public boolean isIsomorphic(String s, String t) 
    {
        if(s.length() != t.length())
        {
            return false;
        }
        int[] arrayS = new int[128];
        int[] arrayT = new int[128];

        for(int i=0; i<s.length(); i++)
        {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            if(arrayS[ch1] != arrayT[ch2])
            {
                return false;
            }
            arrayS[ch1] = i+1;
            arrayT[ch2] = i+1;
        }
        return true;
    }
}