package design.state;

/**
 * Author :  suzeyu
 * Time   :  2016-11-20  下午9:03
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription :   关机状态, 此时只有开机功能是有效的
 */
public class PowerOffState implements TvState{
    @Override
    public void nextChannel() {

    }

    @Override
    public void prevChannel() {

    }

    @Override
    public void turnUp() {

    }

    @Override
    public void turnDown() {

    }
}
