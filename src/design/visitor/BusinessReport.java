package design.visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * Author :  suzeyu
 * Time   :  2016-11-22  下午10:43
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription :   员工业务报表
 */
public class BusinessReport {

    List<Staff> mStaffs = new LinkedList<Staff>();

    public BusinessReport() {
        mStaffs.add(new Manager("王经理"));
        mStaffs.add(new Enginner("工程师-jake"));
        mStaffs.add(new Enginner("工程师-小李"));
        mStaffs.add(new Enginner("工程师-小张"));
    }

    /**
     *  为访问者展示报表
     * @param visitor
     */
    public void showReport(Visitor visitor){
        for (Staff staff: mStaffs) {
            staff.accept(visitor);
        }
    }
}
