class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        int j = nums.length-1;
       for(int i=0; i<nums.length; i++)
       {
        int temp = target - nums[i];
        if(map.containsKey(temp))
        {
            return new int[] {map.get(temp),i};
        }
        map.put(nums[i],i);
       }
       return new int[] {};
    }
}