package design.strategy;

/**
 * Author :  suzeyu
 * Time   :  2016-11-20  下午8:46
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription :   扮演Context角色的类
 */
public class TranficCalculator {

    public static void main (String arg[]){

        TranficCalculator calculator = new TranficCalculator();
        calculator.setStrategy(new BusStrategy());
        // 设置公交车的策略, 并准备计算
        System.out.println("公交车-->计算9公里价格: "+calculator.calculatePrice(9));



        calculator.setStrategy(new SubwayStrategy());
        // 设置地铁的策略, 并准备计算
        System.out.println("地铁-->计算9公里价格: "+calculator.calculatePrice(9));
    }

    /**
     * 定义当前策略变量
     */
    CalculateStrategy mStrategy;

    /**
     *  对外设置策略的方法
     */
    public void setStrategy(CalculateStrategy strategy){
        mStrategy = strategy;
    }

    /**
     * 角色类调用不同策略的计算方法
     */
    public int calculatePrice(int km){
        return mStrategy.calculatePrice(km);
    }
}
