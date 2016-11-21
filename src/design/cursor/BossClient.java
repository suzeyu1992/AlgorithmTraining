package design.cursor;

/**
 * Author :  suzeyu
 * Time   :  2016-11-21  下午10:39
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription :
 */
public class BossClient {

    public static void main(String args[]){
        CompanSu companSu = new CompanSu();
        check(companSu.iterator());

        CompanLi companLi = new CompanLi();
        check(companLi.iterator());
    }

    private static void check(Iterator iterator) {
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
    }
}
