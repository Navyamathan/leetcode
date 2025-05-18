class Solution 
{
    public int firstMissingPositive(int[] nums) 
    {
        Arrays.sort(nums);
        for(int i=0; i<nums.length-1; i++)
        {
            if(nums[i] == nums[i+1])
            {
                nums[i] = 0;
            }
        } 
        
        int num = 1;
       for(int i=0; i<=nums.length; i++)
       {
        if(i==nums.length)
        {
            return num;
        }
        if(nums[i] <= 0)
        {
            continue;
        }
        else
        {
            if(nums[i] != num)
            {
                return num;
            }
            num++;
        }
       }
       return 0;
    }
}