import java.rmi.Remote;
import java.util.LinkedList;

/**
 * Author :  suzeyu
 * Time   :  2016-11-11  下午10:07
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription :
 *
 *          问题: 单向链表 A-> B -> C -> D 此时如果要删除B元素, 如果做?
 */
public class OneWayLinked {

    public static void main(String args[]){
        Person p1 = new Person("张三");
        Person p2 = new Person("李四");
        Person p3 = new Person("王五");
        Person p4 = new Person("赵六");


        // 创建一个单向链表
        SimpleLinked<Person> linked = new SimpleLinked<>(p1);
        linked.add(p2);
        linked.add(p3);
        linked.add(p4);

        System.out.println("全部元素: "+linked.toString());

        boolean remove = remove(p2, linked);

        System.out.println(remove? "删除成功\r\n"+linked.toString() : "没有要打印的数据");


    }

    /**
     * 问题1解决方法
     */
    public static boolean remove(Person obj, SimpleLinked<Person> linkeds){

        SimpleLinked.Node mHeadNode = linkeds.mHeadNode;

        // 开始遍历查找是否有要删除的数据
        while (mHeadNode!=null){
            Person mData = (Person) mHeadNode.mData;

            // 判断是否要要删除的元素
            if (obj.name.equals(mData.name)){
                // 开始狸猫换太子  把下一个指针的数据对象copy到要删除的节点对象上
                mHeadNode.mData = mHeadNode.mNext.mData;

                // 使当前指针 指向 下个指针的的next节点
                mHeadNode.mNext = mHeadNode.mNext.mNext;

                return true;
            }

            mHeadNode = mHeadNode.mNext;
        }

        return false;
    }





    /**
     * 创建一个存储对象
     */
    static class Person{
        private final String name;

        public Person(String name){
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }


    /**
     * 创建一个简易的单向列表
     */
    static  class  SimpleLinked<T>{

        /**
         * 头结点
         */
        public Node mHeadNode;

        public Node curNode;

        public SimpleLinked(T node){
            mHeadNode = new Node(node);
            curNode = mHeadNode;
        }

        public void  add (T node){
            curNode.mNext = new Node(node);
            curNode = curNode.mNext;
        }

        /*
         * 返回当前节点
         */
        public T next(){
            Node temp = curNode;
            curNode = curNode.mNext;
            return  temp.mData;
        }

        @Override
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();

            Node temp = mHeadNode;

            while (temp!=null){
                stringBuilder.append(temp.mData.toString()).append(" -> ");
                temp = temp.mNext;
            }

            return stringBuilder.toString();
        }

        /**
         * 节点类
         */
        class Node {
            public T mData;
            public Node mNext;
            public Node(T data){
                mData = data;
            }
        }
    }
}
