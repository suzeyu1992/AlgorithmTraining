package design.absfactory;

/**
 * Author :  suzeyu
 * Time   :  2016-11-20  下午8:27
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription :   普通零件生产工厂
 */
public class NormalFactory extends CarFactory {
    @Override
    public ITire createTire() {

        return new NormalTire();
    }

    @Override
    public IEngfine createEngfine() {
        return new NormalEngine();
    }
}
