package Chapter01_数组.Demo03_移除元素;

/*
移除元素：
    数组中的元素无法真正移除，只能靠后一个元素覆盖前一个元素，返回移除后的数组没有意义，所以返回值为移除后的数组长度，然后按顺序进行打印结果
解决方案：
    1.暴力解法：利用双重for循环，外层循环遍历数组，查找需要移除的元素。查找到后进入内层循环，从需要的移除元素之后的每一个元素都向前覆盖一位，即可移除该元素
    2.双指针解法（左右替换法，无法保证数组顺序）：设置左、右指针，做指针指向数组第一个元素，右指针指向尾部。左指针遍历数组，如果遇到val则与右指针交换，将其放至最后一位
      完成后左指针回退，右指针前移一位，数组长度-1
    3.双指针解法（快慢指针法）：通过一个快指针和一个慢指针在一个for循环内完成暴力解法中两个for循环的工作
 */
public class Demo {
    public static void main(String[] args) {
        int[] nums1 = {0, 1, 2, 2, 3, 0, 4, 2};

        Solution1 solution1 = new Solution1();
        int length1 = solution1.removeElement(nums1, 2);

        for (int i = 0; i < length1; i++) {
            if (i == length1 - 1) {
                System.out.println(nums1[i]);
            } else {
                System.out.print(nums1[i] + " ");
            }
        }

        System.out.println("=================");

        int[] nums2 = {0, 1, 2, 2, 3, 0, 4, 2};

        Solution2 solution2 = new Solution2();
        int length2 = solution2.removeElement(nums2, 2);

        for (int i = 0; i < length2; i++) {
            if (i == length2 - 1) {
                System.out.println(nums2[i]);
            } else {
                System.out.print(nums2[i] + " ");
            }
        }

        System.out.println("=================");

        int[] nums3 = {0, 1, 2, 2, 3, 0, 4, 2};

        Solution3 solution3 = new Solution3();
        int length3 = solution3.removeElement(nums3, 2);

        for (int i = 0; i < length3; i++) {
            if (i == length3 - 1) {
                System.out.println(nums3[i]);
            } else {
                System.out.print(nums3[i] + " ");
            }
        }
    }
}
