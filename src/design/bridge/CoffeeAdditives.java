package design.bridge;

/**
 * Author :  suzeyu
 * Time   :  2016-11-23  上午2:06
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription :
 */
public abstract class CoffeeAdditives {

    private String name;

    /**
     *  具体要往咖啡添加什么由子类实现
     */
    public abstract String addSomething();

    @Override
    public String toString() {
        return name;
    }
}
