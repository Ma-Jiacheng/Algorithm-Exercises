package Chapter01_数组.Demo05_螺旋矩阵;

public class Solution {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];     //定义一个二维数组保存最终结果

        int startX = 0;     //设置每圈打印的开始位置，第一圈为[0][0]，第二圈为[1][1]......
        int startY = 0;

        int loop = n / 2;   //设置需要打印的圈数
        int mid = n / 2;    //对于n为奇数的情况，最中心的位置无法通过循环打印，需要单独处理，定义变量mid存储中心位置

        int count = 1;  //每次打印的数值
        int offset = 1; //左闭右开打印，为右侧留出的边界值大小

        int i;  //位置定位
        int j;

        while (loop != 0) {
            i = startX; //将位置设置在每圈的第一个点
            j = startY;

            //从左到右填充上行
            for (j = startY; j < startY + n - offset; j++) {    //横向填充，i不变，j自增。左闭右开，所以j需要遍历到startY+n-offset位置
                result[startX][j] = count++;    //按顺序存入数字
            }
            //从上到下填充右列
            for (i = startX; i < startX + n - offset; i++) {
                result[i][j] = count++;
            }
            //从右到左填充下行
            for (; j > startY; j--) {
                result[i][j] = count++;
            }
            //从下到上填充左列
            for (; i > startX; i--) {
                result[i][j] = count++;
            }
            //完成第一圈打印，更新第二圈打印的开始位置
            startX++;
            startY++;
            //第二圈除了需要右侧闭区间的留空外，还要减去第一圈两个数字的大小
            offset += 2;
            //圈数-1
            loop--;
        }
        if (n % 2 != 0) {   //如果n为奇数，中心点需单独处理
            result[mid][mid] = count;   //为中心的填充最大值
        }
        //返回结果数组
        return result;
    }
}
