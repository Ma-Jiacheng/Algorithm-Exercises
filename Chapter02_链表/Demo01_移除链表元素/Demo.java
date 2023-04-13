package Chapter02_链表.Demo01_移除链表元素;

public class Demo {
    public static void main(String[] args) {
        //创建一个链表对象
        LinkedList linkedList = new LinkedList();    //设置头节点元素

        //向链表添加元素
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);
        linkedList.add(7);
        linkedList.add(8);

        //移除链表某一元素
        Solution solution = new Solution();
        solution.removeElements(linkedList, 2);   //移除 val == 2 的节点

        linkedList.print();   //打印结果链表
    }
}


