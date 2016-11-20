package design.factory;

/**
 * Author :  suzeyu
 * Time   :  2016-11-20  下午8:08
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription :   抽象工厂类
 */
public abstract class Factory {

    /**
     *  抽象工厂方法, 具体生产什么由子类实现
     *
     *  @return 具体的产品类
     */
    public abstract <T extends Product> T createProduct(Class<T> clz);
}
