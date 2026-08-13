class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        
        HashMap<Integer,Integer> map=new HashMap();
        for(int i =0;i<nums.length;i++){
            int difference=target-nums[i];
            if (map.containsKey(difference)) {
                return new int[]{map.get(difference),i};  
            }
            map.put(nums[i],i);

        }
    
        // for (int num : nums) {
        //    int difference=target-num;
        //     if (map.containsKey(difference)) {
        //         return new int[]{map.get(difference),num};  
        //     }
        //    map.put(num,num);
            
        // }
        
         return new int[]{};
    }
}

        
    
