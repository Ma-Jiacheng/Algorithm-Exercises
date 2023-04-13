package Chapter02_链表.Demo01_移除链表元素;

class Solution {
    public LinkedList removeElements(LinkedList head, int val) {
        //删除值相同的头结点后，可能新的头结点也值相等，用循环解决
        while (head != null && head.val == val) {
            head = head.next;
        }
        //如果头节点为空，则链表为已清空，返回null
        if (head == null){
            return null;
        }

        LinkedList prev = head;

        while (prev.next != null) {     //确保当前结点后还有结点
            if (prev.next.val == val) {     //遍历链表，查找 val 等于目标元素的节点
                prev.next = prev.next.next;     //如果找到，则使前一个节点的指针指向下下个节点，跳过（删除）该节点
            } else {
                prev = prev.next;   //如果 val 不满足要求，则指针指向下一个节点继续遍历
            }
        }
        return head;    //返回头节点
    }
}