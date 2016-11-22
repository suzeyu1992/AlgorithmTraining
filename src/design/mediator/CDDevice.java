package design.mediator;

/**
 * Author :  suzeyu
 * Time   :  2016-11-22  下午11:18
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription : cd设备负责读取光盘的数据并将数据提供给主板
 */
public class CDDevice extends Colleague{
    public CDDevice(Mediator mediator) {
        super(mediator);
    }

    private  String data;   // 视频数据

    /**
     *  读取视频数据
     */
    public String read(){
        return data;
    }

    /**
     *  加载视频数据
     */
    public void load(){
        // 实际情况中视频数据与音频数据都在一个数据流中
        data = "视频数据,音频数据";

        // 通知中介者, 也就是主板数据改变
        mediator.change(this);

    }

}
