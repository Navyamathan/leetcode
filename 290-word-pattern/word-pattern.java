class Solution 
{
    public boolean wordPattern(String pattern, String s) 
    {
        HashMap<Character, String> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        String [] ss = s.split(" ");
        if(pattern.length() != ss.length)
        {
            return false;
        }
        for(int i=0; i<ss.length; i++)
        {
            if(!map.containsKey(pattern.charAt(i)) && !list.contains(ss[i]))
            {
                map.put(pattern.charAt(i),ss[i]);
                list.add(ss[i]);
            }
        }
        for(int i=0; i<ss.length; i++)
        {
            if(!ss[i].equals(map.get(pattern.charAt(i))))
            {
                return false;
            }
        }
        return true;
    }
}