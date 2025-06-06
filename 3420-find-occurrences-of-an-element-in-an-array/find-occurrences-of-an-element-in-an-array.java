class Solution 
{
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) 
    {
       ArrayList<Integer> list = new ArrayList<>();
       for(int i=0; i<nums.length; i++)
       {
        if(nums[i] == x)
        {
            list.add(i);
        }
       }
       int[] result = new int[queries.length];
       for(int i=0; i<queries.length; i++)
       {
        if(queries[i] <= list.size())
        {
            result[i] = list.get(queries[i]-1);
        }
        else
        {
            result[i] = -1;
        }
       }
       return result;
    }
}