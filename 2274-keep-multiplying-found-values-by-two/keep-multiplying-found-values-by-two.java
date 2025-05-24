class Solution 
{
    public int findFinalValue(int[] nums, int original) 
    {
        while(true)
        {
            boolean found = false;
            for(int i=0; i<nums.length; i++)
            {
                if(nums[i] == original)
                {
                    found = true;
                    break;
                }
            }
            if(found)
            {
                original = original * 2;
            }
            else
            {
                break;
            }
        }
        return original;
    }
}