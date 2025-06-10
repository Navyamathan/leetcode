class Solution 
{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int i=0,j=0;
        int n = n1+n2;
        int length2 = n/2;
        int length1 = length2-1;
        int element1 = -1;
        int element2 = -1;
        int count = 0;
        while(i < n1 && j < n2)
        {
            if(nums1[i] < nums2[j])
            {
                if(length1 == count) element1 = nums1[i];
                if(length2 == count) element2 = nums1[i];
                i++;
                count++;
            }
            else
            {
                if(length1 == count) element1 = nums2[j];
                if(length2 == count) element2 = nums2[j];
                j++;
                count++;
            }
        }
        while(i < n1)
        {
            if(length1 == count) element1 = nums1[i];
            if(length2 == count) element2 = nums1[i];
            i++;
            count++;
        }
        while(j < n2)
        {
            if(length1 == count) element1 = nums2[j];
            if(length2 == count) element2 = nums2[j];
            j++;
            count++;
        }

        if(n%2 == 1)
        {
            return (double) element2;
        }

        return (double) ((double) (element1 + element2)) / 2.0;
    }
}