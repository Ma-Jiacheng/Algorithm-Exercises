package Chapter04_字符串.Demo02_反转字符串Ⅱ;

public class Demo {
    public static void main(String[] args) {
        int k = 3;
        String s = "asdfghjkl";

        Solution solution = new Solution();
        String result = solution.reverseStr(s, k);

        System.out.println(result);
    }
}
