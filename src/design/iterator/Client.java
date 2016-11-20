package design.iterator;

/**
 * Author :  suzeyu
 * Time   :  2016-11-20  下午9:49
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription :   客户端
 */
public class Client {

    public static void main(String args[]){

        // 构造3个处理者对象
        Handler1 handler1 = new Handler1();
        Handler2 handler2 = new Handler2();
        Handler3 handler3 = new Handler3();

        // 构造3个请求者对象
        Request1 re1 = new Request1("请求1");
        Request2 re2 = new Request2("请求2");
        Request3 re3 = new Request3("请求3");

        // 设置当前处理者对象下一个节点的处理者对象
        handler1.nextHandler = handler2;
        handler2.nextHandler = handler3;

        // 准备开始请求
        // 总是从链式的首端发起请求
        handler1.handleRequest(re1);
        handler1.handleRequest(re2);
        handler1.handleRequest(re3);
    }
}
