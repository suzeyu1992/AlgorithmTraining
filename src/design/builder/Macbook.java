package design.builder;

/**
 * Author :  suzeyu
 * Time   :  2016-11-19  下午10:49
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription :
 *              具体的 product类
 */
public class Macbook extends Computer {

    protected Macbook(){}

    @Override
    public void setOS() {
        mOS = "Mac OS 11";
    }
}
