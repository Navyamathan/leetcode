class Solution 
{
    public boolean isIsomorphic(String s, String t) 
    {
         if(s.length() != t.length())
        {
            return false;
        }
        HashMap<Character,ArrayList<Integer>> h1 = new HashMap<>();
        HashMap<Character,ArrayList<Integer>> h2 = new HashMap<>();

        String s1 = "";
        int i = 0;
        for(char ch : s.toCharArray())
        {
            if(h1.containsKey(ch))
            {
                h1.get(ch).add(i);
            }
            else
            {
                s1 += ch;
                h1.put(ch, new ArrayList<>());
                h1.get(ch).add(i);
            }
            i++;
        }
        String s2 = "";
        int j = 0;
        for(char ch : t.toCharArray())
        {
            if(h2.containsKey(ch))
            {
                h2.get(ch).add(j);
            }
            else
            {
                s2 += ch;
                h2.put(ch, new ArrayList<>());
                h2.get(ch).add(j);
            }
            j++;
        }

        if(s1.length() != s2.length())
        {
            return false;
        }

        for(int k=0; k<s1.length(); k++)
        {
           char c1 = s1.charAt(k);
           char c2 = s2.charAt(k);
           if(!h1.get(c1).equals(h2.get(c2)))
           {
            return false;
           }
        }
        return true;
    }
}