package design.proxy;

/**
 * Author :  suzeyu
 * Time   :  2016-11-23  上午12:06
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription : 具体诉讼人, 被代理角色
 */
public class ConcreteLawsuit implements ILawsuit{
    @Override
    public void submit() {
        // 老板欠工资, 只好申诉
        System.out.println("老板欠工资, 只好申诉");
    }

    @Override
    public void burden() {
        // 证据充足
        System.out.println("所有合同和证物");
    }

    @Override
    public void defend() {
        // 证据真实有效
        System.out.println("证据真实有效!");
    }

    @Override
    public void finish() {
        // 结果
        System.out.println("诉讼成功, 等待老板发钱");
    }
}
