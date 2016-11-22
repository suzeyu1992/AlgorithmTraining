package design.mediator;

/**
 * Author :  suzeyu
 * Time   :  2016-11-22  下午11:34
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription : 模拟客户端
 */
public class Client {

    public static void main(String arg[]){

        // 构造主板对象
        MainBoard mainBoard = new MainBoard();

        // 构造各个零件同事
        CDDevice cdDevice = new CDDevice(mainBoard);
        CPU cpu = new CPU(mainBoard);
        GraphicsCard graphicsCard = new GraphicsCard(mainBoard);
        SoundCard soundCard = new SoundCard(mainBoard);

        // 将各个部件安装到主板
        mainBoard.setCdDevice(cdDevice);
        mainBoard.setCpu(cpu);
        mainBoard.setGraphicsCard(graphicsCard);
        mainBoard.setSoundCard(soundCard);

        // 完成后开始放片
        cdDevice.load();
    }
}
