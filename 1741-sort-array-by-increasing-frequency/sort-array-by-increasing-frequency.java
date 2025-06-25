class Solution 
{
    public int[] frequencySort(int[] nums) 
    {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : nums)
        {
            if(map.containsKey(num))
            {
                map.put(num, map.get(num)+1);
                continue;
            }
            map.put(num,1);
        }

        Integer[] temp = new Integer[nums.length];

        for(int i=0; i<nums.length; i++)
        {
            temp[i] = nums[i];
        }

        Arrays.sort(temp, (a,b) -> {
            if(map.get(a) == map.get(b))
            {
                return Integer.compare(b,a);
            }
            return Integer.compare(map.get(a),map.get(b));
        });

        for(int i=0; i<nums.length; i++)
        {
            nums[i] = temp[i];
        }
        return nums;
    }
}