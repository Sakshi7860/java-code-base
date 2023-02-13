package LinkedList;
class Node
{
    int value;
    Node next;
    Node(int value,Node next)
    {
        this.value=value;
        this.next=next;
    }
}
public  class cloneCircularLinkedList {

    public  static Node cloneLinkedList(Node head)
    {
        Node temp=head;
        Node head2=null;
        Node temp2=null;
        while(temp.next!=head) {
            System.out.println("*********** " + temp.value);
            Node node = new Node(temp.value, null);
            if (head2 == null) {
                head2 = node;
                temp2 = node;
            } else {
                temp2.next = node;
                temp2 = temp2.next;
            }
            temp = temp.next;
        }
        temp2.next=new Node(temp.value,head2);
        return head2;
    }

    public static void printNode(Node head)
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.value);
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Node head=new Node(10,new Node(20,new Node(30,new Node(40,null))));
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=head;
        Node head2=cloneLinkedList(head);
        printNode(head2);

    }
}
