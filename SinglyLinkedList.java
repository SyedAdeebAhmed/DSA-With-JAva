class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

}
public class SinglyLinkedList {


    Node head;

    public void AddFirst(int data){
        Node newNode = new Node(data);

        if(head==null){
            head=newNode;
        }else{
            newNode.next=head;
            head=newNode;
        }
    }

    public void AddLast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
        }else{
            Node temp = head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
            newNode.next=null;
        }
    }

    public void AddMid(int data, int index){

        Node newNode=new Node(data);

        if(head==null){
            head=newNode;
        }else{
            Node temp=head;

            for(int i=0; i<index-1; i++){
                temp=temp.next;
            }
            newNode.next=temp.next;
            temp.next=newNode;     
        }
    }

    public void RemoveFirst(){
        if(head==null){
            System.out.println("List is empty");
        }else{
            head=head.next;
        }
    }
     public void RemoveLast(){
        if(head==null){
            System.out.println("List is empty");
        }else{
            Node temp=head;
            while(temp.next.next!=null){
                temp=temp.next;
            }
            temp.next=null;
        }
     }

     public void PrintLL(){
        Node temp=head;

        while(temp!=null){

            System.out.println(temp.data);
            temp=temp.next;
        }
     }

     public void PrintReverseLL() {
    Node temp = head;
    int length = 0;

    
    while (temp != null) {
        length++;
        temp = temp.next;  
    }

    
    for (int i = length-1; i >= 0; i--) {
        temp = head; 
        for (int j = 0; j < i; j++) {
            temp = temp.next; 
        }
        System.out.println(temp.data); 
    }
}

public void MakeCircular() {
    if (head == null) {
        System.out.println("List is empty, cannot make circular.");
        return;
    }

    Node temp = head;
    while (temp.next != null) {
        temp = temp.next;
    }
    temp.next = head; 
}
     public static void main(String[] args) {
        SinglyLinkedList LL =new SinglyLinkedList();
        LL.AddFirst(1);
        LL.AddLast(3);
        LL.AddMid(2, 1);
    
        LL.PrintReverseLL();
        LL.MakeCircular();
     }
}
