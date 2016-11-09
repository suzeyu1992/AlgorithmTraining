/**
 * Author :  suzeyu
 * Time   :  2016-11-05  下午11:17
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 *
 * ClassDescription : 求二进制数中1的个数
 */
public class AskBinaryOne {

    /**
     * byte 10001001  ==> int 137
     * 由于java中int表示字节是 有符号表示, 这也就是说int的-127 ~ 128 来表示字节0~256
     *
     * -1 是最大负数也就是字节最大数255
     * -127 为10000001 为十进制129
     * 得出结论如果字节数大于127, 那么int表示就是负数 公式为: 字节数值 - 256
     */
    public static byte mDate = 137 - 256;

    public static void main(String arg[]){

        // 使用解法1
        int oneResolver = CountOne(mDate);
        System.out.println("解法1中的结果为: "+oneResolver);


        // 使用解法2
        int twoResolver = countTwo(mDate);
        System.out.println("解法2中的结果为: "+twoResolver);

        // 使用解法3
        int threeResolver = countThree(mDate);
        System.out.println("解法3中的结果为: "+threeResolver);

    }

    /**
     * 解法1. 利用整型除法的特点, 时间复杂度为 O(log2 v), 就是二进制的位数
     *
     * 例如 10001001
     * 当第一次除以2的时候, 商为1000100, 余为1
     * 当第二次除以2的时候, 商为100010 , 余为0
     * ...
     * 直到除数为0
     *
     */
    public static int CountOne(byte source){
        int count = 0;
        // 首先把接收的二进制转换成正数
        int temp = (source + 256)%256;
        while (temp != 0){
            if (Math.abs((temp%2)) == 1 ){
                count++;
            }
            temp /= 2;
        }
        return count;
    }


    /**
     * 解法2. 由于上述使用了除法, 可以利用位运算来提高运行速度
     *
     * 例如 10001001   利用一个mask 0x1
     * 第一次 利用&按位与
     *  10001001
     *  00000001  &
     *  -----------
     *  00000001     把每次结果都累加起来后右移一位, 直到为0为止
     *
     *  此时的时间复杂度: 同样是二进制的位数  O(log2 v)
     */
    public static int countTwo(byte source){
        int count = 0;
        int temp = (source +256)%256;

        while (temp != 0){
            count += (temp & 0x1);
            temp >>= 1;
        }

        return count;
    }

    /**
     * 解法3. 上面虽然是位运算,  但是执行的次数还是二进制的位数, 有没有可能是只运算1的个数就可以?
     *
     * 10001001  每次减去1 得到的数与原值进行按位与. 可以跳过0的部分
     */
    public static int countThree(byte source){
        int count = 0;

        int temp = (source +256)%256;

        while (temp > 0){
            temp &= (temp - 1);
            count ++;
        }

        return count;
    }


}
