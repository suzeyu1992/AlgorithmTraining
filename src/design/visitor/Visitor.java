package design.visitor;

/**
 * Author :  suzeyu
 * Time   :  2016-11-22  下午9:54
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription : 不同访问者的共同特性
 */
public interface Visitor {

    // 访问工程师类型
     void visit(Enginner enginner);

    // 访问经理类型
     void visit(Manager manager);
}
