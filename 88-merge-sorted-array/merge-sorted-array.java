class Solution 
{
    public void merge(int[] nums1, int m, int[] nums2, int n) 
    {
        int len = m+n;
        int gap = (len/2)+(len%2);
        while(gap > 0)
        {
            int left = 0;
            int right = left+gap;
            while(right < len)
            {
                if(left < m && right >= m)
                {
                    swap(nums1,left, nums2, right-m);
                }
                else if(left >= m)
                {
                    swap(nums2, left-m, nums2, right-m);
                }
                else
                {
                    swap(nums1, left, nums1, right);
                }
                left++;
                right++;
            }
            if(gap == 1)
            {
                break;
            }
            gap = (gap/2)+(gap%2);
        }

        for(int i=m,j=0; i<nums1.length; i++,j++)
        {
            nums1[i] = nums2[j];
        }
    }

    public void  swap(int[] arr1, int i1, int[] arr2, int i2)
    {
        if(arr1[i1] >= arr2[i2] )
        {
            int temp = arr1[i1];
            arr1[i1] = arr2[i2];
            arr2[i2] = temp;
        }
    }
}