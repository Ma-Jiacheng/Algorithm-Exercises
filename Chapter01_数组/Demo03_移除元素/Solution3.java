package Chapter01_数组.Demo03_移除元素;

//双指针解法（快慢指针）

public class Solution3 {
    public int removeElement(int[] nums, int val) {
        int slow = 0;   //设置满指针指向数组第一个元素

        for (int fast = 0; fast < nums.length; fast++) {    //设置快指针遍历数组
            if (val != nums[fast]) {    //如果快指针的值不是val
                nums[slow] = nums[fast];    //将快指针的值交给慢指针
                slow++;     //满指针将快指针的值存放后前移一位
            }
        }
        return slow;    //返回满指针的位置，即为数组长度
    }
}
