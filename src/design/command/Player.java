package design.command;

/**
 * Author :  suzeyu
 * Time   :  2016-11-20  下午10:28
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription :   客户端类
 */
public class Player {

    public static void main(String arg[]){

        // 创建游戏
        TetrisMachine machine = new TetrisMachine();

        // 根据游戏构造四个命令
        LeftCommand leftCommand = new LeftCommand(machine);
        RightCommand rightCommand = new RightCommand(machine);
        FastCommand fastCommand = new FastCommand(machine);
        TransformCommand transformCommand = new TransformCommand(machine);

        // 按钮可以执行不同的命令
        Buttons buttons = new Buttons();
        buttons.setmLeftCom(leftCommand);
        buttons.setmRightCom(rightCommand);
        buttons.setmFastCom(fastCommand);
        buttons.setmTransformCom(transformCommand);

        // 具体按下那个按钮玩家说的算
        buttons.toLeft();
        buttons.toRight();
        buttons.fast();
        buttons.transform();
    }
}
