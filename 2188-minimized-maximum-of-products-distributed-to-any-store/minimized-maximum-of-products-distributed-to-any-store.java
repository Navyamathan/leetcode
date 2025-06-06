class Solution 
{
    public int minimizedMaximum(int n, int[] quantities)
    {
        if(n == 1)
        {
            return quantities[0];
        }     

        int l = 1;
        int h = Integer.MIN_VALUE;
        for(int temp : quantities)
        {
            h = Math.max(h,temp);
        }
        while(l <= h)
        {
            int m = (l+h)/2;
            int count = calculation(quantities,m);
            if(count <= n)
            {
               h = m-1;
            }
            else
            {
                l = m+1;
            }
        }
        return l;
    }

    public int calculation(int[] q, int m)
    {
        int count = 0;
        for(int temp : q)
        {
            count += Math.ceil((double)temp / (double) m);
        }
        return count;
    }
}