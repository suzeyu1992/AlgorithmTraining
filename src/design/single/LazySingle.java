package design.single;

/**
 * Author :  suzeyu
 * Time   :  2016-11-19  下午10:22
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription :
 *
 *              懒汉式单例
 *                  DCL  --> Double Check Locked
 */
public class LazySingle {

    private static volatile LazySingle mInstance;

    private LazySingle(){}

    public static LazySingle getInstance(){

        if (null == mInstance){
            synchronized (LazySingle.class){
                if (null == mInstance){
                    mInstance = new LazySingle();
                }
            }
        }

       return mInstance;
    }
}
