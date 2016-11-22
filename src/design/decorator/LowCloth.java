package design.decorator;

/**
 * Author :  suzeyu
 * Time   :  2016-11-23  上午1:11
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription : 这是一个穷人  穿的很少
 */
public class LowCloth extends PersonCloth {
    public LowCloth(Person mPerson) {
        super(mPerson);
    }

    public void dressShorts(){
        System.out.println("穿条短裤");
    }

    @Override
    public void dressed() {
        super.dressed();
        dressShorts();
    }
}
