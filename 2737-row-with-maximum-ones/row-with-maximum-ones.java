class Solution 
{
    public int[] rowAndMaximumOnes(int[][] mat) 
    {
        int maxCount = -1;
        int index = -1;
        for(int i=0; i<mat.length; i++)
        {
            int count = countOfOnes(mat[i]);
            if(count > maxCount)
            {
                maxCount = count;
                index = i;
            }
        }
        return new int[] {index,maxCount};
    }

    public int countOfOnes(int[] arr)
    {
        int count = 0;
        for(int temp : arr)
        {
            if(temp == 1)
            {
                count++;
            }
        }
        return count;
    }
}