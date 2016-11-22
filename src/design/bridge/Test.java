package design.bridge;

/**
 * Author :  suzeyu
 * Time   :  2016-11-23  上午2:11
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription :
 */
public class Test {

    public static void main(String args[]){

        // 原汁原味
        Ordinary ordinary = new Ordinary();

        // 准备糖类
        Sugar sugar = new Sugar();

        // 大杯咖啡原味
        LargeCoffee largeCoffee = new LargeCoffee(ordinary);
        largeCoffee.makeCoffee();

        // 小杯咖啡 原味
        SmallCoffee smallCoffee = new SmallCoffee(ordinary);
        smallCoffee.makeCoffee();

        // 大杯咖啡 加糖
        LargeCoffee larSugar = new LargeCoffee(sugar);
        larSugar.makeCoffee();

        // 小杯咖啡 加糖
        LargeCoffee smallSugar = new LargeCoffee(sugar);
        smallSugar.makeCoffee();
    }
}
