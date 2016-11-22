package design.visitor;

import java.util.Random;

/**
 * Author :  suzeyu
 * Time   :  2016-11-22  下午9:58
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription : 员工基类
 */
public abstract class Staff {


    // 员工 Kpi
    public int kpi;
    public String name;

    public Staff (String name){
        this.name = name;
        kpi = new Random().nextInt(10);
    }

    // 接收Visitor的访问
    public abstract void accept(Visitor visitor);


}
