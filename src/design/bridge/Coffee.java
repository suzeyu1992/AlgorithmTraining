package design.bridge;

/**
 * Author :  suzeyu
 * Time   :  2016-11-23  上午2:05
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription : 定义一个coffee类
 */
public abstract class Coffee {

    protected CoffeeAdditives impl;

    public Coffee(CoffeeAdditives impl) {
        this.impl = impl;
    }

    /**
     *  咖啡具体是什么样子由子类来实现
     */
    public abstract void  makeCoffee();
}
