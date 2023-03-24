package 二分查找_LeetCode_704;

public class Demo {
    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 6, 8, 9, 12, 14, 17, 21};
        Solution solution = new Solution();
        int result = solution.search(nums, 17);
        System.out.println("所查找的数值数组下标为：" + result);
    }
}