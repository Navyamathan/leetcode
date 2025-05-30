class Solution 
{
    public int searchInsert(int[] arr, int target) 
    {
        int l = 0;
        int h = arr.length-1;
        int ans = arr.length;
        
        while(l <= h)
        {
            int m = (l+h)/2;
            if(arr[m] >= target)
            {
                ans = m;
                h = m-1;
            }
            else
            {
                l = m+1;
            }
        }
        return ans;
    }
}