package design.facade;

/**
 * Author :  suzeyu
 * Time   :  2016-11-23  上午1:57
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription :
 */
public class PhoneImpl implements Phone {
    @Override
    public void call() {
        System.out.println("打电话");
    }

    @Override
    public void hangup() {
        System.out.println("挂断");
    }
}
