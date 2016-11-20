package design.absfactory;

/**
 * Author :  suzeyu
 * Time   :  2016-11-20  下午8:30
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription :   客户端使用类
 */
public class Client {

    public static void main(String args[]){
        CarFactory normalFactory = new NormalFactory();
        normalFactory.createEngfine().engine();
        normalFactory.createTire().tire();

        System.out.println("-------------------------------------");

        CarFactory suvFactory = new SUVFactory();
        suvFactory.createEngfine().engine();
        suvFactory.createTire().tire();
    }
}
