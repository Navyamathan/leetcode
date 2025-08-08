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
            else if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
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