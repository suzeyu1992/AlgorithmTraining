package design.builder;

/**
 * Author :  suzeyu
 * Time   :  2016-11-19  下午11:02
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription :
 *
 *             测试类
 */
public class Test {
    public static void main(String ars[]){
        MacBuilder macBuilder = new MacBuilder();

        Director director = new Director(macBuilder);
        director.construct("Intel主板", "三星显示器");

        System.out.println("Computer Info: "+macBuilder.create().toString());
    }
}
