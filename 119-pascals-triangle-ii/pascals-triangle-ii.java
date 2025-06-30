class Solution 
{
    public List<Integer> getRow(int rowIndex) 
    {
        rowIndex += 1;
        ArrayList<Integer> list= new ArrayList<>();
        long val = 1;
        list.add((int)val);
        for(int i=1; i<rowIndex; i++)
        {
            val = val*(rowIndex-i);
            val = val/i;
            list.add((int)val);
        }
        return list;
    }
}