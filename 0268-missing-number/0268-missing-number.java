class Solution {
    public int missingNumber(int[] nums) {
        int numsSum=0;
        int rangeSum=0;
        int n=nums.length+1;
        for(int i=0;i<nums.length;i++){
            numsSum+=nums[i];
        }
        for(int j=0;j<n;j++){
            rangeSum+=j;
        }
        return rangeSum-numsSum;
        
    }
}