package design.state;

/**
 * Author :  suzeyu
 * Time   :  2016-11-20  下午9:11
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription :   客户端使用
 */
public class Client {

    public static void main(String arg[]){
        TvController tvController = new TvController();

        // 开机
        tvController.powerOn();

        // 下一个频道
        tvController.nextChannel();

        // 调高音量
        tvController.turnUp();

        // 关机
        tvController.powerOff();

        // 关机状态下调低音量
        tvController.turnDown();
    }
}
