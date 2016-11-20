package design.interpreter;

/**
 * Author :  suzeyu
 * Time   :  2016-11-20  下午10:46
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription : 加法解释器
 */
public class AddExpression extends OperatorExpression{
    public AddExpression(ArithmeticExpression exp1, ArithmeticExpression exp2) {
        super(exp1, exp2);
    }

    @Override
    public int interpret() {
        return exp1.interpret() + exp2.interpret();
    }
}
