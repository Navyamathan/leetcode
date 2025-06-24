class Solution 
{
    public String[] findWords(String[] words) 
    {
        ArrayList<String> list = new ArrayList<>();
        int[] arr = new int[26];
        for(int i=0; i<26; i++)
        {
            if(i == 16 || i ==22 || i == 4 || i== 17 || i == 19 || i== 20 || i == 24 || i== 8 || i == 14 || i == 15 )
            {
                arr[i] = 1;
            }
            else if(i == 0 || i == 18 || i == 3 || i == 5 || i == 6 || i == 7 || i == 8 || i == 9 || i == 10 || i==11 )
            {
                arr[i] = 2;
            }
            else
            {
                arr[i] = 3;
            }
        }

        for(String s : words)
        {
            boolean found = calculation(arr,s);
            if(found)
            {
                list.add(s);
            }
        }

        String[] result = new String[list.size()];
        for(int i=0; i<result.length; i++)
        {
            result[i] = list.get(i);
        }

        return result;
    }

    public boolean calculation(int[] arr , String s)
    {
        int type = arr[Character.toLowerCase(s.charAt(0)) - 'a'];
        for(char ch : s.toCharArray())
        {
            if(arr[Character.toLowerCase(ch) - 'a'] != type)
            {
                return false;
            }
        }
        return true;
    }
}