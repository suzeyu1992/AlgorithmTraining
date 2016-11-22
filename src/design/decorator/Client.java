package design.decorator;

import sun.rmi.runtime.Log;

/**
 * Author :  suzeyu
 * Time   :  2016-11-23  上午1:13
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription : 客户端
 */
public class Client {

    public static void  main (String arg[]){

        // 首先需要一个男孩
        Boy boy = new Boy();

        // 然后为他穿上便宜的衣服
        LowCloth lowCloth = new LowCloth(boy);
        lowCloth.dressed();

        // 或者穿上比较上档次的衣服
        ExpensiceCloth expensiceCloth = new ExpensiceCloth(boy);
        expensiceCloth.dressed();
    }
}
