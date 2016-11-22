package design.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Author :  suzeyu
 * Time   :  2016-11-23  上午12:14
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription : 动态代理者
 */
public class DynamicProxy implements InvocationHandler {

    private Object obj;     // 被代理的引用

    public DynamicProxy(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 调用被代理对象的方法
        Object result = method.invoke(obj, args);
        return result;
    }
}
