class Solution 
{
    public int mySqrt(int x) 
    {
        if(x == 0) return 0;

       int l = 1;
        int h = x;
        while(l <= h)
        {
            int m = l+(h-l) / 2;
            long sq = (long) m*m;
            if(sq == (long) x)
            {
                return m;
            }
            else if(sq <(long) x)
            {
                l = m+1;
            }
            else
            {
                h = m-1;
            }
        }
        return h;
    }
}