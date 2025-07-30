// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        int maxLen=0;
        int sum=0;
        map.put(0,-1);
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(map.containsKey(sum-k)) maxLen=Math.max(maxLen,i-map.get(sum-k));
            if(!map.containsKey(sum)){
                map.put(sum,i);
                
            }
            
        }
        return maxLen;
    }
}
