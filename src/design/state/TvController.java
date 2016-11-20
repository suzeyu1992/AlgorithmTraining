package design.state;

/**
 * Author :  suzeyu
 * Time   :  2016-11-20  下午9:06
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription :   电视遥控器, 类似于经典状态中的Context
 */
public class TvController implements PowerController{

    /**
     * 标记状态
     */
    private TvState mTvState;

    private void setState(TvState state){
        mTvState = state;
    }

    @Override
    public void powerOn() {
        setState(new PowerOnState());
        System.out.println("开机了--");
    }

    @Override
    public void powerOff() {
        setState(new PowerOffState());
        System.out.println("关机了--");
    }

    public void nextChannel(){
        mTvState.nextChannel();
    }

    public void prevChannel(){
        mTvState.prevChannel();
    }

    public void turnUp(){
        mTvState.turnUp();
    }

    public void turnDown(){
        mTvState.turnDown();
    }
}
