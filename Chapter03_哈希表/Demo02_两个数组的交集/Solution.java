package Chapter03_哈希表.Demo02_两个数组的交集;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        //创建HashSet，用于数组去重
        Set<Integer> numSet = new HashSet<>();
        Set<Integer> resultSet = new HashSet<>();
        int count = 0;

        //将nums1数组转入HashSet，去除重复元素
        for (Integer i : nums1) {
            numSet.add(i);
        }

        //将nums2的元素和nums1元素进行比较
        for (Integer i : nums2) {
            if(numSet.contains(i)){     ////如果两个元素相同，则将其添加至HashSet
                resultSet.add(i);   //使用HashSet，避免 [1,2,2,1] 与 [2,2] 的结果为 [2,2] 的重复情况
            }
        }

        int[] result = new int[resultSet.size()];   //返回值类型为数组
        for (Integer i : resultSet) {   //将HashSet的结果数据copy至result数组
            result[count++] = i;
        }

        return result;  //返回结果数组
    }
}
