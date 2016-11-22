package design.proxy;

/**
 * Author :  suzeyu
 * Time   :  2016-11-23  上午12:04
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription :   诉讼接口类
 */
public interface ILawsuit {

    // 提交申请
    void submit();

    // 进行举证
    void burden();

    // 开始辩护
    void defend();

    // 诉讼完成
    void finish();

}
