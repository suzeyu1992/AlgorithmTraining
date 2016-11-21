package design.cursor;

/**
 * Author :  suzeyu
 * Time   :  2016-11-21  下午10:33
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription : 容器类
 */
public class CompanLi implements Company{

    private Employee[] array = new Employee[2];

    public CompanLi(){
        array[0] = (new Employee("大敏", 66, "妖", "未知"));
        array[1] = (new Employee("大李", 66, "妖", "未知"));
    }

    public Employee[] getEmployees(){
        return array;
    }


    @Override
    public Iterator iterator() {
        return new LiIterator(array);
    }
}
