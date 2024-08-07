public class linked {
    Node head;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
        }
    }
    public Node removeNthFromEnd(int n){
        if(head.next==null){
            return null;
        }

        int size=0;
        Node curr=head;
        while(curr!=null){
            curr=curr.next;
            size++;
        }

        int indToSearch=size-n;
        Node prev=head;
        int i=1;
        while(i<indToSearch){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;

        return head;
    } public void addFirst(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
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

    public Node reverse(Node head){
        Node prev=null;
        Node curr=head;

        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }

    public Node findMiddle(Node head) {
        if (head == null) {
            return null; // Handle edge case of empty list
        }
    
        Node slow = head;
        Node fast = head;
    
        // Move fast pointer two steps ahead and slow pointer one step ahead
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
    
        return slow; // Return the middle node
    }
    
    public boolean palindrome() {
        if (head == null || head.next == null) {
            return true; // An empty list or single node list is a palindrome
        }
    
        // Find the middle of the linked list
        Node middle = findMiddle(head);
    
        // If middle or middle.next is null, the list length is even
        if (middle == null || middle.next == null) {
            return false; // Cannot be palindrome as second half is missing
        }
    
        // Reverse the second half of the linked list
        Node secondEnd = reverse(middle.next);
    
        // Compare the first half and the reversed second half
        Node firstStart = head;
        while (firstStart != null && secondEnd != null) {
            if (!firstStart.data.equals(secondEnd.data)) {
                return false; // If data doesn't match, it's not a palindrome
            }
            firstStart = firstStart.next;
            secondEnd = secondEnd.next;
        }
    
        return true; // If all comparisons are successful, it's a palindrome
    }

    public boolean hasCycle(Node head) {
        Node slow = head;
        Node fast = head;
       
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
           
            if(fast == slow) {
                return true;
            }
        }
       
        return false;
     }

     
        public static void main(String[]args){
            linked list=new linked();
            list.addFirst("1");
            list.addFirst("2");
            list.addFirst("1");
            list.addFirst("1");
            list.printList();
            list.removeNthFromEnd(2);
            System.out.println(7/2);
            // System.out.println(list.hasCycle)
    }

}