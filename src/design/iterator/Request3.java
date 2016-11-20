package design.iterator;

/**
 * Author :  suzeyu
 * Time   :  2016-11-20  下午9:46
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription : 创立不同的请求者
 */
public class Request3 extends AbstractRequest{
    public Request3(Object obj) {
        super(obj);
    }

    @Override
    public int getRequestLevel() {
        return 3;
    }

}
