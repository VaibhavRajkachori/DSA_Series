class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int cnt=0;
        map.put(sum,1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(map.containsKey(sum-k)) cnt+=map.get(sum-k);
            map.put(sum,map.getOrDefault(sum,0)+1);


        }
        return cnt;
        
    }
}
