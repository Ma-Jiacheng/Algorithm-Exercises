package Chapter02_链表.Demo02_设计链表;

public class Demo_02 {
    public static void main(String[] args) {
        //创建链表对象
        LinkedList linkedList = new LinkedList();
        //向链表添加元素
        linkedList.addAtHead(1);  //链表头节点元素
        linkedList.addAtIndex(1,1);
        linkedList.addAtIndex(2,2);
        linkedList.addAtIndex(3,3);
        linkedList.addAtIndex(4,4);
        linkedList.addAtTail(5);  //链表尾节点元素
        //输出链表任意节点元素
        System.out.println(linkedList.get(3));
        //删除链表某个节点
        linkedList.deleteAtIndex(3);  //删除3号节点
        System.out.println(linkedList.get(3));    //3号节点删除，4号节点接替3号节点
    }
}
