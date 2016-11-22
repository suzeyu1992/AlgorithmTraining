package design.mediator;

/**
 * Author :  suzeyu
 * Time   :  2016-11-22  下午11:21
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription : 显卡用来播放视频
 */
public class GraphicsCard extends Colleague {
    public GraphicsCard(Mediator mediator) {
        super(mediator);
    }

    /**
     *  播放视频
     */
    public void videoPlay(String data){
        System.out.println("视频: "+data);
    }
}
