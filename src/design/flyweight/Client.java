package design.flyweight;

/**
 * Author :  suzeyu
 * Time   :  2016-11-23  上午1:28
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription :
 */
public class Client {

    public static void main(String arg[]){
        Ticket ticket = TicketFactory.getTicket("青岛", "北京");
        ticket.showTicketInfo("上铺");

        Ticket ticket1 = TicketFactory.getTicket("青岛", "上海");
        ticket1.showTicketInfo("上铺");

        Ticket ticket2 = TicketFactory.getTicket("青岛", "北京");
        ticket2.showTicketInfo("上铺");
    }
}
