class Solution 
{
    public int[] rowAndMaximumOnes(int[][] mat) 
    {
        int maxCount = -1;
        int index = -1;
        for(int i=0; i<mat.length; i++)
        {
            int count = 0;
            for(int j = 0; j<mat[i].length; j++)
            {
                count += mat[i][j];
            }
            if(count > maxCount)
            {
                maxCount = count;
                index = i;
            }
        }
        return new int[] {index,maxCount};
    }
}