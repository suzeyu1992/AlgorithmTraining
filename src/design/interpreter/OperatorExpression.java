package design.interpreter;

/**
 * Author :  suzeyu
 * Time   :  2016-11-20  下午10:40
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription :   运算符符号抽象解释器, 为所有运算符号解释器共性的提取
 */
public abstract class OperatorExpression extends ArithmeticExpression {

    // 声明两个变量存储运算符号两边数字解释器
    protected ArithmeticExpression exp1, exp2;


    public OperatorExpression(ArithmeticExpression exp1, ArithmeticExpression exp2){
        this.exp1 = exp1;
        this.exp2 = exp2;
    }


}
