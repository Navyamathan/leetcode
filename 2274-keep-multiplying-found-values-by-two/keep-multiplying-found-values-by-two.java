class Solution 
{
    public int findFinalValue(int[] nums, int original) 
    {
        Arrays.sort(nums);
        int index = 0;
        while(true)
        {
            boolean found = false;
            for(int i=index; i<nums.length; i++)
            {
                if(nums[i] == original)
                {
                    index = i;
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