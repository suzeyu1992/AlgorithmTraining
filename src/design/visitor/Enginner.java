package design.visitor;

import java.util.Random;

/**
 * Author :  suzeyu
 * Time   :  2016-11-22  下午9:58
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription : 工程师
 */
public class Enginner extends Staff {

    public Enginner(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getCodeLines(){
        return new Random().nextInt(10 * 10000);
    }
}
