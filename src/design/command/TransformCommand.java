package design.command;

/**
 * Author :  suzeyu
 * Time   :  2016-11-20  下午10:19
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription :   具体命令者, 改变形状的命令类
 */
public class TransformCommand implements Command {

    // 持有一个接收者的对象的引用
    private TetrisMachine machine;

    public TransformCommand(TetrisMachine machine){
        this.machine = machine;
    }


    @Override
    public void execute() {
        // 调用具体的方法
        machine.transform();
    }
}
