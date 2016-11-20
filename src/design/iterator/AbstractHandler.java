package design.iterator;

/**
 * Author :  suzeyu
 * Time   :  2016-11-20  下午9:36
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription :   抽象处理者
 */
public abstract class AbstractHandler {

    protected AbstractHandler nextHandler;  // 下一个节点上的处理者对象

    /**
     *  处理请求
     */
    public final void handleRequest(AbstractRequest request){

        // 判断当前处理者对象的处理级别是否与请求者的处理级别一致
        if (getHandleLevel() == request.getRequestLevel()){
            // 一致则有该对象处理
            handle(request);
        }else {
            // 否则将对请求对象转发给下一个节点上的请求对象
            if (nextHandler != null){
                nextHandler.handleRequest(request);
            }else {
                // 当所有处理者对象都不能处理该请求时输出提示语句
                System.out.println("没有处理者可以处理请求");
            }
        }
    }

    /**
     *  获取处理者对象的处理等级
     */
    public abstract  int getHandleLevel();

    /**
     *  每个处理者对象的具体处理方法
     */
    protected abstract void handle (AbstractRequest request);
}
