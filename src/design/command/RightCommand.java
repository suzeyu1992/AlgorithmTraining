package design.command;

/**
 * Author :  suzeyu
 * Time   :  2016-11-20  下午10:19
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription :   具体命令者, 向右移动的命令类
 */
public class RightCommand implements Command {

    // 持有一个接收者的对象的引用
    private TetrisMachine machine;

    public RightCommand(TetrisMachine machine){
        this.machine = machine;
    }


    @Override
    public void execute() {
        // 调用具体的方法
        machine.toRight();
    }
}
