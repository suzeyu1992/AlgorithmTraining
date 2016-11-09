/**
 * Author :  suzeyu
 * Time   :  2016-11-09  下午9:52
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription :
 *          问题: 给定一个整数N, 那么N的阶乘N!末尾有多少个0呢?
 *              例如: N=10!   , N! = 3268800 末尾存在两个
 */
public class FactorialOpZero {

    /**
     * 定义需要求阶乘的 变量值
     */
    public static int testNum = 10;

    public static void main(String args[]){

        // 解法一
        System.out.printf("解法一: %s!中末尾0的个数: %s \n",testNum,solution_1(testNum));


        // 解法一
        System.out.printf("解法二: %d!中末尾0的个数: %d",testNum,solution_2(testNum));

    }

    /**
     * 解法1:
     *      由于题目中, 要求的是末尾的0的个数, 那么如果从'哪些数相乘可以得到10?'这个角度出发, 就可以让问题变得简单.
     *      对一个末尾的0可以形成的原因只会是2*5. 由于出现一次5的时候最少会出现2 4,这种情况, 所以最后我们只要关心出
     *      N!中0~N中每一个数存在5的倍数的情况即可.
     *
     * @param factorialNum  需要计算数的阶乘
     * @return  返回阶乘结果中末尾0的个数
     */
    public static int solution_1(int factorialNum){

        long start = System.nanoTime();

        int count = 0;      // 用于统计5的个数

        for (int i = 1; i <= factorialNum; i++) {
            int temp = i;
            while (temp%5 == 0){
                count ++;
                temp /= 5;
            }
        }
        System.out.println("解法1执行的时间:"+(System.nanoTime()-start)+"纳秒");
        return count;
    }


    /**
     * 解法2:
     *     解法1中, 需要遍历每一个数, 并对每一个数进行5的倍数的个数计算. 那么可以不用计全部数的方法呢?
     *
     *     利用阶乘的求质因数个数的公式==>
     *     例如: N!中质因数5的个数
     *     质因数的个数 = [N/5^1] + [N/5^2] + [N/5^3]...   直到数K满足 5^k > N, [N/5^k]=0
     *
     * @param factorialNum  需要计算数的阶乘
     * @return  返回阶乘结果中末尾0的个数
     */
    public static int solution_2(int factorialNum){
        long start = System.nanoTime();

        int count = 0;
        while (factorialNum != 0){
            count += factorialNum/5;
            factorialNum = factorialNum / 5;
        }
        System.out.println("解法1执行的时间:"+(System.nanoTime()-start)+"纳秒");

        return count;
    }



}
