package Chapter03_哈希表.Demo04_四数相加;

/*
步骤解析：
    1.定义一个Map，key为a+b的结果，value为该结果出现的次数
    2.遍历A，B两个数组，将两个数组元素a+b的所有结果及结果出现的次数存放到Map中
    3.定义int型遍历count，统计最终结果的个数
    4.遍历C，D数组，如果出现0-(c+d)的结果在Map中有对应的key，则a+b+c+d=0成立，将次数value赋值给count
    5.返回统计值count
 */
public class Demo {
    public static void main(String[] args) {
        int[] nums1 = {3, 1, 4};
        int[] nums2 = {-2, 4, 3};
        int[] nums3 = {-1, 3, 2};
        int[] nums4 = {3, -2, 0};
        Solution solution = new Solution();

        int result = solution.fourSumCount(nums1, nums2, nums3, nums4);

        System.out.println(result);
    }
}
