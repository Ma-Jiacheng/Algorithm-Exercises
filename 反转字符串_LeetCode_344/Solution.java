package 反转字符串_LeetCode_344;

import java.util.Arrays;

class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while(left <= right){
            char tmp = s[left];
            s[left] = s[right];
            s[right] = tmp;

            left++;
            right--;
        }
        System.out.println(Arrays.toString(s));
    }
}
