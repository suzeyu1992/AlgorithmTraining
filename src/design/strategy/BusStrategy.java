package design.strategy;

/**
 * Author :  suzeyu
 * Time   :  2016-11-20  下午8:38
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription :   公交车价格计算策略
 */
public class BusStrategy implements CalculateStrategy {

    /**
     *  公交车十公里一元钱, 十公里之后每加一元钱可以乘坐5公里
     */
    @Override
    public int calculatePrice(int km) {

        // 超过十公里的总距离
        int extraTotal = km-10;

        // 超过距离的是5公里的倍数
        int extraFactor = extraTotal / 5;

        // 超过的距离对5公里取余
        int faction = extraTotal % 5;

        // 计算价格
        int price = 1 + extraFactor * 1;
        return faction > 0 ? price++ : price;

    }
}
