class Solution 
{
    public int[][] generateMatrix(int n) 
    {
        int[][] matrix = new int[n][n];
        int top = 0, left = 0;
        int bottom = n-1, right = n-1;
        int value = 1;

        while(top <= bottom && left <= right)
        {
            for(int i=left; i<=right; i++)
            {
                matrix[top][i] = value;
                value++;
            }
            top++;
            for(int i=top; i<=bottom; i++)
            {
                matrix[i][right] = value;
                value++;
            }
            right--;
            if(top <= bottom)
            {
                for(int i=right; i>=left; i--)
                {
                    matrix[bottom][i] = value;
                    value++;
                }
                bottom--;
            }
            if(left <= right)
            {
                for(int i=bottom; i>=top; i--)
                {
                    matrix[i][left] = value;
                    value++;
                }
                left++;
            }
        }
        return matrix;
    }
}