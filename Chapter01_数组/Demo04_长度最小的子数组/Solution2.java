package Chapter01_数组.Demo04_长度最小的子数组;

//滑动窗口解法

public class Solution2 {
    public int minSubArrayLen(int target, int[] nums) {
        int result = nums.length + 1;   //定义result变量，设置为数组最大长度
        int sum = 0;    //定义sum变量存储数组元素之和
        int subLength = 0;  //定义subLength，存储满足要求的数组长度
        int i = 0;  //设置滑动窗口的初始位置

        for (int j = 0; j < nums.length; j++) { //使用j指针作为滑动窗口的终止位置，遍历数组
            sum += nums[j]; //查找符合要求的终止位置，确定滑动窗口大小
            while (sum >= target) {
                subLength = j - i + 1;  //如果子数组元素的已经满足要求，使用右指针j减去左指针i的下标并加1，即得到该满足要求的子数组长度
                result = Math.min(result, subLength);   //判断该子数组长度是否为最小，如果是则更新result
                sum -= nums[i++];   //i指针前移，缩小滑动窗口大小，如果仍然满足要求则再次更新result，不满足则查找下一个子数组
            }
        }
        return result == nums.length + 1 ? 0 : result;  //如果全部查找结束，result仍为默认值nums.length，说明为查找到满足要求的子数组，返回0
    }
}