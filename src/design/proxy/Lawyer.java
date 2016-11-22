package design.proxy;

/**
 * Author :  suzeyu
 * Time   :  2016-11-23  上午12:09
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription : 律师, 代理者角色 , 和真实诉讼者实现同一个接口
 */
public class Lawyer implements ILawsuit{

    private ILawsuit mLawsuit;      // 持有一个具体被代理者的引用

    public Lawyer(ILawsuit mLawsuit) {
        this.mLawsuit = mLawsuit;
    }

    @Override
    public void submit() {
        mLawsuit.submit();
    }

    @Override
    public void burden() {
        mLawsuit.burden();
    }

    @Override
    public void defend() {
        mLawsuit.defend();
    }

    @Override
    public void finish() {
        mLawsuit.finish();
    }
}
