package design.mediator;

/**
 * Author :  suzeyu
 * Time   :  2016-11-22  下午11:10
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription : CPU同事
 */
public class CPU extends Colleague{

    private String dataVideo, dataSound;    // 视频和音频数据
    public CPU(Mediator mediator) {
        super(mediator);
    }

    /**
     *  获取视频数据
     */
    public String getDataVideo(){
        return dataVideo;
    }

    /**
     *  获取音频数据
     */
    public String getDataSound(){
        return dataSound;
    }

    /**
     *  解码数据
     */
    public void  decodeData(String data){
        // 分割音视频数据
        String[]  tep = data.split(",");

        // 解析音视频数据
        dataVideo = tep[0];
        dataSound = tep[1];

        // 告诉中介者自身状态改变
        mediator.change(this);
    }

}
