class Solution {
    public int maxSubArray(int[] nums) {
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;//handle the case where all are -ve 
        for(int num:nums){
            currSum+=num;
            maxSum=Math.max(maxSum,currSum);//handle where all are -ve
            if(currSum<0) currSum=0;
        }
        return maxSum;
        
    }
}
