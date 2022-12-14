class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n<=1){return n;}
        
        int left = 0; //everything to the left of left(inclusive) is good
        int right = 1;//the current element we are processing
        
        while(right<=n-1){
            if(nums[right] == nums[left]){
                right++;
            }
            else{
                nums[left+1] = nums[right];
                left++;
                right++;
            }
        }
        
        return left+1;
    }
}