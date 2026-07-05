import java.util.*;
class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer>set = new HashSet<>();
        int answer = 0;

        for (int i =0;i<nums.length;i++){
            set.add(nums[i]);

        }

        for(int val:set){
            int count = 1;
            if(!set.contains(val-1)){
                int current = val;
            
                while(set.contains(current+1)){
                    current++;
                    count++;
                }
            }
            answer = Math.max(count,answer);

            

            
        }

        return answer;
        
    }
}