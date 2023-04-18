package Chapter04_字符串.Demo01_反转字符串;

//双指针解法

class Solution {
    public void reverseString(char[] s) {
        //左指针指向头，右指针指向尾，首尾进行交换
        for (int i = 0, j = s.length - 1; i < s.length/ 2; i++, j--) {
            char tmp = s[i];
            s[i] = s[j];
            s[j] = tmp;
        }
    }
}
