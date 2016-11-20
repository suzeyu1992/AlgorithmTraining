package design.strategy;

/**
 * Author :  suzeyu
 * Time   :  2016-11-20  下午8:35
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription :   计算价格的接口
 */
public interface CalculateStrategy {

    /**
     *  按距离来计算价格
     */
    int calculatePrice(int km);

}
