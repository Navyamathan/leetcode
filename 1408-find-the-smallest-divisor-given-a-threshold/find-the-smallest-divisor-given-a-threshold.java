class Solution 
{
    public int smallestDivisor(int[] nums, int threshold) 
    {
        int ans = 0;
        int l = 1;
        int h = 1000000;
        while(l <= h)
        {
            int m = l+(h-l)/2;
            long sum = sumOfDigit(nums, m);
            if(sum <= threshold)
            {
                 ans = m;
                h = m-1;
            }
            else
            {
               l = m+1;
            }
        }
        return ans;
    }

    public long sumOfDigit(int[] nums, int m)
    {
        long sum = 0;
        for(int temp : nums)
        {
            sum += (temp-1) / m+1;
        }
        return sum;
    }
}