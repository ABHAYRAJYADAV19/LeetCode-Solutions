class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int lf=target-nums[i];
            if(map.containsKey(lf)){
                return new int []{map.get(lf),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
}