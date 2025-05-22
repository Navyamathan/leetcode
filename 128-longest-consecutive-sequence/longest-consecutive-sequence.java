class Solution 
{
    public int longestConsecutive(int[] nums) 
    {
        // if(nums.length == 0)
        // {
        //     return 0;
        // }
        HashSet<Integer> set = new HashSet<>();
        int max = 0;
        for(int temp : nums)
        {
            set.add(temp);
        }
        for(int temp : set)
        {
            if(!set.contains(temp + 1))
            {
                int count = 1;
                int value = temp;
                while(set.contains(value - 1))
                {
                    value -= 1;
                    count++;
                }
                max = Math.max(max,count);
            }
        }
        return max;
    }
}