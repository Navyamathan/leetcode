class Solution 
{
    public boolean canConstruct(String ransomNote, String magazine) 
    {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : magazine.toCharArray())
        {
            if(map.containsKey(ch))
            {
                map.put(ch,map.get(ch)+1);
                continue;
            }
            map.put(ch,1);
        }
        for(char ch : ransomNote.toCharArray())
        {
            if(!map.containsKey(ch)) return false;
            if(map.get(ch) != 0)
            {
                map.put(ch,map.get(ch)-1);
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}