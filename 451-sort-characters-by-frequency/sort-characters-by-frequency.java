class Solution 
{
    public String frequencySort(String s) 
    {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray())
        {
            if(map.containsKey(ch))
            {
                map.put(ch, map.get(ch)+1);
            }
            else
            {
                map.put(ch, 1);
            }
        }
        
        // ArrayList<Character> chObj = new ArrayList<>(map.keySet());
        // Collections.sort(chObj, (a,b) -> {
        //     return Integer.compare(map.get(b),map.get(a));
        // });

        PriorityQueue<Character> pq = new PriorityQueue<>((a,b) -> map.get(b) - map.get(a));

        pq.addAll(map.keySet());

        StringBuilder sb = new StringBuilder();

        while(!pq.isEmpty())
        {
            char ch = pq.poll();
            sb.append(String.valueOf(ch).repeat(map.get(ch)));
        }
        return sb.toString();
    }
}