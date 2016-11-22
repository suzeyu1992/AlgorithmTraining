package design.flyweight;

import java.util.Random;

/**
 * Author :  suzeyu
 * Time   :  2016-11-23  上午1:17
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription : 火车票
 */
public class TrainTicket implements Ticket{

    public String form;
    public String to;
    public String bunk;         // 铺位
    public int price;

    public TrainTicket(String form, String to) {
        this.form = form;
        this.to = to;
    }

    @Override
    public void showTicketInfo(String bunk) {
        price = new Random().nextInt(300);
        System.out.printf("购买 从%s 到 %s 的%s火车票, 价格: %s\r\n", form, bunk,to, price);
    }
}
