package design.absfactory;

/**
 * Author :  suzeyu
 * Time   :  2016-11-20  下午8:25
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription :   普通发动机
 */
public class SUVEngine implements IEngfine{
    @Override
    public void engine() {
        System.out.println("高级发动机");
    }
}
