package 移动零_LeetCode_283;

//移动零——LeetCode-283

/*
开始时 left, right 指针均指向第一个元素，right指针不动，left 指针开始遍历，直到找到第一个非0元素
交换 nums[left] 与 nums[right] 的值，使非 0 元素移动到左边，值为 0 的元素到右边
遍历整个数组，结束时值为 0 的元素均处在数组最右边
 */
class Solution {
    public void moveZeroes(int[] nums) {
        int right = 0;  //设置right指针初始位置

        for (int left = 0; left < nums.length; left++) {
            //如果当前元素 nums[i] != 0，就把其交换到左边，等于0的交换到右边
            if (nums[left] != 0) {
                int tmp = nums[left];
                nums[left] = nums[right];
                nums[right++] = tmp;
            }
        }
    }
}
