package sort;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.function.IntToDoubleFunction;

/**
 * Author :  suzeyu
 * Time   :  2016-11-16  下午8:59
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription :
 *              插入排序
 */
public class InsertSort {

    /**
     * 待排序数组
     */
    public static int[] sArrays = {3,1,6,7,4,2,8,9,5};

    public static void main(String arg[]){

        System.out.println("直接插入排序\n"+Arrays.toString(directInsert(Arrays.copyOf(sArrays, sArrays.length))));

        System.out.println("希尔排序\n"+Arrays.toString(directInsert(Arrays.copyOf(sArrays, sArrays.length))));


    }


    /**
     *  直接插入排序: 将一个记录插入到已经排好序的有序表中, 从而得到一个新的, 记录数增加1的有序表
     *
     *  分析:
     *      1. 快速插入需要一个哨兵点, 用来保存比较角标对应的值. (默认角标0为空数占位)
     *      2. 从角标2开始判断, 是否比前一个数小. (相当于原数组第二个值和第一个值进行比较)
     *      3. 如果小于前一个数, 那么就需要进行这个数之前的比较移位. 通过把这个数设置到哨兵位.用来保存和比较的操作.
     *          只要比哨兵位大的都需要向后移位, 直到出现小于等于哨兵位的数位置.
     *      4. 最后把哨兵归位到内循环判断值+1的位置
     *      5. 一直循环到最后一位即可
     */
    public static int[] directInsert(int []raw ){

        // 进行哨兵数组的创建 并进行数据迁移
        int[] ints = new int[raw.length+1];
        System.arraycopy(raw, 0, ints, 1, raw.length);

        // 开始排序
        int i, j;
        for(i=2; i<ints.length ; i++){

            // 开始判断前一位是否比当前位大, 如果大需要进行移位
            if (ints[i-1] > ints[i]){
                ints[0] = ints[i];         //  设置哨兵
                for (j=i-1; ints[j]>ints[0]; j--){
                    ints[j+1] = ints[j];   // 进行大数的后移
                }

                ints[j+1] = ints[0];       // 哨兵归位
            }
        }

        // 把带哨兵的数组中除了哨兵位其余都复制到传入的数组
        System.arraycopy(ints, 1, raw, 0, raw.length);

        return raw;

    }


    /**
     *  希尔排序
     */
    public static int[] shellSort(int []raw ){
        // 进行哨兵数组的创建 并进行数据迁移
        int[] ints = new int[raw.length+1];
        System.arraycopy(raw, 0, ints, 1, raw.length);

        int i, j;
        int increment = raw.length;

        do {
            increment = increment/3+1;      // 增量序列

            for (i = increment+1; i<ints.length ; i++){
                if (ints[i] < ints[i-increment]){
                    ints[0] = ints[i];      // 数组暂存
                    for (j=i-increment; (j>0) && (ints[0]<ints[j]) ; j-= increment){
                        ints[j+increment] = ints[i];        // 记录后移
                    }

                    ints[j+increment] = ints[0];    // 插入
                }
            }
        }while (increment > 1);





        // 把带哨兵的数组中除了哨兵位其余都复制到传入的数组
        System.arraycopy(ints, 1, raw, 0, raw.length);

        return raw;

    }



}
