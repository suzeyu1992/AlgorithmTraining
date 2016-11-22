package design.visitor;

/**
 * Author :  suzeyu
 * Time   :  2016-11-22  下午10:06
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription : CTO访问者, 关注技术层面
 */
public class CTOVisitor implements Visitor{
    @Override
    public void visit(Enginner enginner) {
        System.out.println("CTO访问--> 工程师 "+enginner.name + " . 代码行数 : "+enginner.getCodeLines());
    }

    @Override
    public void visit(Manager manager) {
        System.out.println("CTO访问--> 经理 "+manager.name  +" , 新产品数量: "+manager.getProducts());
    }
}
