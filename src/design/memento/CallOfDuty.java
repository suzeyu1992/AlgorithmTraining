package design.memento;

/**
 * Author :  suzeyu
 * Time   :  2016-11-21  下午10:03
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription :   使命召唤游戏, 充当originator角色
 */
public class CallOfDuty {

    private int mCheckpoint = 1;
    private int mLifeValue = 100;
    private String mWeapon = "沙漠之鹰";

    /**
     *  玩游戏
     */
    public void play(){
        System.out.println("玩游戏: "+ String.format("第%d关", mCheckpoint) + " 奋战杀敌中");
        mLifeValue -= 10;
        System.out.println("进度升级中");
        mCheckpoint++;
        System.out.println("到达 " + String.format("第%d关", mCheckpoint));

    }

    /**
     *  退出游戏
     */
    public void quit(){
        System.out.println("-----");
        System.out.println("退出前的游戏属性: "+this.toString());
        System.out.println("退出游戏");
        System.out.println("-----");
    }

    /**
     *  创建备忘录
     */
    public Memo createMemo(){
        Memo memo = new Memo();
        memo.mWeapon = mWeapon;
        memo.mLifeValue = mLifeValue;
        memo.mCheckpoint = mCheckpoint;
        return memo;
    }

    public void restore(Memo memo){
        mCheckpoint = memo.mCheckpoint;
        mLifeValue = memo.mLifeValue;
        mWeapon = memo.mWeapon;
        System.out.println("恢复后的游戏属性--> "+toString());
    }


    @Override
    public String toString() {
        return "当前游戏信息: checkpoint="+ mCheckpoint +" ,mLifeValue="+mLifeValue +" ,mWeapon="+mWeapon;
    }

}
