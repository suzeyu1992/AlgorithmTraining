package design.facade;

/**
 * Author :  suzeyu
 * Time   :  2016-11-23  上午2:02
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription :
 */
public class Test {

    public static void main(String arg[]){
        MobilePhone mobilePhone = new MobilePhone();

        // 拍照
        mobilePhone.takePicture();

        // 视频聊天
        mobilePhone.videoChar();
    }
}
