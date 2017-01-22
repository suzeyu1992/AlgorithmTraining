package struct.linear;

/**
 * Author :  suzeyu
 * Time   :  2017-01-22  下午8:32
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription : 测试线性结构
 */
public class Test {

    public static void main(String args[]){
        // 测试顺序存储结构
        testSequenceStruc();
    }

    private static void testSequenceStruc() {
        SequenceStruct<Integer> list = new SequenceStruct<>();

        for (int i = 0; i < 20; i++) {
            list.add(i);
        }

        System.out.println(list.toString());

        System.out.println("获取角标15的元素: "+list.get(15));

        list.remove(15);
        System.out.println("删除角标15之后的集合: "+list.toString());
    }

}
