class Solution 
{
    public boolean isValid(String word) 
    {
        if(word.length() < 3)
        {
            return false;
        }
        boolean cons = false;
        boolean vowel = false;
        ArrayList<Character> list = new ArrayList<>();
        list.add('a');
        list.add('e');
        list.add('i');
        list.add('o');
        list.add('u');
        for(int i=0; i<word.length(); i++)
        {
            char ch = word.charAt(i);
            ch = Character.toLowerCase(ch);
            if(!Character.isLetterOrDigit(ch))
            {
                return false;
            }
            else if(Character.isDigit(ch))
            {
                continue;
            }
            else if(list.contains(ch))
            {
                vowel = true;
            }
            else
            {
                cons = true;
            }
        }
        if(cons && vowel)
        {
            return true;
        }
        return false;
    }
}