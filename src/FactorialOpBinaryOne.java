/**
 * Author :  suzeyu
 * Time   :  2016-11-09  下午10:35
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription :
 *          问题: 要求N!中的二进制表示中最低位是1位置
 *          例如: N=3  N!=6  ==> 1010 最低位1在.
 *
 *          分析: 对一个数的二进制分析, 并且判断最后末尾1的情况.
 *          一个二进制如果最低位是1那么这个数就是奇数, 否则就是偶数. 而对一个二进制中低位方向的1移动到最低位那么做的操作就是不断右移,
 *          不断右移 对于算术运算中就是不断的/2, 那么这道题目可以认为就是求 N!含有质因数2的个数
 */
public class FactorialOpBinaryOne {

    /**
     * 定义需要求阶乘的 变量值
     */
    public static int testNumm = 100;

    public static void main(String args[]){

        // 解法一
        System.out.printf("解法一: %s!中末尾0的个数: %s \n",testNumm,solution_1(testNumm));


        // 解法一
        System.out.printf("解法二: %d!中末尾0的个数: %d",testNumm,solution_2(testNumm));

    }



    private static int solution_1(int testNum) {

        int count = 0;
        while(testNum != 0){
            testNum >>= 1;
            count += testNum;
        }
        return count;
    }


    /**
     *  通过公式: N!含有的质因数2的个数, 还等于N减去N的二进制中1的数目
     *      可以利用此公式计算:
     *      推到公式: N=11011; 通过N!含有质因数公式= [n/2] + [n/4] + [n/8]...
     *      个数 num = 1101 + 110 + 11 + 1
     *              = (1000 + 100 + 1) + (100 + 10) + (10 + 1) + (1)
     *              = (1000 + 100 +10 +10) + (100 + 10 +1) +1
     *              = 1111 + 111 + 1
     *              = (10000 -1) + (1000 - 1) + (10 -1) + (1 - 1)
     *              = 11011 - N的二进制个数
     *
     *
     */
    private static int solution_2(int testNum) {

        int oneCount = 0;   /// /二进制中1的个数
        int copy = testNum;
        while (testNum != 0){
            testNum &= (testNum - 1);
            oneCount++;
        }



        return copy - oneCount;
    }

}
