


import java.util.*;

class Solution {

    public String reverseVowels(String s) {

        // Create HashSet of vowels
        HashSet<Character> set = new HashSet<>();

        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');

        char[] arr = s.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            // Move left pointer until vowel
            while (left < right && !set.contains(arr[left])) {
                left++;
            }

            // Move right pointer until vowel
            while (left < right && !set.contains(arr[right])) {
                right--;
            }

            // Swap vowels
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return new String(arr);
    }
}


        
    
