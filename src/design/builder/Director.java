package design.builder;

/**
 * Author :  suzeyu
 * Time   :  2016-11-19  下午10:59
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription :
 *
 *          同一封装类
 */
public class Director {

    Builder mBuilder = null;

    public Director(Builder builder){
        mBuilder = builder;
    }

    /**
     * 构建对象
     */
    public void construct(String board, String display){
        mBuilder.buildBoard(board);
        mBuilder.buildDisplay(display);
        mBuilder.buildOS();
    }
}
