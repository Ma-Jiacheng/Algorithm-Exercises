package Chapter01_数组.Demo05_螺旋矩阵;
import java.util.Arrays;

/*
给出一个正整数，按照从外向内的螺旋顺序打印1到n^2的所有值
    顺序：
        从左到右填充上行-->从上到下填充右列-->从右到左填充下行-->从下到上填充左列
    易错点；拥有极多的边界条件，需要注意循环不变量原则，四条边都要坚持左开右闭或左闭右开原则，不能随意更改
 */
public class Demo {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] array = solution.generateMatrix(3);

        for(int[] date : array){
            System.out.println(Arrays.toString(date));
        }
    }
}
