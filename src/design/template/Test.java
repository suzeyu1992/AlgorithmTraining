package design.template;

/**
 * Author :  suzeyu
 * Time   :  2016-11-21  下午10:51
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription : 测试模板模式
 */
public class Test {

    public static void main(String arg[]){

        CodeComputer codeComputer = new CodeComputer();
        codeComputer.startUp();

        MilitaryComputer militaryComputer = new MilitaryComputer();
        militaryComputer.startUp();
    }
}
