class Solution {
    public void moveZeroes(int[] nums) {
        int left =0 ;
        int right =1;
        while(right<nums.length){

        
        
            if (nums[left]==0 && nums[right]!=0){
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                right++;
                left++;

            }else if(nums[left]==0&&nums[right]==0){
                right++;
                
            }else{
                right++;
                left++;
                
            }

        }
        
    }
}