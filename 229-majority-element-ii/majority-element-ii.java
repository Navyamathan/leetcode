class Solution 
{
    public List<Integer> majorityElement(int[] nums) 
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        int length = nums.length/3 + 1;
        for(int i=0; i<nums.length; i++)
        {
            if(!map.containsKey(nums[i]))
            {
                map.put(nums[i],1);
                int count = map.get(nums[i]);
                if(count == length)
                {
                    list.add(nums[i]);
                }
                else if(count <= length+1)
                {
                    continue;
                }
            }
            else
            {
                map.put(nums[i], map.get(nums[i])+1);
                int count = map.get(nums[i]);
                if(count == length)
                {
                    list.add(nums[i]);
                }
                else if(count <= length+1)
                {
                    continue;
                }
            }
        }
        return list;
    }
}