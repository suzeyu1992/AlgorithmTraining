package design.proxy;

import java.lang.reflect.Proxy;

/**
 * Author :  suzeyu
 * Time   :  2016-11-23  上午12:11
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription : 客户类测试
 */
public class Clinet {

    public static void main(String args[]){
        // 构造一个起诉者
        ConcreteLawsuit concreteLawsuit = new ConcreteLawsuit();

        // 构造一个律师, 被代理者
        Lawyer lawyer = new Lawyer(concreteLawsuit);

        // 律师代理
        lawyer.submit();
        lawyer.burden();
        lawyer.defend();
        lawyer.finish();

        System.out.println("----------动态代理---------");
        // 构造一个动态代理
        DynamicProxy dynamicProxy = new DynamicProxy(concreteLawsuit);

        // 获取被代理者的ClassLoader
        ClassLoader classLoader = concreteLawsuit.getClass().getClassLoader();

        // 动态构造一个代理者律师
        ILawsuit law = (ILawsuit) Proxy.newProxyInstance(classLoader, new Class[]{ILawsuit.class}, dynamicProxy);

        // 动态调用
        law.submit();
        law.burden();
        law.defend();
        law.finish();
    }
}
