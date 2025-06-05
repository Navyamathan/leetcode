class Solution 
{
    public int smallestDivisor(int[] nums, int threshold) 
    {
        int ans = 0;
        int l = 1;
        int h = 1000000;
        while(l <= h)
        {
            int m = (l+h)/2;
            int sum = sumOfDigit(nums, m);
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
    
    public int sumOfDigit(int[] nums, int m)
    {
        int sum = 0;
        for(int temp : nums)
        {
            sum += Math.ceil((double) temp / (double) m);
        }
        return sum;
    }
}