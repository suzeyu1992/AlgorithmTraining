package design.command;

/**
 * Author :  suzeyu
 * Time   :  2016-11-20  下午10:15
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription :   接收者角色, 俄罗斯方块游戏
 */
public class TetrisMachine {

    /**
     * 具体处理逻辑
     */
    public void toLeft(){
        System.out.println("向左");
    }

    /**
     * 具体处理逻辑
     */
    public void toRight(){
        System.out.println("向右");
    }

    /**
     * 具体处理逻辑
     */
    public void fastToBottom(){
        System.out.println("快速下落");
    }

    /**
     * 具体处理逻辑
     */
    public void transform(){
        System.out.println("改变形状");
    }
}
