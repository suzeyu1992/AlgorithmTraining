package design.single;

import java.util.ArrayList;

/**
 * Author :  suzeyu
 * Time   :  2016-11-19  下午10:35
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription :
 *              容器实现单例模式
 */
public class CollectionSingle {
    private static ArrayList<CollectionSingle> objArr= new ArrayList<CollectionSingle>();
    static {
        objArr.add(new CollectionSingle());
    }

    private CollectionSingle(){}

    public static CollectionSingle getInstance(){
        return objArr.get(0);
    }
}
