package design.observer;

/**
 * Author :  suzeyu
 * Time   :  2016-11-20  下午10:07
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription :   测试观察者模式
 */
public class Test {

    public  static void main(String arg[]){
        // 创建被观察对象
        DecTechFrontier decTechFrontier = new DecTechFrontier();

        // 创建几个观察者
        Coder co1 = new Coder("张飞");
        Coder co2 = new Coder("李逵");
        Coder co3 = new Coder("关羽");
        Coder co4 = new Coder("孙悟空");

        // 将观察者注册到被观察的对象
        decTechFrontier.addObserver(co1);
        decTechFrontier.addObserver(co2);
        decTechFrontier.addObserver(co4);
        decTechFrontier.addObserver(co3);

        // 发布消息
        decTechFrontier.postNewPublication("葵花宝典");
    }

}
