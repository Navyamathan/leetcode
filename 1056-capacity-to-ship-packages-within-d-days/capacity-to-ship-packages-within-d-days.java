class Solution 
{
    public int shipWithinDays(int[] weights, int days) 
    {
       int l = Integer.MIN_VALUE;
       int h = 0;
       for(int temp : weights)
       {
        l = Math.max(l,temp);
        h += temp;
       }
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
        int day = 1;
        int sum = 0;
        for(int temp : w)
        {
            if(sum + temp > m)
            {
                day++;
                sum = temp;
            }
            else
            {
                sum += temp;
            }
        }
        return day;
    }
}