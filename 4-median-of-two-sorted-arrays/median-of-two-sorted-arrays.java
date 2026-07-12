class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int [] ans = new int[nums1.length + nums2.length];
        for(int i=0; i<nums1.length; i++){
            ans[i] = nums1[i];
        }
        for(int j=0; j<nums2.length; j++){
            ans[j+nums1.length] = nums2[j];
        }
        Arrays.sort(ans);
        if(ans.length%2 !=0 ){
            return Double.valueOf(ans[ans.length/2]);
        }else{
            return Double.valueOf(
                (double)(ans[ans.length/2-1] + ans[ans.length/2])/2
                );
        }
    }
}