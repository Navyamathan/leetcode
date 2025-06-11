class Solution 
{
    public String longestCommonPrefix(String[] strs) 
    {
        int min = Integer.MAX_VALUE;
        String result = "";
        for(String temp : strs)
        {
            min = Math.min(min,temp.length());
        }
        for(int i=0; i<min; i++)
        {
            boolean found = true;
            String temp = strs[0].substring(0,i+1);
            for(String s : strs)
            {
                if(!s.substring(0,i+1).equals(temp))
                {
                    found = false;
                    break;
                }
            }
            if(found)
            {
                result = temp;
            }
            else
            {
                return result;
            }
        }
        return result;
    }
}