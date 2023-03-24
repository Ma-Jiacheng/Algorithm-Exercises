package 丢失的数字_LeetCode_268;
import java.util.Arrays;

//丢失的数字——LeetCode-268

/*
排序法：先利用 Arrays.sort() 方法进行排序，之后从小到大遍历数组，当出现 nums[i] 与 i 的值不相等时，i 的值即为缺失数字
    易错点：当缺失数字为最大值 n 时，例如： n = 2，数组 [0,1]，nums.length = 2，数组无法遍历至数字 2，需单独编写返回值
 */
public class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;    //获取数组长度
        Arrays.sort(nums);  //对数组进行排序

        for (int i = 0; i < nums.length; i++) {     //遍历数组，查找数组下标与元素值是否对应
            if (nums[i] != i) {     //不对应的值即为缺失值
                return i;   //返回缺失值
            }
        }
        return n;   //若遍历完没有找到结果，则缺失值为区间最大值 n
    }
}
