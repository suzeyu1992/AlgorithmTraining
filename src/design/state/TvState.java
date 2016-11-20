package design.state;

/**
 * Author :  suzeyu
 * Time   :  2016-11-20  下午9:02
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription :   电视状态接口, 定义了电视操作的函数
 */
public interface TvState {

    void nextChannel();
    void prevChannel();
    void turnUp();
    void turnDown();
}
