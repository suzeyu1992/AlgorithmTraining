package design.builder;

/**
 * Author :  suzeyu
 * Time   :  2016-11-19  下午10:52
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription :
 *              抽象builder
 */
public abstract class Builder {

    // 设置主机
    public abstract void buildBoard(String board);

    // 设置显示器
    public abstract void buildDisplay(String display);

    // 设置操作系统
    public abstract void buildOS();

    // 创建computer
    public abstract Computer create();
}
