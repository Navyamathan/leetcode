class Solution 
{
    public int countHillValley(int[] nums) 
    {
        int count = 0;

        ArrayList<Integer> list = new ArrayList<>();
        list.add(nums[0]);
        for(int i=1; i<nums.length; i++)
        {
            if(nums[i-1] != nums[i])
            {
                list.add(nums[i]);
            }
        }

        for(int i=1; i<list.size()-1; i++)
        {
            int curt = list.get(i);
            int prev = list.get(i-1);
            int next = list.get(i+1);
            if(curt > prev && curt > next) count++;
            else if(curt < prev && curt < next) count++;
        }
        return count;
    }
}