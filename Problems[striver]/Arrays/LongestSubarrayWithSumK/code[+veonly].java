public class Solution {
    public static int longestSubarrayWithSumK(int []a, long k) {
        // Write your code here
        int l=0;
        int r=0;
        int maxLen=0;
        long sum=0;
        while(r<a.length){
            sum+=a[r];
            
            while(sum>k){
                sum-=a[l++];

            }
            if(sum==k){
                maxLen=Math.max(maxLen,r-l+1);
            }
            r++;
        }
        return maxLen;
    }
}
