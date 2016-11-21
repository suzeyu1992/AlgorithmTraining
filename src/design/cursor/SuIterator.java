package design.cursor;

import java.util.List;

/**
 * Author :  suzeyu
 * Time   :  2016-11-21  下午10:24
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription :   具体实现的迭代器, 本类中是list容器
 */
public class SuIterator implements Iterator {

    private List<Employee> list;
    private int position;

    public SuIterator(List<Employee> list){
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return !(position > list.size() -1 || list.get(position) == null);
    }

    @Override
    public Object next() {
        Employee e = list.get(position);
        position++;
        return e;
    }
}
