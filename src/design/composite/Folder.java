package design.composite;

import java.util.Iterator;
import java.util.List;

/**
 * Author :  suzeyu
 * Time   :  2016-11-23  上午12:31
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription : 文件夹的类
 */
public class Folder extends Dir{

    public Folder(String name) {
        super(name);
    }

    @Override
    public void addDir(Dir dir) {
        dirs.add(dir);
    }

    @Override
    public void rmDir(Dir dir) {
        dirs.remove(dir);
    }

    @Override
    public void clear() {
        dirs.clear();
    }

    @Override
    public void print() {
        System.out.print(getName() + " (");
        Iterator<Dir> iterator = dirs.iterator();
        while (iterator.hasNext()){
            Dir dir = iterator.next();
            dir.print();
            if (iterator.hasNext()){
                System.out.print(",");
            }
        }

        System.out.print(")");
    }

    @Override
    public List<Dir> getFiles() {
        return dirs;
    }
}
