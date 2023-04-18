package Chapter04_字符串.Demo01_反转字符串;

public class Demo {
    public static void main(String[] args) {
        String str = "asdfg";
        char[] s = str.toCharArray();

        Solution solution = new Solution();
        solution.reverseString(s);

        System.out.println(s);
    }
}
