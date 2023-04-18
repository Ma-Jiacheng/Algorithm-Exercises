package Chapter04_字符串.Demo02_反转字符串Ⅱ;

class Solution {
    public String reverseStr(String s, int k) {
        //将字符串转换为字符数组
        char[] array = s.toCharArray();
        //遍历数组，此处i指针按照每次2k个进行遍历
        for (int i = 0; i < array.length; i += 2 * k) {
            if (i + k <= array.length) {    //如果遍历到的元素大于或等于k个，则反转前k个元素
                reverse(array, i, i + k - 1);   //反转元素
                continue;   //直接进行下一次循环，再次遍历2k个元素
            }
            reverse(array, i, array.length - 1);    //如果不满足大于等于k个的if语句条件，则将剩余元素全部反转
        }
        return new String(array);   //返回结果数组
       }
    //反转函数
    private void reverse(char[] s, int left, int right) {
        while (left < right) {
            char tmp = s[left];
            s[left] = s[right];
            s[right] = tmp;
            left++;
            right--;
        }
    }

}
