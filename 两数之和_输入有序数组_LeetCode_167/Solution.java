package 两数之和_输入有序数组_LeetCode_167;

//两数之和_输入有序数组——LeetCode-167

/*
设置左右指针分别指向数组第一个和最后一个元素
因为数组是有序排列，所以设置 sum 判断左右指针指向的元素是否大于 target
如果大于，则右指针左移；如果小于，左指针右移
每次循环开始可以直接判断 sum 和 target 的大小关系直接排除一个元素，不需要像双重 for 循环遍历整个数组后才能进行排除
 */
public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        int[] result = new int[2];

        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum > target) {
                right--;
            } else if (sum < target) {
                left++;
            } else {
                result[0] = left + 1;
                result[1] = right + 1;
                return result;
            }
        }
        result[0] = -1;
        result[1] = -1;
        return result;
    }
}
