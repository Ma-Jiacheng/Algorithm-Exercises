package Chapter03_哈希表.Demo04_四数相加;
import java.util.HashMap;

/*
getOrDefault()方法：获取指定key对应的value，如果找不到key，则返回设置的默认值
 */
class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int count = 0;  //定义int型变量count，存储满足条件的方案个数
        HashMap<Integer, Integer> map = new HashMap<>();    //创建HashMap

        for (int a : nums1) {   //遍历数组num1，nums2
            for (int b : nums2) {
                //getOrDefault()：如果结果只出现一次，则使用默认值0+1，如果多次出现，则使用当前value值+1
                map.put(a + b, map.getOrDefault(a + b, 0) + 1);     //将两个数组每个值相加的结果a+b作为key，将每种结果的出现次数存储为value
            }
        }

        for (int c : nums3) {   //遍历数组nums3，nums4
            for (int d : nums4) {
                if (map.containsKey(-(c + d))) {    //如果HashMap中包含值为0-(c+d)的key，则该a，b数组的值与当前c，d数组的值相加满足要求
                    count += map.get(-(c + d));     //将其出现次数value累加至count
                }
            }
        }

        return count;   //返回结果
    }
}
