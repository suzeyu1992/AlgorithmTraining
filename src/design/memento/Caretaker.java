package design.memento;

/**
 * Author :  suzeyu
 * Time   :  2016-11-21  下午10:16
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription :   备忘录的操作者, 负责管理Memo
 */
public class Caretaker {

    Memo mMemo;     // 备忘录

    /**
     *  存档
     */
    public void archive(Memo memo){
        this.mMemo = memo;
    }

    /**
     *  获取存档
     */
    public Memo getMemo(){
        return mMemo;
    }
}
