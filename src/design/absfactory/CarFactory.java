package design.absfactory;

/**
 * Author :  suzeyu
 * Time   :  2016-11-20  下午8:27
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription : 抽象工厂类
 */
public abstract class CarFactory {

    /**
     * 生产轮胎
     */
    public abstract ITire createTire();

    /**
     * 生产发动机
     */
    public abstract IEngfine createEngfine();
}
