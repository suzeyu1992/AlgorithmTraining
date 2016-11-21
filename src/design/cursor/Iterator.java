package design.cursor;

/**
 * Author :  suzeyu
 * Time   :  2016-11-21  下午10:22
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription :   定义一个迭代器接口
 */
public interface Iterator {

    /**
     *  判断是否有下一个元素
     */
    boolean hasNext();

    /**
     *  返回当前位置的元素, 并将位置移动到下一位
     */
    Object next();
}
