class Solution 
{
    public int maximumCandies(int[] candies, long k) 
    {
        long sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<candies.length; i++)
        {
            sum += candies[i];
            max = Math.max(max,candies[i]);
        }

        if(sum < k)
        {
            return 0;
        }

        int l = 1;
        int h = max;
        int ans = 0;
        while(l <= h)
        {
            int m =(l+h)/2;
            long total = calculation(candies,m);
            if(total >= k)
            {
                ans = m;
                l = m+1;
            }
            else
            {
                h = m-1;
            }
        }
        return ans;
    }

    public long calculation(int[] arr, int m)
    {
        long total = 0;
        for(int i=0; i<arr.length; i++)
        {
            total +=  arr[i] / m;
        }
        return total;
    }
}