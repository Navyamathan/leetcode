class Solution 
{
    public int shipWithinDays(int[] weights, int days) 
    {
       int max = Integer.MIN_VALUE;
       int sum = 0;
       for(int temp : weights)
       {
        max = Math.max(max,temp);
        sum += temp;
       }
       int l = max;
       int h = sum;
       while(l <= h)
       {
        int m = (l+h)/2;
        int calculatedDays = findDay(weights, m);
        if(calculatedDays <= days)
        {
            h = m-1;
        }
        else
        {
            l = m+1;
        }
       }
       return l;
    }

    public int findDay(int[] w, int m)
    {
        int count = 1;
        int sum = 0;
        for(int temp : w)
        {
            if(sum + temp > m)
            {
                count++;
                sum = temp;
            }
            else
            {
                sum += temp;
            }
        }
        return count;
    }
}