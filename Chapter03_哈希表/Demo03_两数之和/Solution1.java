package Chapter03_哈希表.Demo03_两数之和;

//暴力穷举解法
class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        //双层for循环，逐个遍历数组元素
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {  //如果两个元素的和等于target
                    return new int[]{i, j}; //新建一个结果数组，返回两个元素的下标
                }
            }
        }
        return null;
    }
}
