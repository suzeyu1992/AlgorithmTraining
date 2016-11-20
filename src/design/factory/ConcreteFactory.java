package design.factory;

/**
 * Author :  suzeyu
 * Time   :  2016-11-20  下午8:08
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription :   具体工厂类
 */
public  class ConcreteFactory extends Factory{

    /**
     *  抽象工厂方法, 具体生产什么由子类实现
     */
    public <T extends Product> T createProduct(Class<T> clz){
        Product p = null;

        try {
            p = (Product) Class.forName(clz.getName()).newInstance();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return (T) p;
    }

}
