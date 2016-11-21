package design.template;

/**
 * Author :  suzeyu
 * Time   :  2016-11-21  下午10:49
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription :   Coder的计算机
 */
public class CodeComputer extends AbsComputer{



    @Override
    protected void login() {
        System.out.println("需要密码");
    }
}
