package design.single;

/**
 * Author :  suzeyu
 * Time   :  2016-11-19  下午10:30
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription :
 *                  枚举单例
 */
public enum EnumSingle {
    INSTANCE;
    String string = testPrintf();
    public String testPrintf(){
        System.out.println("枚举单例被加载了");
        return "ok";
    }
}
