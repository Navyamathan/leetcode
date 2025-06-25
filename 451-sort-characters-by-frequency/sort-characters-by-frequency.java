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
        
        ArrayList<Character> chObj = new ArrayList<>(map.keySet());
        Collections.sort(chObj, (a,b) -> {
            return Integer.compare(map.get(b),map.get(a));
        });

        StringBuilder sb = new StringBuilder();

        for(char ch : chObj)
        {
            sb.append(String.valueOf(ch).repeat(map.get(ch)));
        }
        return sb.toString();
    }
}