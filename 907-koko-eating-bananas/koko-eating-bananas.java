class Solution 
{
    public int minEatingSpeed(int[] piles, int k) 
    {
        int n = piles.length;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++)
        {
            max = Math.max(max,piles[i]);
        }
        int l = 1;
        int h = max;
        while(l <= h)
        {
            int m = (l+h)/2;
            int total = calculation(piles,m);
            if(total <= k)
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

    public int calculation(int[] arr, int m)
    {
        int total = 0;
        for(int i=0; i<arr.length; i++)
        {
            total += Math.ceil((double) arr[i] / (double) m);
        }
        return total;
    }
}