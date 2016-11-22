package design.decorator;

/**
 * Author :  suzeyu
 * Time   :  2016-11-23  上午1:07
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription : 一个装饰者
 */
public abstract class PersonCloth extends  Person  {

    protected Person mPerson;       // 保持一个Person类的引用

    public PersonCloth(Person mPerson) {
        this.mPerson = mPerson;
    }

    @Override
    public void dressed() {
        mPerson.dressed();
    }
}
