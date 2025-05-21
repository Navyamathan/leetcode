class Solution 
{
    public int majorityElement(int[] nums) 
    {
        //Moorse's algorithm
        int el = nums[0];
        int cnt = 1;
        for(int i=1; i<nums.length; i++)
        {
            if(cnt == 0)
            {
                el = nums[i];
                cnt = 1;
            }
            else if(nums[i] == el)
            {
                cnt++;
            }
            else
            {
                cnt--;
            }
        }
        return el;
    }
}