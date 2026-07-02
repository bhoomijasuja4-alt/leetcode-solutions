class Solution {
    public int missingNumber(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        int answer = 0;
        for(int val: nums){
            set.add(val);

        }
        for(int i =0;i<nums.length+1;i++){
            if(!set.contains(i)){
                answer = i;
            }
        }

        return answer ;

        
    }
}