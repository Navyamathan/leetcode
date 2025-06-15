class Solution 
{
    public int thirdMax(int[] nums) 
    {
        long min = Long.MIN_VALUE;
        long max1 = min;
        long max2 = min;
        long max3 = min;
        for(int temp : nums)
        {
            if(temp > max1)
            {
                max3 = max2;
                max2 = max1;
                max1 = temp;
            }
            else if(temp > max2 && max1 != temp)
            {
                max3 = max2;
                max2 = temp;
            }
            else if(temp > max3 && max1 != temp && max2 != temp)
            {
                max3 = temp;
            }
        }
        if(max3 == min)
        {
            return (int) max1;
        }
        return (int) max3;
    }
}