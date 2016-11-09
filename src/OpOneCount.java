/**
 * Author :  suzeyu
 * Time   :  2016-11-09  下午11:46
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription :
 *              问题: 给定一个十进制正整数N, 写下从1开始, 到N的所有整数, 然后数一下其中出现所有1的个数.
 *
 *              例如: N=2, 1,2    这样就出现了1个'1'
 *                   N=12,  1,2,3,4,5,6,7,8,9,10,11,12  这样, 1的个数是5
 *
 *              分析常规算法 --> 最简单的方法就是从1开始遍历到N, 对每一个数中含有的1的个数累加起来
 */
public class OpOneCount {

    /**
     * 待测试的数字N
     */
    public static int testNum = 1002;

    public static void main(String args[]){
        // 解法一
        System.out.printf("解法一: 1的个数: %s \n",solution_1(testNum));

        // 解法二
        System.out.printf("解法二: 1的个数: %s \n",solution_2(testNum));
    }



    /**
     *   常规解法: 分析在类说明那些已经写出了思路
     *   时间复杂度为: O(N) * 计算一个整数数字里面 '1' 的个数的复杂度 = O(N * lgN)
     */
    public static int solution_1(int rawNum){
        int count = 0;      // 统计1出现的次数
        for (int i = 1; i <= rawNum ; i++) {
            int temp = i;


            while (temp > 0){
                count += (temp % 10 == 1) ? 1 : 0 ;
                temp /= 10;
            }
        }
        return count;
    }


    /**
     *  当上面的算法传入的数是一个很大的数时候, 计算会很慢. 因为不仅要一个一个数遍历, 还要对每一个数都进行全位数的遍历.
     *
     *  那么, 可不可以减低复杂度, 只对N有多少位就遍历多少遍呢?
     *      这个方法只要分析N就能得到f(N), 避开了从1到N的遍历. 输入长度为X的数字, 时间复杂度为O(X)
     *
     *      通过对每一位是会存在1的数进行统计
     *      然后通过分支确定每一个位是否是 0 1 或者其他  来算出不同出现1的具体次数. 并把所有位的次数进行累加
     */
    private static int solution_2(int testNum) {
        int iCount = 0 ;
        int iFactor = 1;

        int iLowerNum = 0;
        int iCurrNum = 0;
        int iHigherNum = 0;


        while ((testNum / iFactor) != 0){
            iLowerNum = testNum - (testNum / iFactor )*iFactor;
            iCurrNum = (testNum / iFactor) % 10;
            iHigherNum = testNum / (iFactor * 10);

            switch (iCurrNum){
                case 0:
                    // 当一个数为102时, 判断中间位只会出现如下场景次数
                    // 百位   十位  个位
                    // 0      1     0~9  十种情况

                    // ==> 高位 * 10^判断位数-1

                    iCount += iHigherNum * iFactor;
                    break;

                case 1:
                    // 当一个数为112时, 判断中间位只会出现如下场景次数
                    // 百位   十位  个位
                    // 0      1     0~9  十种情况
                    // 1      1     0,1,2

                    // ==> (高位 * 10^判断位数-1 ) + (低位个数 + 1)

                    iCount += iHigherNum * iFactor + iLowerNum + 1;
                    break;

                default:
                    // 当一个数为112时, 判断中间位只会出现如下场景次数
                    // 百位   十位  个位
                    // 0      1     0~9  十种情况
                    // 1      1     0~9  十种情况

                    // ==> (高位+1) * 10^判断位数-1
                    iCount += (iHigherNum + 1) * iFactor;
                    break;
            }

            iFactor *= 10;
        }


        return iCount;



    }
}
