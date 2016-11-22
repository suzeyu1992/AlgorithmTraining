package design.adapter.obj;


/**
 * Author :  suzeyu
 * Time   :  2016-11-23  上午12:54
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription : 对象适配器模式
 */
public class Client {

    public static void main(String arg[]){

        VoltAdapter voltAdapter = new VoltAdapter(new Volt220());
        System.out.println("输出电压: " + voltAdapter.getVolt5());
    }
}
