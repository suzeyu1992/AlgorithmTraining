package design.facade;

/**
 * Author :  suzeyu
 * Time   :  2016-11-23  上午1:55
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription :
 */
public class MobilePhone {

    private Phone mPhone = new PhoneImpl();
    private Camera mCamera = new SamsungCamera();

    public void  videoChar(){
        System.out.println("--> 视频聊天连接中");
        mCamera.open();
        mPhone.dail();
    }

    public void  hangup(){
        mPhone.hangup();
    }

    public void takePicture(){
        mCamera.open();
        mCamera.takePicture();
    }

    public void closeCamera(){
        mCamera.close();
    }
}
