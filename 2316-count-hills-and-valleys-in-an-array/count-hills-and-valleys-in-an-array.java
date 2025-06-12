class Solution 
{
    public int countHillValley(int[] nums) 
    {
        int count = 0;
        ArrayList<Integer> set = new ArrayList<>();
        set.add(nums[0]);
        for(int i=1; i<nums.length; i++)
        {
            if(nums[i-1] != nums[i])
            {
                set.add(nums[i]);
            }
        }
        for(int i=1; i<set.size()-1; i++)
        {
            if(set.get(i) > set.get(i+1) && set.get(i) > set.get(i-1))
            {
                count++;
            }
            else if(set.get(i) < set.get(i+1) && set.get(i) < set.get(i-1))
            {
                count++;
            }
        }
        return count;
    }
}