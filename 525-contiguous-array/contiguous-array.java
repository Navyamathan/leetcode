class Solution 
{
    public int findMaxLength(int[] nums) 
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        int zero = 0;
        int one = 0;
        int max = 0;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] == 1)
            {
                one++;
            }
            else
            {
                zero++;
            }
            
            if(map.containsKey(one-zero))
            {
                max = Math.max(max, i-map.get(one-zero));
            }
            else if(one == zero)
            {
                max = Math.max(max,i+1); 
            }
            else
            {
                map.put(one-zero,i);
            }
        }
        return max;
    }
}