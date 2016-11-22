package design.bridge;

/**
 * Author :  suzeyu
 * Time   :  2016-11-23  上午2:10
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription :
 */
public class LargeCoffee extends Coffee {
    public LargeCoffee(CoffeeAdditives impl) {
        super(impl);
    }



    @Override
    public void makeCoffee() {
        System.out.println("大杯的 "+impl.addSomething() + " 咖啡");
    }
}
