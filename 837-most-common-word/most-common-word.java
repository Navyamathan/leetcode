class Solution 
{
    public String mostCommonWord(String paragraph, String[] banned) 
    {
        HashMap<String,Integer> map = new HashMap<>();
        String[] s = paragraph.toLowerCase().split("[^a-zA-Z]+");
        for(String temp : s)
        {
            if(map.containsKey(temp))
            {
                map.put(temp,map.get(temp)+1);
                continue;
            }
            map.put(temp,1);
        }
        for(int i=0; i<banned.length; i++)
        {
            if(map.containsKey(banned[i]))
            {
                map.remove(banned[i]);
            }
        }
        int max = 0;
        String result = "";
        for(String temp : map.keySet())
        {
            if(max < map.get(temp))
            {
                max = map.get(temp);
                result = temp;
            }
        }
        return result;
    }
}