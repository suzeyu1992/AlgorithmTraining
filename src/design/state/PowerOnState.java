package design.state;

/**
 * Author :  suzeyu
 * Time   :  2016-11-20  下午9:03
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription :   开机状态, 此时再出发开机功能不做任何事情
 */
public class PowerOnState implements TvState{
    @Override
    public void nextChannel() {
        System.out.println("下一个频道");
    }

    @Override
    public void prevChannel() {
        System.out.println("上一个频道");
    }

    @Override
    public void turnUp() {
        System.out.println("调高音量");
    }

    @Override
    public void turnDown() {
        System.out.println("减低音量");
    }
}
