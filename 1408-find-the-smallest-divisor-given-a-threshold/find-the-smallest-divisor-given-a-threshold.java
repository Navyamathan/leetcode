class Solution 
{
    public int smallestDivisor(int[] nums, int threshold) 
    {
        int max = findMax(nums);
        int ans = 0;
        int l = 1;
        int h = max;
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

    public int findMax(int[] nums)
    {
        int max = nums[0];
        for(int i=1; i<nums.length; i++)
        {
            max = Math.max(max,nums[i]);
        }
        return max;
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