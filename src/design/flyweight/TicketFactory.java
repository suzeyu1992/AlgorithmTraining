package design.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Author :  suzeyu
 * Time   :  2016-11-23  上午1:21
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription : 出票的工厂类  利用享元模式
 *                      以出发地和目的地为key, 缓存车票
 */
public class TicketFactory {

    static Map<String, Ticket> sTicketMap = new ConcurrentHashMap<>();

    public static Ticket getTicket(String from, String to){

        String key = from +"-" + to;

        if (sTicketMap.containsKey(key)){
            System.out.println("使用缓存--> " + key);
            return sTicketMap.get(key);
        }

        System.out.println("创建对象--> " + key);
        TrainTicket trainTicket = new TrainTicket(from, to);
        sTicketMap.put(key, trainTicket);

        return trainTicket ;
    }
}
