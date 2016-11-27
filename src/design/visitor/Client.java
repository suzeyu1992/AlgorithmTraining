package design.visitor;

/**
 * Author :  suzeyu
 * Time   :  2016-11-22  下午10:42
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription : 测试客户端
 */
public class Client {

    public static void main(String args[]){
        // 构建报表
        BusinessReport report = new BusinessReport();

        System.out.println("----------给CEO看的报表----------");
        // 设置访问者, 这里是CEO
        report.showReport(new CEOVisitor());

        System.out.println("----------给CTO看的报表----------");
        // 注入另一访问者CTO
        report.showReport(new CTOVisitor());
    }
}
