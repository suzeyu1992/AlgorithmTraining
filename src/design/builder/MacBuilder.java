package design.builder;

/**
 * Author :  suzeyu
 * Time   :  2016-11-19  下午10:54
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription :
 *              具体的Builder类
 */
public class MacBuilder extends Builder{

    private Computer mComputer = new Macbook();


    @Override
    public void buildBoard(String board) {
        mComputer.setBoard(board);
    }

    @Override
    public void buildDisplay(String display) {
        mComputer.setDisplay(display);
    }

    @Override
    public void buildOS() {
        mComputer.setOS();
    }

    @Override
    public Computer create() {
        return mComputer;
    }
}
