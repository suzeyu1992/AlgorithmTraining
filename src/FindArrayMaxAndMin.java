/**
 * Author :  suzeyu
 * Time   :  2016-11-14  下午7:18
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 *
 * ClassDescription :
 *                 问题: 寻找数组中的最大值和最小值
 *
 *                 解法1: 最简单的就是对一个数组的最大值和最小值看成两个对立问题,
 *                       遍历数组, 每个数都进行最大数和最小数的对比. 时间复杂度为O(2n)
 *                 解法2: 下面写出..
 */
public class FindArrayMaxAndMin {

    public  static int[] sTestData = {5, 6, 8, 3, 7, 9,-80};



    public static void main(String arg[]){
        int []result = resolver_1(sTestData);
        System.out.printf("最大数为%d, 最小数为%d\r\n", result[1], result[0]);

    }

    /**
     *    解法2: 对数组两两一对进行排序.  大数和大数比较小数和小数比较
     */
    private static int[] resolver_1(int[] data) {

        int max = data[0], min = data[0];
        int tempMax = 0, tempMin = 0;

        for (int i = 0; i < data.length ; i *=2) {
            // 首先对数组的两个数进行比较
            if (data[i] > data[i+1]){
                tempMax = data[i];
                tempMin = data[i+1];
            }else {
                tempMin = data[i];
                tempMax = data[i+1];
            }

            // 比对已经存在的最大值和最小值
            if (tempMax > max){
                max = tempMax;
            }
            if (tempMin < min){
                min = tempMin;
            }

            // 对数组是单次的情况进行额外判断
            if (data.length % 2 == 1){
                if (data[data.length-1] > max){
                    max = data[data.length-1];
                }

                if (data[data.length-1] < min){
                    min = data[data.length-1];
                }
            }
            if (i==0){
                i++;
            }
        }

        return new int[]{min,max};
    }

}
