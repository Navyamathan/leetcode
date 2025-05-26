class Solution 
{
    public List<List<Integer>> generate(int numRows) 
    {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=1; i<=numRows; i++)
        {
            list.add(generateRow(i));
        }
        return list;
    }

    public List<Integer> generateRow(int row)
    {
        ArrayList<Integer> list = new ArrayList<>();
        int ans = 1;
        list.add(ans);
        for(int i=1; i<row; i++)
        {
            ans = ans * (row-i);
            ans = ans/i;
            list.add(ans);
        }
        return list;
    }
}