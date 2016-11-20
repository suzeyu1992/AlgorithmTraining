package design.absfactory;

/**
 * Author :  suzeyu
 * Time   :  2016-11-20  下午8:27
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription :   高级零件生产工厂
 */
public class SUVFactory extends CarFactory {
    @Override
    public ITire createTire() {

        return new SUVTire();
    }

    @Override
    public IEngfine createEngfine() {
        return new SUVEngine();
    }
}
