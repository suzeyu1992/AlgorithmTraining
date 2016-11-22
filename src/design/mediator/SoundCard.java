package design.mediator;

/**
 * Author :  suzeyu
 * Time   :  2016-11-22  下午11:21
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription : 声卡用来播放音频
 */
public class SoundCard extends Colleague {
    public SoundCard(Mediator mediator) {
        super(mediator);
    }

    /**
     *  播放音频
     */
    public void videoPlay(String data){
        System.out.println("音频: "+data);
    }
}
