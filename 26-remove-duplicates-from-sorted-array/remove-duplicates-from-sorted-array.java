class Solution 
{
    public int removeDuplicates(int[] nums) 
    {
        ArrayList<Integer> list = new ArrayList<>();
        for(int temp : nums)
        {
            if(!list.contains(temp))
            {
                list.add(temp);
            }
        }
        int i=0;
        for(int temp : list)
        {
            nums[i] = temp;
            i++;
        }
        return list.size();
    }
}