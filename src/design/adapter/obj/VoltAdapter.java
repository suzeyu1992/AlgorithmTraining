package design.adapter.obj;

/**
 * Author :  suzeyu
 * Time   :  2016-11-23  上午12:56
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription : 对象适配器模式
 */
public class VoltAdapter implements FiveVolt {


    Volt220 mVolt220;

    public VoltAdapter(Volt220 mVolt220) {
        this.mVolt220 = mVolt220;
    }

    public int getVolt220(){
        return mVolt220.getVolt220();
    }

    @Override
    public int getVolt5() {
        return 5;
    }
}
