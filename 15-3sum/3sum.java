class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            // fixing the i at first element
            if(i>0 && nums[i] == nums[i-1]) continue;// optimizing for duplicate values
            // j will be increasing
            int j=i+1;
            // k will be decreasing
            int k=nums.length-1;
            while(j<k){
                int total = nums[i]+nums[j]+nums[k];
                // if the total is greater than reduce k
                if(total > 0) k--;
                // if the total is smaller than increase j
                else if (total < 0) j++;
                else{
                    res.add(List.of(nums[i],nums[j],nums[k]));
                    j++;
                    while(nums[j] == nums[j-1] && j<k) j++; //optimizing for duplicate values
                }
            }
        }
        return res;
    }
}