class Solution 
{
    public int singleNumber(int[] nums) 
    {
        HashMap<Integer,Integer> h = new HashMap<>();

        for(int i=0 ;i<nums.length; i++)
        {
            if(h.containsKey(nums[i]))
            {
                int temp = h.get(nums[i])+1;
                h.put(nums[i],temp);
            }
            else
            {
                h.put(nums[i],1);
            }
        }

        for(int temp : h.keySet())
        {
            if(h.get(temp) == 1)
            {
                return temp;
            }
        }
        return 0;
    }
}