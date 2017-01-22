package struct.linear;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Author :  suzeyu
 * Time   :  2017-01-21  下午7:57
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription : 简易顺序存储结构
 */
public class  SequenceStruct<T> {

    /**
     * 容器的的最大存储元素个数 (默认存储10个元素大小)
     */
    private int mMaxSize = 10;

    /**
     * 存储数据的容器数组
     */
    private Object[]  mDatas;

    /**
     * 当前容器中最后一个元素的小标
     * 当小标=-1时. 说明数据集合为空集合
     */
    private int mLastElementIndex = -1;

    public SequenceStruct(){
        mDatas = new Object[mMaxSize];
    }

    public void add(T addObject){
        if ( mLastElementIndex >= (mMaxSize - 1)){

            // 当前数组已被填满, 需要扩大数组的长度
            Object[] objects = new Object[mMaxSize * 2];

            System.arraycopy(mDatas , 0, objects, 0, mDatas.length);

            mMaxSize *= 2;
            mDatas = objects;

            // 可以直接插入元素到数组
            mDatas[++mLastElementIndex] = addObject;

            System.out.println("数据集合扩容完毕, 当前集合大小为:" +mDatas.length+"    数据元素为:"+ toString());
        }else {

            // 可以直接插入元素到数组
            mDatas[++mLastElementIndex] = addObject;
        }
    }

    public T get(int index){

        if (index > mLastElementIndex || index < 0){
            return null;
        }

        return (T) mDatas[index];
    }

    public boolean remove(int index){
        if (index > mLastElementIndex || index < 0){
            return false;
        }

        for (int i = index; index < mLastElementIndex; index++){
            mDatas[index] = mDatas[index+1];
        }

        // 删除最后一个重复元素
        mDatas[mLastElementIndex--] = null;

        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= mLastElementIndex; i++) {
            sb.append(((T)mDatas[i]).toString()+",").append('\t');
        }

        return  sb.toString();
    }
}
