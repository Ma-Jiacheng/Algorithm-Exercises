package 丢失的数字_LeetCode_268;

public class Demo {
    public static void main(String[] args) {
        int[] nums = {1, 6, 4, 2, 3, 0};
        Solution solution = new Solution();
        int result = solution.missingNumber(nums);
        System.out.println("缺失的数字为：" + result);
    }
}
