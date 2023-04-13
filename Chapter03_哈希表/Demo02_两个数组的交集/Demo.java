package Chapter03_哈希表.Demo02_两个数组的交集;
import java.util.Arrays;

/*
计算两个数组的交集：
    解题思路：
        1.本题主要使用一种数据结构HashSet，利用其不可存储重复元素的性质
        2.将nums1添加至HashSet，去除其中的重复元素
        3.再遍历nums2的元素，如果HashSet包含nums2的元素，则为交集元素，存储值另一个HashSet
        4.使用HashSet避免出现 [1,2,2,1] 与 [2,2] 输出结果为 [2,2]，因为HashSet不允许存储重复元素，所以结果为 [2]
        5.最后将结果HashSet元素转入result数组
 */
public class Demo {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        Solution solution = new Solution();
        int[] result = solution.intersection(nums1, nums2);

        System.out.println(Arrays.toString(result));
    }
}
