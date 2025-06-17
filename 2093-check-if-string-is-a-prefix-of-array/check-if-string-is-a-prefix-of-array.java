class Solution 
{
    public boolean isPrefixString(String s, String[] words) 
    {
        int n = s.length();
        int i = 0;
        boolean found = false;
        for(String temp : words)
        {
            if(i+temp.length() > n)
            {
                System.out.println(i);
                break;
            }
            if(!temp.contains(s.substring(i,i+temp.length())))
            {
                return false;
            }
            else
            {
                found = true;
            }
            i = i+temp.length();
        }
        if(i < n)
        {
            return false;
        }
        return found;
    }
}