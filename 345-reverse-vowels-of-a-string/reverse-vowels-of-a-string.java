class Solution 
{
    public String reverseVowels(String s) 
    {
        ArrayList<Character> vowels = new ArrayList<>(Arrays.asList('a','e','i',
        'o','u','A','E','I','O','U'));
        char [] ch = s.toCharArray();
        int i=0;
        int j=ch.length -1;
        while(i<j)
        {
            while(!vowels.contains(ch[i]) && i < ch.length-1)
            {
                i++;
            }
            while(!vowels.contains(ch[j]) && j > 0)
            {
                j--;
            }
            if(i <j)
            {
                 char temp = ch[i];
                 ch[i] = ch[j];
                 ch[j] = temp;
                 i++;
                 j--;
            }      
        }
        s = String.valueOf(ch);
        return s;
    }
}