class Solution 
{
    public int countKDifference(int[] nums, int k) 
    {
        Arrays.sort(nums);
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums)
        {
            if(map.containsKey(num-k))
            {
                count += map.get(num-k);
            }
            else if(map.containsKey(num+k))
            {
                count += map.get(num+k);
            }
                if(map.containsKey(num))
                {
                    map.put(num,map.get(num)+1);
                }
                else
                {
                    map.put(num,1);
                }
        }
        return count;
    }
}