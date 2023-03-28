package Chapter01_数组.Demo02_二分查找;

//左闭右开区间 [left,right)

public class Solution2 {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length;    //因为右侧为开区间，所以此处right=nums.length，如果等于nums.length-1，数组最后一位将被忽略

        right = nums.length - 1;    //为测试边界值进行更改，非正常情况

        while (left < right) {  //此处须使用left<right，如果使用left<=right，对于左闭右开区间[left,right)来讲是不成立的
            int mid = (right + left)/2;
            if (nums[mid] > target) {
                //因为是左闭右开区间，nums[mid]大于target，如果使用right=mid-1，那么nums[right]=nums[mid-1]会因为右侧开区间不能参加计算而被忽略
                right = mid;    //[left,right)，right为开区间，取值为mid不会再次参加计算
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
