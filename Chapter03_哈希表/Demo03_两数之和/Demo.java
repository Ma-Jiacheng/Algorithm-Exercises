package Chapter03_哈希表.Demo03_两数之和;
import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 5};

        Solution1 solution1 = new Solution1();
        System.out.println(Arrays.toString(solution1.twoSum(nums, 18)));

        System.out.println("=====================");

        Solution2 solution2 = new Solution2();
        System.out.println(Arrays.toString(solution2.twoSum(nums, 18)));
    }
}
