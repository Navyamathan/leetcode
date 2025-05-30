class Solution 
{
    public int binarySearch(int[] nums, int l, int h, int target)
    {
        if(l > h)
        {
            return -1;
        }
        int m = (l + h)/2;

        if(nums[m] == target) return m;
        else if(nums[m] < target) l = m+1;
        else h = m-1;

        return binarySearch(nums, l, h, target);
    }

    public int search(int[] nums, int target) 
    {
        return binarySearch(nums, 0, nums.length-1, target);
    }
}