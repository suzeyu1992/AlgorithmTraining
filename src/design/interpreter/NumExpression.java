package design.interpreter;

/**
 * Author :  suzeyu
 * Time   :  2016-11-20  下午10:40
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription :   数字解释器, 仅仅是为了解释数字
 */
public class NumExpression extends ArithmeticExpression {

    private int num;

    public NumExpression(int num){
        this.num = num;
    }

    @Override
    public int interpret() {

        return num;
    }
}
