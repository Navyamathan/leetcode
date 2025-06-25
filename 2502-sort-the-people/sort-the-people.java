class Solution 
{
    public String[] sortPeople(String[] names, int[] heights) 
    {
        Integer[] identities = new Integer[names.length];
        for(int i=0; i<names.length; i++)
        {
            identities[i] = i;
        }

       Arrays.sort(identities, (a,b) -> heights[b] - heights[a]);

       String[] result = new String[names.length];
       for(int i=0; i<names.length; i++)
       {
        result[i] = names[identities[i]];
       }

       return result;
    }
}