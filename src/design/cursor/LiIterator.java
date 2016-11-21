package design.cursor;

import java.util.List;

/**
 * Author :  suzeyu
 * Time   :  2016-11-21  下午10:24
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription :   具体实现的迭代器, 本类中是数组容器
 */
public class LiIterator implements Iterator {

    private Employee[] array;
    private int position;

    public LiIterator(Employee[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return !(position > array.length -1 || array[position] == null);
    }

    @Override
    public Object next() {
        Employee e = array[position];
        position++;
        return e;
    }
}
