package design.prototype;

/**
 * Author :  suzeyu
 * Time   :  2016-11-19  下午11:16
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription :
 *          测试类
 */
public class Text {

    public static  void main(String arg[]){

        // 构建文档对象
        WordDocument originDoc = new WordDocument();

        // 编辑对象
        originDoc.mText = "这是一篇blog";
        originDoc.mImages.add("图片 1");
        originDoc.mImages.add("图片 2");
        originDoc.mImages.add("图片 3");

        originDoc.showDocument();

        // 以原始文档为原型, 拷贝一份副本
        WordDocument cloneDoc = originDoc.clone();
        cloneDoc.showDocument();

        // 修改副本内容
        cloneDoc.mText = "这是副本";
        cloneDoc.mImages.add("图片 4");

        cloneDoc.showDocument();
        originDoc.showDocument();


    }
}
