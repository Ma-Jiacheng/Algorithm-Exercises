package Chapter03_哈希表.Demo03_两数之和;
import java.util.HashMap;
import java.util.Map;

//哈希表解法
public class Solution2 {
    public int[] twoSum(int[] nums, int target) {
        //创建哈希表，存储遍历过的元素
        Map<Integer, Integer> map = new HashMap<>();
        //用一个for循环遍历数组元素
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target - nums[i])){  //计算target - nums[i]的值，查看哈希表是否包含该数值的key
                return new int[]{map.get(target - nums[i]), i}; //如果key存在，则返回key对应的value（数组下标i）和当前for循环的数组下标
            }
            map.put(nums[i], i);    //将遍历过的元素存储到哈希表中
        }

        return null;
    }
}
