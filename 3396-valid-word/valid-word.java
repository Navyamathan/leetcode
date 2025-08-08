class Solution 
{
    public boolean isValid(String word) 
    {
        if(word.length() < 3)
        {
            return false;
        }
        int cons = 0;
        int vowel = 0;
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
            int temp = ch-'a';
            if(Character.isDigit(ch))
            {
                continue;
            }
            else if(list.contains(ch))
            {
                vowel++;
            }
            else if(temp >= 0 && temp <= 26)
            {
                cons++;
            }
            else
            {
                return false;
            }
        }
        if(cons >= 1 && vowel >= 1)
        {
            return true;
        }
        return false;
    }
}