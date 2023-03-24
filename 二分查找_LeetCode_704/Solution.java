package 二分查找_LeetCode_704;

//二分查找——LeetCode-704

/*
易错点：
    1. while 循环中的循环条件是 left < right 还是 left <= right
    2. 在更新区间边界时，是 right = mid 还是 right = mid - 1
 */
class Solution {
    public int search(int[] nums, int target) {
        //定义查找范围
        int left = 0;
        int right = nums.length - 1;    //根据情况确定实际左右边界的值

        //设置查找循环
        while (left <= right) {     //使用 left < right 还是 left <= right 要根据题目给出的区间情况来确定，
                                    //如果为左闭右闭区间，例如：[1,1]，left <= right 是可以成立的，则使用 left <= right
                                    //如果为左闭右开区间，例如：[1,1)，left <= right 显然不成立，则使用 left < right
            int mid = left + (right - left) / 2;
            if (nums[mid] > target) {
                right = mid - 1;    //根据区间判断，在已经 nums[mid] 确定不是 target 的情况下则不需要再次使用
                                    //对于右闭区间，例如：mid = 20，区间[0,20]，如果使用 right = mid，则会再次使用 mid = 20 该值，所以为 right = mid - 1
                                    //对于右开区间，例如：mid = 20，区间[0,20)，则可以使用 right = mid，因为 mid = 20 该值不会再次参与计算
            } else if (nums[mid] < target) {
                left = mid + 1;     //此处判断同右区间边界确定方法，根据区间边界情况确定
            } else {
                return mid;
            }
        }
        return -1;
    }
}
