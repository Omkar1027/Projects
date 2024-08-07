public class LL {
    Node head;
    private int size;

    LL(){
        size=0;
    }
    class Node{
        String data;
        
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
        }
    }
    public void addFirst(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
        size++;
    }
    public void addLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next != null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
        size++;
    }
    public void printList(){
        Node currNode=head;
        while(currNode != null){
            System.out.print(currNode.data+" -> ");
            currNode=currNode.next;
        }
        System.out.print("NULL\n");
        System.out.println("Printed");
        
    }
    public void deleteFirst(){
        if(head==null){
            System.out.println("The list is empty");
        }
        size--;
        head=head.next;
    }
    
    public void deleteLast(){
        if(head==null){
            System.out.println("The list is empty");
        }
        size--;

        if(head.next==null){
            head=null;
            return;
        }
        Node secondlast=head;
        Node last=head.next;
        while(last.next!=null){
            secondlast=last;
            last=last.next;
        }
        secondlast.next=null;
    }

    public int getsize(){
        return size;
    }

    public void reverseIterate(){
        if(head==null || head.next==null){
            return;
        }
        Node prevNode=head;
        Node currNode=head.next;
        while(currNode!= null){
            Node nextNode=currNode.next;
            currNode.next=prevNode;
            prevNode=currNode;
            currNode=nextNode;
        }
        head.next=null;
        head=prevNode;
    }

    public Node reverse(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node newHead=reverseRecurr(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
    }
    public void reverseAdj(){
        if(head==null || head.next==null){
            return;
        }
        Node prevNode=head;
        Node currNode=head.next;
        while(currNode.next!= null && currNode.next.next!=null && currNode.next.next.next!=null){
            Node nextNode=currNode.next;
            currNode.next=prevNode;
            prevNode.next=nextNode;
            currNode=nextNode;
            prevNode=nextNode.next;
        }
    }


    public static void main(String[] args) {
        LL list=new LL();
        list.addFirst("4");
        list.addFirst("3");
        list.addFirst("2");
        list.addFirst("1");
        list.printList();
        // list.head = list.reverseRecurr(list.head);
        list.reverseAdj();
        list.printList();
        list.printList();

    }
}
