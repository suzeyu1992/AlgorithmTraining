package design.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Author :  suzeyu
 * Time   :  2016-11-20  下午9:59
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription :   程序员是观察者
 */
public class Coder implements Observer{

    public String name;

    public Coder(String name){
        this.name = name ;
    }


    @Override
    public void update(Observable o, Object arg) {
        System.out.printf("你好, %s, 你订阅的东西有更新了: %s \r\n", name, arg);
    }

    @Override
    public String toString() {
        return "码神->>"+name;
    }
}
