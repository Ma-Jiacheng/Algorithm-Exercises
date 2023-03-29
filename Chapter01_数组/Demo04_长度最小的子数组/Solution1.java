package Chapter01_数组.Demo04_长度最小的子数组;

//暴力解法

public class Solution1 {
    public int minSubArrayLen(int target, int[] nums) {
        int result = nums.length;   //定义result变量，设置为数组最大长度
        int sum;    //定义sum变量存储数组元素之和
        int subLength;  //定义subLength，存储满足要求的数组长度

        for (int i = 0; i < nums.length; i++) {     //外层循环，控制i指针指向数组头部
            sum = 0;    //初始化sum
            for (int j = i; j < nums.length; j++) {     //内存循环，控制指针j从i指针位置开始遍历数组
                sum += nums[j];     //将指针j遍历到的数组元素全部相加，直到sum满足大于或等于s
                if (sum >= target) {
                    subLength = j - i + 1;  //如果子数组元素的已经满足要求，使用右指针j减去左指针i的下标并加1，即得到该满足要求的子数组长度
                    result = Math.min(result, subLength);   //如果该子数组长度小于result，则将其更新
                    break;  //跳出内层循环，i指针前移一位，开始下一轮查找
                }
            }
        }
        return result == nums.length ? 0 : result;  //如果全部查找结束，result仍为默认值nums.length，说明为查找到满足要求的子数组，返回0
    }
}
