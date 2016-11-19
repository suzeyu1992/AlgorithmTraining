package design.builder;

/**
 * Author :  suzeyu
 * Time   :  2016-11-19  下午10:42
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription :
 *                  计算机抽象类, 即Product角色
 */
public abstract class Computer {

    protected String mBoard;
    protected String mDisplay;
    protected String mOS;

    protected Computer(){}

    // 设置主板
    public void setBoard(String board){
        mBoard = board;
    }

    // 设置显示器
    public void setDisplay(String display){
        mDisplay = display;
    }

    // 设置操作系统
    public abstract void setOS();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("主板:").append(mBoard).append(", 显示器是:").append(mDisplay).append(", 操作系统是:").append(mOS);
        return sb.toString();
    }
}
