class Solution 
{
    public int countPairs(List<Integer> nums, int target) 
    {
        int n = nums.size();
        int[] num = new int[n];
        for(int i=0; i<n; i++)
        {
            num[i] = nums.get(i);
        }
        
        int count = 0;
        for(int i=0; i<n; i++)
        {
            for(int j =i+1; j<n; j++)
            {
                if(num[i]+num[j] < target)
                {
                    count++;
                }
            }
        }
        return count;
    }
}