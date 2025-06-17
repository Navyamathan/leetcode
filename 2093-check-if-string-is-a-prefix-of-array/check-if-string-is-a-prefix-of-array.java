class Solution 
{
    public boolean isPrefixString(String s, String[] words) 
    {
        String str = "";
        for(String temp : words)
        {
            str += temp;
            if(s.length() == str.length())
            {
                break;
            }
        }
        return s.equals(str);
    }
}