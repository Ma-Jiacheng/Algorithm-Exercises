package Chapter01_数组.Demo04_长度最小的子数组;

/*
在数组nums中找到长度最小的子数组，使其个元素的和大于或等于target，返回符合条件的最小数组的长度

解决方法：
    1.暴力解法：使用双重for循环不断查找满足条件的数组，然后进行比较，返回最短的数组长度
    2.滑动窗口解法；不断调节子数组的起始位置和终止位置，得到满足要求的子数组
        实现滑动窗口的要素：
            1.窗口内的元素是什么：窗口内是数值之和满足大于或等于target的子数组
            2.如何移动窗口的起始位置：如果当前窗口的数值之和大于或等于target，则窗口初始位置向前移动（缩小窗口）
            3.如何移动窗口的终止位置：窗口的结束位置就是for循环遍历数组的指针
 */
public class Demo {
    public static void main(String[] args) {

        int[] nums1 = {4, 6, 2, 4, 9, 8, 7};

        Solution1 solution1 = new Solution1();
        int result1 = solution1.minSubArrayLen(12, nums1);
        System.out.println(result1);

        int[] nums2 = {4, 6, 2, 4, 9, 8, 7};

        Solution2 solution2 = new Solution2();
        int result2 = solution2.minSubArrayLen(12, nums2);
        System.out.println(result2);

    }
}
