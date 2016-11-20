package design.iterator;

/**
 * Author :  suzeyu
 * Time   :  2016-11-20  下午9:48
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription :   创立不同的请求者
 */
public class Handler3 extends AbstractHandler{
    @Override
    public int getHandleLevel() {
        return 3;
    }

    @Override
    protected void handle(AbstractRequest request) {
        System.out.println("处理者 3 处理请求, 请求的等级为: "+request.getRequestLevel());
    }
}
