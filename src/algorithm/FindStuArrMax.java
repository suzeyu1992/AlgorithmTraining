package algorithm;

/**
 * Author :  suzeyu
 * Time   :  2016-11-14  下午8:42
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 *
 * ClassDescription :
 *              问题: 求数组的子数组的最大数之和
 *
 *              例如: -2, 5, 3, -6, 4 , -8, 6
 *                  子数组说明是连续的某一个数.
 *
 */
public class FindStuArrMax {
    public static int[] sTestData = {-2, 5, 3, -6, 4, -8, 6};


    public static void main(String arg[]) {
        int result = resolver_1(sTestData);
        System.out.printf("解法一: 求得子数组最大和为:%d\r\n", result);


        System.out.printf("解法二: 求得子数组最大和为:%d\r\n", resolver_2(sTestData));

    }

    /**
     * 解法1:
     * 思路: 对数组组合起来的所有子数组进行比较
     * 时间复杂度: O(N^2)
     */
    private static int resolver_1(int[] arrs) {

        int max = -Integer.MAX_VALUE;

        for (int i = 0; i < arrs.length; i++) {

            int sum = 0;

            for (int j = i; j < arrs.length; j++) {
                sum += arrs[j];
                if (sum > max) {
                    max = sum;
                }
            }

        }

        return max;
    }

    /**
     *  解法2:
     *      总结一下. 求一个子数组和最大. 那么从头开始看的话. 如果是负数那么肯定没有必要考虑负数的场景(包括前面几个数的累加如果
     *      是负数那么同样做归零的操作).直到第一个正整数开始. 利用一个start变量每次循环还是都是保持正整数的形式. 如果为负整数那么
     *      可以认为相加仍何一个正整数都会小于这个正整数. 所以舍弃对负整数结果的操作. 把每一次循环的结果如果是最大进行保存
     *
     *      利用简单几个数推导一下, 即可理解.  时间复杂度为O(length)
     */
    private static int resolver_2(int[] arrs) {
        int length = arrs.length;
        int nStart = arrs[length - 1];
        int nAll = arrs[length - 1];
        for (int i = length - 2; i >= 0; i--) {
            if (nStart < 0) {
                nStart = 0;
            }

            nStart += arrs[i];

            if (nStart > nAll) {
                nAll = nStart;
            }
        }
        return nAll;
    }
}
