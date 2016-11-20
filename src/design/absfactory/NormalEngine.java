package design.absfactory;

import com.sun.xml.internal.ws.api.pipe.Engine;

/**
 * Author :  suzeyu
 * Time   :  2016-11-20  下午8:25
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription :   普通发动机
 */
public class NormalEngine implements IEngfine{
    @Override
    public void engine() {
        System.out.println("普通发动机");
    }
}
