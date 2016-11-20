package design.command;

/**
 * Author :  suzeyu
 * Time   :  2016-11-20  下午10:24
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription :   请求者类, 命令由按钮发起
 */
public class Buttons {

    private Command mLeftCom;
    private Command mRightCom;
    private Command mFastCom;
    private Command mTransformCom;

    public void setmLeftCom(Command mLeftCom) {
        this.mLeftCom = mLeftCom;
    }

    public void setmRightCom(Command mRightCom) {
        this.mRightCom = mRightCom;
    }

    public void setmFastCom(Command mFastCom) {
        this.mFastCom = mFastCom;
    }

    public void setmTransformCom(Command mTransformCom) {
        this.mTransformCom = mTransformCom;
    }

    public void toLeft(){
        mLeftCom.execute();
    }

    public void toRight(){
        mRightCom.execute();
    }

    public void fast(){
        mFastCom.execute();
    }

    public void transform(){
        mTransformCom.execute();
    }


}
