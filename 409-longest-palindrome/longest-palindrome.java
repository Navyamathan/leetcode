class Solution 
{
    public int longestPalindrome(String s) 
    {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : s.toCharArray())
        {
            if(map.containsKey(ch))
            {
                map.put(ch,map.get(ch)+1);
                continue;
            }
            map.put(ch,1);
        }
        int length = 0;
        boolean found = false;
        for(char ch : map.keySet())
        {
            if(map.get(ch)%2 == 0)
            {
                length += map.get(ch);
            }
            else
            {
                length += (map.get(ch)-1);
                found = true;
            }
        }
        if(found)
        {
            length++;
        }
        return length;
    }
}