package 有序数组的平方_LeetCode_977;

//有序数组的平方——LeetCode-977

/*
双指针解决问题步骤：
    1.定义一个数组存放结果，遍历方式（由大到小、由小到大）根据题目情况决定
    2.定义两个下表 i = 0 和 j = nums.length - 1， 利用 for 循环，从两边遍历数组
    3.将运算后的结果进行比较，按照要求存入结果数组，之后更新【结果数组下标】与【双指针位置】
    4.返回结果数组
 */
public class Solution {
    public int[] sortedSquares(int[] nums) {
        int size = nums.length;
        int[] result = new int[size];

        for (int i = 0, j = nums.length - 1; i <= j; ) {    //循环条件为 i <= j，不能为 i < j，否则对于数组下标为中间值的数据会被忽略
                                                            //循环中不设置 i++ 与 j-- 操作，因为不能确定哪一个指针需要移动
            if (nums[i] * nums[i] > nums[j] * nums[j]) {
                result[size-1] = nums[i] * nums[i];     //result 数组长度为 nums 的大小，在使用时需要对下标进行 -1 操作，否则会产生数组索引越界
                size--;     //录入结果后，进行数组下标更新操作
                i++;    //录入结果后，进行指针更新操作
            }
            else{   //nums[i] == nums[j] 时，可任意选取 i 或 j 来更新数组
                result[size-1] = nums[j] * nums[j];     //result 数组长度为 nums 的大小，在使用时需要对下标进行 -1 操作，否则会产生数组索引越界
                size--;     //录入结果后，进行数组下标更新操作
                j--;    //录入结果后，进行指针更新操作
            }
        }
        return result;
    }
}
