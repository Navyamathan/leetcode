class Solution 
{
    public int maxProduct(int[] nums) 
    {
        int max = Integer.MIN_VALUE;
        int n = nums.length-1;
        int prefix = 1;
        int suffix = 1;
        for(int i=0; i<=n; i++)
        {
            if(prefix == 0)
            {
                prefix = 1;
            }
            if(suffix == 0)
            {
                suffix = 1;
            }
            prefix *= nums[i];
            suffix *= nums[n-i];
            max = Math.max(max,Math.max(prefix,suffix));
        }
        return max;
    }
}