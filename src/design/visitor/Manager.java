package design.visitor;

import java.util.Random;

/**
 * Author :  suzeyu
 * Time   :  2016-11-22  下午9:58
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription : 经理类型
 */
public class Manager extends Staff {

    private int products ;

    public Manager(String name) {
        super(name);
        products = new Random().nextInt(10);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    /**
     *  一年内做的产品数量
     */
    public int getProducts(){

        return products;
    }
}
