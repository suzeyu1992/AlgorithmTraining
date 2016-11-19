package design.single;

/**
 * Author :  suzeyu
 * Time   :  2016-11-19  下午10:25
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription :
 *                  内部静态类单例模式
 */
public class InnerStaticSingle {

    public static InnerStaticSingle mInstance;

    private InnerStaticSingle(){}

    public static InnerStaticSingle getInstance(){

        return SingletonHolder.mInstance;
    }

    /**
     * 内部静态类, 只有在 InnerStaticSingle#getInstance()方法被调用的时候, 这个静态内部类才会进行类初始化
     */
    private static class SingletonHolder{
        private static final InnerStaticSingle mInstance = new InnerStaticSingle();
    }
}
