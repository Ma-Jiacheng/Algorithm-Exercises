package Chapter03_哈希表.Demo01_有效的字母异位词;

/*
有效的字母异位词：
    题目描述：
        判断字符串s是否可以由字符串t变换字母顺序得到（包括两个字符串相同的情况）
    解题思路：
        判断字符串s和字符串t所包含的每个字母个数是否完全相同，如果完全相同则t是s的有效异位词
 */
public class Demo {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        Solution solution = new Solution();
        boolean result = solution.isAnagram(s, t);

        System.out.println(result);
    }
}
