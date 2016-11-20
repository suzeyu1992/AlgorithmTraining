package design.iterator;

/**
 * Author :  suzeyu
 * Time   :  2016-11-20  下午9:41
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription :   抽象请求者
 */
public abstract class AbstractRequest {

    private Object obj ;        // 处理对象

    public AbstractRequest(Object obj){
        this.obj = obj;
    }

    /**
     *  获取处理内容
     */
    public Object getContent(){
        return obj;
    }

    /**
     *  获取请求级别
     */
    public abstract int getRequestLevel();
}
