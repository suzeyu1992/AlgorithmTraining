package design.single;

/**
 * Author :  suzeyu
 * Time   :  2016-11-19  下午10:20
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription :
 *                  饿汉式单例
 */
public class HungrySingle {

    private static HungrySingle mInstance = new HungrySingle();

    private HungrySingle(){}

    public static HungrySingle getInstance(){
        return mInstance;
    }
}
