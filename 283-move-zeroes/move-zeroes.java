class Solution {
    public void moveZeroes(int[] nums) {
        int noz = 0;
        for(int ele : nums){
            if(ele == 0) noz++;
        }

        for(int i=0; i<noz; i++){
            for(int j=0; j<nums.length-1-i; j++){
                if(nums[j] == 0){
                    int temp  = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }
}