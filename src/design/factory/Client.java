package design.factory;

/**
 * Author :  suzeyu
 * Time   :  2016-11-20  下午8:14
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription : 客户端测试使用工厂方式
 */
public class Client {

    public static void main(String arg[]){
        ConcreteFactory factory = new ConcreteFactory();

        ConcreteProductA productA = factory.createProduct(ConcreteProductA.class);
        productA.method();

        ConcreteProductB productB = factory.createProduct(ConcreteProductB.class);
        productB.method();

    }
}
