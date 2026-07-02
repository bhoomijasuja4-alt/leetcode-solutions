import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>set = new HashSet<>();
        int[] arr = new int[Math.min(nums1.length,nums2.length)];
        int i =0;




        for(int val:nums1){
            set.add(val);
        }
        for(int val2 : nums2){
            if(set.contains(val2)){
                arr[i]=val2;
                set.remove(val2);
                i++;

            }
        }


        return Arrays.copyOf(arr, i);



        
    }
}