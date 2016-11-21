package design.template;

/**
 * Author :  suzeyu
 * Time   :  2016-11-21  下午10:49
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription :   军用计算机
 */
public class MilitaryComputer extends AbsComputer{

    @Override
    protected void checkHardware() {
        super.checkHardware();
        System.out.println(">> 需要检测防火墙");
    }

    @Override
    protected void login() {
        System.out.println("需要进行眼膜验证");
    }
}
