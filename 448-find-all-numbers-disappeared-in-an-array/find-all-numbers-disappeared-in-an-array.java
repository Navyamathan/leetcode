class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] n = new boolean[nums.length+1];
        for(int i=0; i<nums.length; i++)
        {
            n[nums[i]] = true;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1; i<=nums.length; i++)
        {
            if(!n[i])
            {
                list.add(i);
            }
        }
        return list;
    }
}