class Solution 
{
    public int maxProduct(int n) 
    {
        String s = String.valueOf(n);
        int max = Integer.MIN_VALUE;
        int sec = Integer.MIN_VALUE;
        for(int i=0; i<s.length(); i++)
        {
            int temp = s.charAt(i) - '0';
            if(max < temp)
            {
                sec = max;
                max = temp;
            }
            else
            {
                if(sec < temp)
                {
                    sec = temp;
                }
            }
        }
        return max*sec;
    }
}