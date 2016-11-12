/**
 * Author :  suzeyu
 * Time   :  2016-11-12  下午11:18
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 *
 * ClassDescription :
 *
 *              问题: 最大公约数
 *
 *              例如给定两个数 1100100210001, 120200021 求出其最大公约数
 *
 *              加法3. 未实现
 */
public class MaxCommonDivisor {

    public static int mData1 = 42, mData2 = 37;

    public static void main(String args[]){

        int result_1 = resolver1(mData1, mData2);
        System.out.println("解法一的结果: "+result_1);

        int result_2 = resolver2(mData1, mData2);
        System.out.println("解法二的结果: "+result_2);
    }



    /**
     *  解法1:  辗转相除法
     *        如果求两个数的最大公约数: f(x, y) = f(y, x%y)  条件(x>=y>0). 当一个数为0, 另一个数就是最大公约数
     *
     *        例如 42 30
     *          f(42, 30) ==> f(30, 42%30=12) ==> f(12, 30%12=6) ==> f(6 , 12%6=0) ==> f(6,0);
     *          最大公约数就是6
     *
     */
    private static int resolver1(int mData1, int mData2) {

        return mData2 != 0 ? resolver1(mData2, mData1%mData2) : mData1;
    }


    /**
     *  解法二: 对于解法1而言, 如果数目很大那么. 取模运算是一个浪费耗时的过程, 是否可以利用加减法进行替换?
     *
     *         如果一个数可以同时整除x,y. 那么这个数同样可以整除x-y,y. 反推同样成立. 所以这两个关系是中的
     *         数1和数2的公约数是相等的. 利用这个特性我们就可以利用减法来简化
     */
    private static int resolver2(int mData1, int mData2) {

        if (mData1 < mData2){           // 防止计算出负数, 并且 f(x, y). 和f(y, x)是相等的.
            return resolver2(mData2, mData1);
        }else if (mData1 == mData2){
            return mData1;
        }else {
            return resolver2(mData1-mData2, mData2);
        }
    }

}
