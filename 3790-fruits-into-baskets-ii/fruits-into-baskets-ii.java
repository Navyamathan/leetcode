class Solution 
{
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) 
    {
        boolean found = false;
        int count = 0;
        for(int i=0; i<fruits.length; i++)
        {
            for(int j=0; j<baskets.length; j++)
            {
                if(baskets[j] != 0 && fruits[i] <= baskets[j])
                {
                    baskets[j] = 0;
                    found = true;
                    break;
                }
            }
            if(!found)
            {
                count++;
            }
            else
            {
                found = false;
            }
        }
        return count;
    }
}