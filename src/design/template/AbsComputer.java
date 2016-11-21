package design.template;

/**
 * Author :  suzeyu
 * Time   :  2016-11-21  下午10:45
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription :   抽象的计算机类
 */
public abstract class AbsComputer {

    protected void powerOn(){
        System.out.println("开启电源");
    }

    protected void checkHardware(){
        System.out.println("硬件检测");
    }

    protected void loadOs(){
        System.out.println("载入操作系统");
    }

    protected void login(){
        System.out.println("普通用户计算机, 直接进入系统");
    }

    /**
     *  启动计算机方法, 步骤为固定的, 该方法是final防止算法框架被复写
     */
    public final void startUp(){
        System.out.println("--------- 开机 start -----------");
        powerOn();
        checkHardware();
        loadOs();
        login();
        System.out.println("---------- 关机 end ---------------");
    }
}
