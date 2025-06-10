class Solution 
{
    public int splitArray(int[] nums, int k) 
    {
        int l = nums[0];
        int h = 0;
        for(int temp : nums)
        {
            l = Math.max(l,temp);
            h += temp;
        }

        while(l <= h)
        {
            int m = (l+h)/2;
            if(calculation(nums, k, m))
            {
                l = m+1;
            }
            else
            {
                h = m-1;
            }
        }
        return l;
    }

    public boolean calculation(int[] nums, int k, int m)
    {
        int count = 1;
        int sum = 0;
        for(int temp : nums)
        {
            if(sum + temp <= m)
            {
                sum += temp;
            }
            else
            {
                count++;
                sum = temp;
            }
        }
        if(count > k)
        {
            return true;
        }
        return false;
    }
}