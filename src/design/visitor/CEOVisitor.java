package design.visitor;

/**
 * Author :  suzeyu
 * Time   :  2016-11-22  下午10:06
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription : CEO访问者, 只关注业绩
 */
public class CEOVisitor implements Visitor{
    @Override
    public void visit(Enginner enginner) {
        System.out.println("CEO访问--> 工程师"+enginner.name + " . KPI : "+enginner.kpi);
    }

    @Override
    public void visit(Manager manager) {
        System.out.println("CEO访问--> 经理"+manager.name + " . KPI : "+manager.kpi +" , 新产品数量: "+manager.getProducts());
    }
}
