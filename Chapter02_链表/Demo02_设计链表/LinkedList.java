package Chapter02_链表.Demo02_设计链表;

class LinkedList {
    int size;   //链表的大小
    ListNode head;  //头节点

    public LinkedList() {   //构造方法，初始化链表大小和头节点
        size = 0;
        head = new ListNode(0);
    }
    //获取链表节点的数据
    public int get(int index) {     //参数为节点索引
        if (index < 0 || index >= size) {   //输入的索引超出链表范围
            return -1;  //查找错误，返回-1
        }
        ListNode cur = head;    //指针指向头节点，从头节点开始查找
        for (int i = 0; i <= index; i++) {  //遍历链表，找到索引位置
            cur = cur.next;     //查找到索引号后，指针指向该节点
        }
        return cur.val;     //返回该节点数据与数值
    }
    //向头节点添加数据
    public void addAtHead(int val) {
        addAtIndex(0, val);     //头节点索引号为0
    }
    //向尾节点添加数据
    public void addAtTail(int val) {
        addAtIndex(size, val);      //尾节点索引为链表大小size
    }
    //向任意节点添加数据
    public void addAtIndex(int index, int val) {
        if (index > size) {     //输入的索引号超过链表大小
            return;     //不能添加，返回-1
        }
        index = Math.max(0, index);     //将index的最大值更新
        size++;     //链表大小+1
        ListNode pred = head;   //指针指向头指针
        for (int i = 0; i < index; i++) {   //遍历链表，直到索引位置的前驱节点
            pred = pred.next;
        }
        ListNode toAdd = new ListNode(val);     //创建一个新的节点对象
        toAdd.next = pred.next;     //将新创建的节点后继节点设置为自己的后继节点
        pred.next = toAdd;  //在将前驱节点的后继节点设置为自己
    }
    //删除任意节点
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {   //判断要删除的节点是否在链表大小内
            return; //不在则返回-1
        }
        size--;     //如果在，则链表大小-1
        ListNode pred = head;   //指针指向头节点
        for (int i = 0; i < index; i++) {   //遍历链表，找到索引位置
            pred = pred.next;   //指针指向下一个节点
        }
        pred.next = pred.next.next;     //设置下一个节点为后继节点的后继节点，跳过要删除的后继节点
    }
}
