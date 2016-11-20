package design.interpreter;

/**
 * Author :  suzeyu
 * Time   :  2016-11-20  下午10:57
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription :   客户端测试类
 */
public class Client {

    public static void main(String arg[]){
        Calculator calculator = new Calculator("12 + 11 + 13 + 14");
        System.out.println(calculator.calculate());
    }
}
