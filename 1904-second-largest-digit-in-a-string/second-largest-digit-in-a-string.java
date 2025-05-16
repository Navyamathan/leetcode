class Solution 
{
    public int secondHighest(String s) 
    {
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if(Character.isDigit(ch))
            {
                int temp = Character.getNumericValue(ch);
                set.add(temp);
            }
        }

        int fr = -1;
        int sc = -1;
        for(int temp : set)
        {
            if(temp == fr)
            {
                continue;
            }
            if(fr < temp)
            {
                sc = fr;
                fr = temp;
            }
            else
            {
                sc = Math.max(temp,sc);
            }
        }
        return sc;
    }
}