package design.observer;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;

/**
 * Author :  suzeyu
 * Time   :  2016-11-20  下午10:02
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription :   被观察者, 当内容有更新的时候, 会通知所有的观察者
 */
public class DecTechFrontier extends java.util.Observable{

    public void postNewPublication(String content){

        // 标识状态或者内容发生改变
        setChanged();
        // 通知所有观察者
        notifyObservers(content);
    }
}
