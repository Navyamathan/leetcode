class Solution 
{
    public boolean containsNearbyDuplicate(int[] nums, int k) 
    {
       for(int i=0; i<nums.length; i++)
       {
        int temp = i+1;
        while(temp < nums.length && Math.abs(i-temp) <= k)
        {
            if(nums[i] == nums[temp]) return true;
            temp++;
        }
       }
       return false;
    }
}