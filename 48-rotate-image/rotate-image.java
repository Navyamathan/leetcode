class Solution
{
    public void rotate(int[][] matrix) 
    {
        for(int i=0; i<matrix.length; i++)
        {
            for(int j=i; j<matrix.length-1; j++)
            {
                int temp = matrix[i][j+1];
                matrix[i][j+1] = matrix[j+1][i];
                matrix[j+1][i] = temp;
            }
        }
        for(int i=0; i<matrix.length; i++)
        {
            reverse(matrix,i);
        }
    }
    public void reverse(int[][] matrix, int index)
    {
        int s = 0;
        int e = matrix.length-1;
        while(s < e)
        {
            int temp = matrix[index][s];
            matrix[index][s] = matrix[index][e];
            matrix[index][e] = temp;
            s++;
            e--;
        }
    }
}