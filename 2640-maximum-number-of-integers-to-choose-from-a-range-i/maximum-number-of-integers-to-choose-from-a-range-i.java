class Solution 
{
    public int maxCount(int[] banned, int n, int maxSum) 
    {
        int[] nums = new int[10001];
        for(int i=0; i<banned.length; i++)
        {
            nums[banned[i]] = 1;
        }
        int count = 0;
        int sum = 0;
        for(int i=1; i<=n; i++)
        {
            if(nums[i] == 1)
            {
                continue;
            }
            sum += i;
            if(sum > maxSum)
            {
                return count;
            }
            count++;
        }
        return count;
    }
}