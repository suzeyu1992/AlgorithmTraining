package design.decorator;

/**
 * Author :  suzeyu
 * Time   :  2016-11-23  上午1:09
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription : 这是一个穿高档衣服的人
 */
public class ExpensiceCloth  extends PersonCloth{
    public ExpensiceCloth(Person mPerson) {
        super(mPerson);
    }

    private void dressShirt(){
        System.out.println("穿短袖");
    }

    private void dressLeather(){
        System.out.println("穿皮衣");
    }

    private void dressJean(){
        System.out.println("穿牛仔裤");
    }

    @Override
    public void dressed() {
        super.dressed();
        dressShirt();
        dressLeather();
        dressJean();
    }
}
