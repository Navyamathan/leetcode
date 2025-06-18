class Solution 
{
    public int findNonMinOrMax(int[] nums) 
    {
        if(nums.length < 3)
        {
            return -1;
        }
        int min = Math.min(nums[0],nums[1]);
        int max = Math.max(nums[0],nums[1]);
        int extra = nums[2];
        if(extra < min)
        {
            return min;
        }
        else if( extra > max)
        {
            return max;
        }
        return extra;
    }
}