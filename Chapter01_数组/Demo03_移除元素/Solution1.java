package Chapter01_数组.Demo03_移除元素;

//暴力解法

public class Solution1 {
    public int removeElement(int[] nums, int val) {
        int length = nums.length;     //定义length变量，更新数组长度

        for (int i = 0; i < length; i++) {  //外层循环遍历数组，查找等于val的目标元素
            if (nums[i] == val) {   //判断条件
                for (int j = i + 1; j < length; j++) {  //如果是需要移除的元素，进入内存循环，使之后的每一个元素向前覆盖一位，从而”删除“该元素
                    nums[j - 1] = nums[j];  //后一位覆盖前一位
                }
                i--;    //将i指针回退一位，避免连续出现两位需要移除元素，例如[1,2,3,3,4]：移除第一个元素3后覆盖的还是元素3，如果不回退则会跳过
                length--;   //移除之后将数组的长度-1
            }
        }
        return length;  //返回移除目标元素后的数组长度
    }
}
