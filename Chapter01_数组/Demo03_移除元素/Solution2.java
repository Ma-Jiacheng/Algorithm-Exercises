package Chapter01_数组.Demo03_移除元素;

//双指针解法（左右指针）

public class Solution2 {
    public int removeElement(int[] nums, int val) {
        int length = nums.length;   //定义length变量，更新数组长度

        for (int left = 0, right = length - 1; left <= right; left++) {  //设置左右指针，左指针指向数组第一个元素进行遍历，右指针指向数组末尾等待替换
            if (nums[left] == val) {    //找到需要移除的元素
                nums[left] = nums[right];   //将其放至数组末尾
                left--;     //将左指针回退一位，避免连续出现两位需要移除元素，例如[1,2,3,4,3]：左指针的3和右指针的元素交换后任然为3，如果不回退则会跳过
                length--;   //数组长度-1
                right--;    //右指针继续指向末尾
            }
        }
        return length;  //返回移除目标元素后的数组长度
    }
}
