package design.adapter.clz;

/**
 * Author :  suzeyu
 * Time   :  2016-11-23  上午12:54
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription : 类适配器模式
 */
public class Client {

    public static void main(String arg[]){
        VoltAdapter voltAdapter = new VoltAdapter();
        System.out.println("输出电压: " + voltAdapter.getVolt5());
    }
}
