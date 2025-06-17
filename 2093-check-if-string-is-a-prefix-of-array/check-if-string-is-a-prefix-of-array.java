class Solution 
{
    public boolean isPrefixString(String s, String[] words) 
    {
        String str = "";
        for(String temp : words)
        {
            str += temp;
            if(s.equals(str))
            {
                return true;
            }
        }
        return false;
    }
}