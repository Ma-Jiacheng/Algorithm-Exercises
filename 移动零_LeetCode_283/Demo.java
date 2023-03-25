package 移动零_LeetCode_283;
import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int[] nums = {2, 0, 0, 1, 3, 0, 12};

        Solution solution = new Solution();
        solution.moveZeroes(nums);

        System.out.println(Arrays.toString(nums));
    }
}
