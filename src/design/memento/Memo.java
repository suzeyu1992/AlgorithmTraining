package design.memento;

/**
 * Author :  suzeyu
 * Time   :  2016-11-21  下午10:10
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription :   备忘录类
 */
public class Memo {

    public int mCheckpoint;
    public int mLifeValue;
    public String mWeapon;

    @Override
    public String toString() {
        return "备忘信息: checkpoint="+ mCheckpoint +" ,mLifeValue="+mLifeValue +" ,mWeapon="+mWeapon;
    }
}
