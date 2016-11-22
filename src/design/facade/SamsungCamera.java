package design.facade;

/**
 * Author :  suzeyu
 * Time   :  2016-11-23  上午1:59
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription :
 */
public class SamsungCamera implements Camera {

    @Override
    public void open() {
        System.out.println("打开相机");
    }

    @Override
    public void takePicture() {
        System.out.println("拍照");

    }

    @Override
    public void close() {
        System.out.println("关闭相机");

    }
}
