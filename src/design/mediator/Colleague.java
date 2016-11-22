package design.mediator;

/**
 * Author :  suzeyu
 * Time   :  2016-11-22  下午11:06
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription : 抽象同事接口
 */
public abstract class Colleague {
    protected Mediator mediator;    // 每一个同事都应该知道中介者

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
