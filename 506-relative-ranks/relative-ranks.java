class Solution 
{
    public String[] findRelativeRanks(int[] score) 
    {
        PriorityQueue<Pair<Integer,Integer>> pq = new PriorityQueue<>((p1,p2) -> (p2.getValue() - p1.getValue()));
        for(int i=0; i<score.length; i++)
        {
            pq.add(new Pair(i,score[i]));
        }
        String[] result = new String[score.length];
        int place = 1;
        while(!pq.isEmpty())
        {
            Pair<Integer,Integer> top = pq.poll();
            int currentIndex = top.getKey();
            if(place == 1)
            {
                result[currentIndex] = "Gold Medal";
            }
            else if(place == 2)
            {
                result[currentIndex] = "Silver Medal";
            }
            else if(place == 3)
            {
                result[currentIndex] = "Bronze Medal";
            }
            else
            {
                result[currentIndex] = String.valueOf(place);
            }
            place++;
        }
        return result;
    }
}