package design.mediator;

/**
 * Author :  suzeyu
 * Time   :  2016-11-22  下午11:02
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription : 抽象中介者
 */
public abstract class Mediator {

    /**
     * 同事对象改变时通知中介者方法
     * 在同事对象改变时由中介者去通知其他同时对象
     * @param colleague
     */
    public abstract void change(Colleague colleague);
}
