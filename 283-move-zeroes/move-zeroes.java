class Solution {
    public void moveZeroes(int[] nums) {
        int k=0;
        for(int ele : nums){
            if(ele !=0){
                nums[k] = ele;
                k++;
            }
        }
        while(k < nums.length){
            nums[k] =0;
            k++;
        }
    }
}