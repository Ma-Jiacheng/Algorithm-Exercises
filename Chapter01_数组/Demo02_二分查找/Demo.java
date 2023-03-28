package Chapter01_数组.Demo02_二分查找;

/*
二分查找法：
    使用条件：数组为有序数组，且不存在重复元素（如果数组存在重复元素，返回的下标可能不是唯一的）
    易错点：
        1.循环条件边界值的确定，在while循环中，条件选择left<right，还是left<=right？
        2.指针更新的边界值确定，在完成一次二分查找后，right指针是执行right=mid，还是right=mid-1？
    易错点判断原则：
        写错的原因主要是不清楚区间的定义，区间的定义作为“不变量”，在每一次循环中都应当继续保持不变，所以每次边界值处理都应当与区间条件保持一致
    区间定义：
        二分法区间定义一般有两种，左闭右闭区间[left,right]，左闭右开区间[left,right)，下面以这两种区间定义编写两种不同的二分法写法
 */
class Demo {
    public static void main(String[] args) {

        int[] nums = {1,4,6,8,9,12,16};

        //在数组所有元素中查找
        Solution1 solution1 = new Solution1();
        int position1 = solution1.search(nums, 6);
        System.out.println(position1);

        System.out.println("================");

        //除去最后一位，在剩余的数组元素中查找
        Solution2 solution2 = new Solution2();
        int position2 = solution2.search(nums,9);
        System.out.println(position2);
        int position3 = solution2.search(nums,16);
        System.out.println(position3);

    }
}