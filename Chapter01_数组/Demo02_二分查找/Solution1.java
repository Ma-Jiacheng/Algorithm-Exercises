package Chapter01_数组.Demo02_二分查找;

//左闭右闭区间 [left,right]

public class Solution1 {
    public int search(int[] nums, int target) {
        int left = 0;   //定义左指针为止
        int right = nums.length - 1;    //定义右指针位置

        while (left <= right) {     //当left==right时，对于左闭右闭区间[left,right]是成立的，所以循环条件使用left<=right
            int mid = left + (right - left);    //定义数组中间值mid，为防止两个int型数据相加发生溢出，所以使用该写法，等同于mid=(left+right)/2
            if (nums[mid] > target) {   //target在左半区间，需要移动右指针
                //因为是左闭右闭区间，且nums[mid]已经大于target,如果right=mid，那么nums[right]==nums[mid]将会再次参加计算，所以使用right=mid-1
                right = mid - 1;    //[left,right-1]
            } else if (nums[mid] < target) {    //target在右半区间，需要移动左指针
                //与右指针移动同理
                left = mid + 1;
            } else {
                return mid;     //在数组中找到target，直接返回其下标
            }
        }
        return -1;  //未找到target
    }
}
