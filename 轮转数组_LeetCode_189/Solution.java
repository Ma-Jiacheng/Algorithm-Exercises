package 轮转数组_LeetCode_189;
import java.util.Arrays;

//轮转数组——LeetCode-189

public class Solution {
    //创建新数组求解——我的方案
    public void rotate(int[] nums, int k) {
        int size = nums.length;
        int[] result = new int[size];   //创建一个和 nums 一样大小的数组

        for (int i = 0; i < nums.length; i++) {     //遍历数组，利用双指针，i 指针指向要轮转的元素，j 指针指向轮转之后新数组元素的位置
            for (int j = i + k; j < nums.length + k; j++) {
                int temp = j;   //保存原数组中 j 指针的位置
                if (j > nums.length - 1) {      //处理新数组中 j 指针超出数组大小的情况
                    j = j - nums.length;
                }
                result[j] = nums[i];    //将元素放入新数组对应位置
                j = temp;
            }
        }

        for (int i = 0; i < nums.length; i++) {     //将新数组的轮转结果赋值到原数组
            nums[i] = result[i];
        }

        System.out.println(Arrays.toString(nums));  //输出轮转后的结果
    }
//    创建新数组求解——LeetCode官方解
//    public void rotate(int[] nums, int k) {
//        int n = nums.length;
//        int[] newArr = new int[n];
//
//        for (int i = 0; i < n; ++i) {
//            newArr[(i + k) % n] = nums[i];
//        }
//
//        System.arraycopy(newArr, 0, nums, 0, n);
//        System.out.println(Arrays.toString(nums));
//    }
 }
