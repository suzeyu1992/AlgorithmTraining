package design.memento;

/**
 * Author :  suzeyu
 * Time   :  2016-11-21  下午10:18
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription :   客户端
 */
public class Client {

    public static void main(String arg[]){

        // 构建游戏对象
        CallOfDuty game = new CallOfDuty();

        // 1 打游戏
        game.play();

        Caretaker caretaker = new Caretaker();
        // 2 游戏存档
        caretaker.archive(game.createMemo());

        // 3 退出游戏
        game.quit();

        // 4 恢复游戏
        CallOfDuty newGame = new CallOfDuty();
        newGame.restore(caretaker.getMemo());

    }
}
