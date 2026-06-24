class Solution {
    public int singleNumber(int[] nums) {


        int answer = 0;
        for(int i =0;i<nums.length;i++){
            int count = 1;
            for (int j =0;j<nums.length;j++){
                if((nums[j]==nums[i])&&( j!=i)){
                    count++;
                }
            }

            if(count==1){
                answer = nums[i];
            }
        }
        return answer ;

        
    }
}