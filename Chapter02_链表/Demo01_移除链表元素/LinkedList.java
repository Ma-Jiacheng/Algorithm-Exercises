package Chapter02_链表.Demo01_移除链表元素;

class LinkedList {
    int val;
    LinkedList next;

    LinkedList() {

    }

    LinkedList(int x) {
        val = x;
    }

    // 添加新的结点
    public void add(int newVal) {
        LinkedList newNode = new LinkedList(newVal);
        if (this.next == null) {
            this.next = newNode;
        } else {
            this.next.add(newVal);
        }
    }

    // 打印链表
    public void print() {
        System.out.print(this.val);
        if (this.next != null) {
            System.out.print("-->");
            this.next.print();
        }
    }

}

