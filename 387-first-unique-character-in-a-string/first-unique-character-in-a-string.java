class Solution 
{
    public int firstUniqChar(String s) 
    {
        if(s.length() == 1) return 0;
        for(int i=0; i<=s.length()-1; i++)
        {
            String ch = String.valueOf(s.charAt(i));
            String temp = "";
            if(i == 0)
            {
                temp = s.substring(i+1);
            }
            else if(i == s.length()-1)
            {
                temp = s.substring(0,i);
            }
            else
            {
                temp = s.substring(0,i) + s.substring(i+1);
            }
            
            if(!temp.contains(ch))
            {
                return i;
            }
        }
        return -1;
    }
}