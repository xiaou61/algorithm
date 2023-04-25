package src;

/**
 * 链表反转
 * https://note.youdao.com/s/K2vE8IfL
 */
public class day0424 {
    static class ListNode{
        int val;
        ListNode next;
        
        public ListNode(int val,ListNode next) {
            this.val = val;
            this.next=next;
        }
    }
    //迭代
    public static ListNode iterate(ListNode head){
        //定义两个变量
        ListNode prev=null,next;



        //代表当前节点
        ListNode curr = head;



        while (curr != null){
            next=curr.next;

            curr.next=prev;

            prev=curr;

            curr=next;

        }

        return  prev;
    }

    //递归
    public static ListNode recursion(ListNode head){
        //head.next 表示已经递归到最后一个元素了
        if (head == null || head.next==null){
            return head;
        }

        //找到最后一个节点
        ListNode new_head = recursion(head.next);

        //这里相当于把5指向4
        head.next.next=head;

        head.next=null;
        return new_head;
    }

    public static void main(String[] args) {
        ListNode node5=new ListNode(5,null);
        ListNode node4=new ListNode(4,node5);
        ListNode node3=new ListNode(3,node4);
        ListNode node2=new ListNode(2,node3);
        ListNode node1=new ListNode(1,node2);
        ListNode prev = recursion(node1);
        System.out.println(prev);
    }
}
