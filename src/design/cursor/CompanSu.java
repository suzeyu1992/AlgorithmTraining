package design.cursor;

import java.util.ArrayList;
import java.util.List;

/**
 * Author :  suzeyu
 * Time   :  2016-11-21  下午10:33
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription : 容器类
 */
public class CompanSu implements Company{

    private List<Employee> list = new ArrayList<>();

    public CompanSu(){
        list.add(new Employee("小敏", 99, "男", "程序员"));
        list.add(new Employee("小李", 98, "男", "程序员"));
        list.add(new Employee("小往", 11, "女", "程序员"));
        list.add(new Employee("小爱", 9, "女", "程序员"));
    }

    public List<Employee> getEmployees(){
        return list;
    }


    @Override
    public Iterator iterator() {
        return new SuIterator(list);
    }
}
