package design.strategy;

/**
 * Author :  suzeyu
 * Time   :  2016-11-20  下午8:38
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription :   地铁价格计算策略
 */
public class SubwayStrategy implements CalculateStrategy {

    /**
     *  地铁6公里内3元, 6~12公里4元, 12~22公里5元, 22~32公里6元
     */
    @Override
    public int calculatePrice(int km) {

        if (km < 6){
            return 3;
        }else if (km < 12){
            return 4 ;
        }else if (km < 22){
            return 5;
        }else if (km < 32){
            return 6;
        }else {
            return 7;
        }
    }
}
