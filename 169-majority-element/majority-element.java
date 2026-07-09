class Solution {
    public int majorityElement(int[] nums) {
        int target = nums.length/2 +1;
        int rest =0;
        for(int i=0; i< nums.length; i++){
            int curr = nums[i];
            rest = nums[i];
            int count = 1;
            for(int j=1; j<nums.length; j++){
                if(curr == nums[j]){
                    count++;
                }
                if(count == target) return curr;
            }
        }
        return rest;
    }
}