class Solution 
{
    public int findKthPositive(int[] arr, int k) 
    {
        int n = arr.length;
        int l = 0;
        int h = n-1;
        while(l <= h)
        {
            int m = (l+h)/2;
            int missing = arr[m] - (m+1);
            if(missing < k)
            {
                l = m+1;
            }
            else
            {
                h = m-1;
            }
        }
        return k+h+1;
    }
}