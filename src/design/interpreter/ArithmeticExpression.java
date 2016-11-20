package design.interpreter;

/**
 * Author :  suzeyu
 * Time   :  2016-11-20  下午10:39
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription :   抽象的算术运算解释器   为所有解释器共性的提取
 */
public abstract class ArithmeticExpression {

    /**
     *  抽象的解释方法
     *  具体的解释逻辑有具体的子类实现
     */
    public abstract int interpret();
}
