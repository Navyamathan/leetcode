class Solution 
{
    public boolean divideArray(int[] nums) 
    {
        int[] values = new int[501];
        for(int i=0; i<nums.length; i++)
        {
            values[nums[i]]++;
        }
        for(int num : nums)
        {
            if(values[num]%2 != 0)
            {
                return false;
            }
        }
        return true;
    }
}