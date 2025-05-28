class Solution 
{
    public int[][] merge(int[][] intervals) 
    {
        ArrayList<int []> list = new ArrayList<>();

        Arrays.sort(intervals , new Comparator<int[]>()
        {
            public int compare(int[] a, int[] b)
            {
                return a[0] - b[0];
            }
        });

        for(int i=0; i<intervals.length; i++)
        {
            if(list.isEmpty() || intervals[i][0] > list.get(list.size()-1)[1])
            {
                list.add(new int[] {intervals[i][0],intervals[i][1]});
            }
            else
            {
                list.get(list.size()-1)[1] = Math.max(list.get(list.size()-1)[1], intervals[i][1]);
            }
        }

        return list.toArray(new int[list.size()][2]);
    }
}