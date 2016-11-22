package design.bridge;

/**
 * Author :  suzeyu
 * Time   :  2016-11-23  上午2:10
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription :
 */
public class SmallCoffee extends Coffee {
    public SmallCoffee(CoffeeAdditives impl) {
        super(impl);
    }

    @Override
    public void makeCoffee() {
        System.out.println("小杯的 "+impl.addSomething() + " 咖啡");
    }
}
