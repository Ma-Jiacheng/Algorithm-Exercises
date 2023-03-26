package 反转字符串中的单词_LeetCode_557;

class Solution {
    public String reverseWords(String s) {
        char[] ch = s.toCharArray();    //将字符串s转变为字符串数组
        int left = 0;
        int right = 0;
        int length = ch.length;

        while (right <= ch.length) {    //快指针到达最后一个字符为结束条件
            if (right < ch.length && ch[right] != ' ') {    //检测快指针是否到达最后以为或者遇到空格，如果遇到空格，代表查找到一个完整单词，停止查找开始反转
                //最后一个单词无空格结尾，则以查找到最后一个字符为条件
                right++;    //未查找到空格则继续遍历
            } else if (right == ch.length || ch[right] == ' ') {    //如果查找到空格，则开始反转前面的整个单词
                int flag = right;   //保存空格的位置，即下一个单词开始的位置
                right--;    //快指针向前一位，指向单词最后一个字符
                while (left < right) {  //进行反转操作
                    char tmp = ch[left];
                    ch[left] = ch[right];
                    ch[right] = tmp;
                    left++;
                    right--;
                }
                left = flag + 1;    //反转完该单词，快慢指针均指向下一个单词的首字符，快指针继续开始查找下一个单词
                right = flag + 1;
            }
        }
        return String.valueOf(ch);
    }
}
