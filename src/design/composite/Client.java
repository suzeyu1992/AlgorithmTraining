package design.composite;

/**
 * Author :  suzeyu
 * Time   :  2016-11-23  上午12:38
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription :
 */
public class Client {

    public static void main(String arg[]){
        // 构造一个目录对象表示c盘目录
        Folder diskC = new Folder("C");

        // C盘根目录下有一个文件 Log.txt
        diskC.addDir(new File("Lag.txt"));

        // C盘下还有3个子目录
        diskC.addDir(new Folder("目录1"));

        Folder dirs = new Folder("目录2");
        dirs.addDir(new File("null.txt"));
        diskC.addDir(dirs);

        diskC.addDir(new Folder("目录3"));

        // 打印文件结构
        diskC.print();
    }
}
