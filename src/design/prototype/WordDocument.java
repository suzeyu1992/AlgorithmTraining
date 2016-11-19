package design.prototype;

import java.util.ArrayList;

/**
 * Author :  suzeyu
 * Time   :  2016-11-19  下午11:08
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription :
 *              文档类型, 扮演的是ConcretePrototype角色, 而cloneable是代表着prototype角色
 */
public class WordDocument implements Cloneable{

    // 文本
    public String mText;


    // 图片名列表
    public ArrayList<String> mImages = new ArrayList<String>();

    public WordDocument(){
        System.out.println("-----------WordDocument构造函数-----------");
    }

    @Override
    protected WordDocument clone() {
        try {
            WordDocument doc = (WordDocument) super.clone();
            doc.mText = this.mText;

            // 因为Image是引用类型, 这样直接赋值属于浅拷贝, 再次对集合进行clone. 实现wordDocument的深拷贝
            doc.mImages = (ArrayList<String>) this.mImages.clone();
            return doc;
        }catch (Exception ex){}

        return null;

    }

    /**
     * 打印文档内容
     */
    public void showDocument(){
        System.out.println("------------开始输出内容---------------------");

        System.out.println("Text: "+mText);
        System.out.println("List: "+mImages.toString());


        System.out.println("------------输出结束------------------------");
    }
}
