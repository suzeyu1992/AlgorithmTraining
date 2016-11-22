package design.mediator;

/**
 * Author :  suzeyu
 * Time   :  2016-11-22  下午11:24
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription : 主板中介者
 */
public class MainBoard  extends Mediator{

    private CDDevice cdDevice;      // 光驱设备
    private CPU cpu;                //
    private SoundCard soundCard;    // 声卡设备
    private GraphicsCard graphicsCard;// 显示设备




    @Override
    public void change(Colleague colleague) {

        // 如果是光驱读取了数据
        if (colleague == cdDevice){
            handleCD((CDDevice)colleague);
        }else if (colleague == cpu){
            handleCPU((CPU)colleague);
        }
    }

    /**
     * 处理CPU读取数据后与其他设备的交互
     * @param colleague
     */
    private void handleCPU(CPU colleague) {
        soundCard.videoPlay(colleague.getDataSound());
        graphicsCard.videoPlay(colleague.getDataVideo());
    }

    /**
     * 处理光驱读取数据后与其他设备的交互
     */
    private void handleCD(CDDevice colleague) {
        cpu.decodeData(cdDevice.read());
    }

    public void setCdDevice(CDDevice cdDevice) {
        this.cdDevice = cdDevice;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public void setSoundCard(SoundCard soundCard) {
        this.soundCard = soundCard;
    }

    public void setGraphicsCard(GraphicsCard graphicsCard) {
        this.graphicsCard = graphicsCard;
    }
}
