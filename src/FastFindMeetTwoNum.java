/**
 * Author :  suzeyu
 * Time   :  2016-11-14  下午8:04
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 *
 * ClassDescription :
 *                 问题: 给定一个数组, 快速的找出这个满足条件的两个数.
 *                 例如: 数组 [5, 6, 1, 4, 7, 9, 8].   给定一个10. 查找出至少一组符合的解
 *
 *                 解法1: 穷举, 依次遍历每个元素与其他元素的的和是否满足.
 *                       时间复杂度为N*(N-1)  也就是O(N^2). 太慢舍弃
 *
 */
public class FastFindMeetTwoNum {

    public  static int[] sTestData = {5, 6, 8, 3, 7, 9,-80};



    public static void main(String arg[]){
        int []result = resolver_1(sTestData);
        System.out.printf("最大数为%d, 最小数为%d\r\n", result[1], result[0]);

    }

    /**
     *  首先对给定的数值 对数组元素进行另一部的的求解(时间复杂度为N). 只需要一次
     *  对原数组进行有序排列 时间复杂度(Nlog2 N) 只需要一次
     *  然后对结果集中的数字, 在对应的有序数组中查找需要Nlog2 N
    **/
    private static int[] resolver_1(int[] sTestData) {
        return new int[0];
        // TODO 待实现
    }

    /**
     * 另一种做法:
     *      首先对数组进行排序, 时间复杂度为(Nlog2 N)
     *      然后令 i=0, j=n-1, 看arr[i]+arr[j]是否等于sum, 如果等于那么就结束.
     *      如果小于, 那么 i=i+1, 如果大于, j=j-1. 这样只需要在排序好的数组上遍历一遍,就可以
     *      得到最后的结果, 时间复杂度为O(N)两步加起来总的时间复杂度 O(Nlog2 N)
     *      */
}
