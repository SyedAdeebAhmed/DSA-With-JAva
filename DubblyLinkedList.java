class Node {
    int data;
    Node next;
    Node previous; 

    Node(int data) {
        this.data = data;
        this.next = null;
        this.previous = null;
    }
}

public class DubblyLinkedList {
    Node head;

    public void AddFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode; 
        } else {
            newNode.next = head;
            head.previous = newNode;
            head = newNode;
        }
    }

    public void AddLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode; 
            newNode.previous = temp; // Set the previous pointer of the new node
        }
    }

    public void AddAt(int index, int data) {
        Node newNode = new Node(data);
        if (index < 0) {
            System.out.println("Index out of bounds");
            return;
        }
        if (index == 0) {
            AddFirst(data);
            return;
        }
        if (head == null) {
            head = newNode; 
            return;
        }
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            if (temp == null) {
                System.out.println("Index out of bounds");
                return;
            }
            temp = temp.next;
        }
        newNode.next = temp.next;
        newNode.previous = temp; // Set the previous pointer of the new node
        if (temp.next != null) {
            temp.next.previous = newNode; // Update the previous pointer of the next node
        }
        temp.next = newNode;
    }

    public void DeleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            head = head.next;
            if (head != null) {
                head.previous = null; // Update the previous pointer of the new head
            }
        }
    }

    public void DeleteLast() {
        if (head == null) {
            System.out.println("List is empty");
        } else if (head.next == null) {
            head = null;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.previous.next = null; 
        }
    }

    public void DeleteAt(int index) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (index < 0) {
            System.out.println("Index out of bounds");
            return;
        }
        if (index == 0) {
            DeleteFirst();
            return;
        }
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            if (temp == null || temp.next == null) {
                System.out.println("Index out of bounds");
                return;
            }
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
            if (temp.next != null) {
                temp.next.previous = temp; // Update the previous pointer of the next node
            }
        } else {
            System.out.println("Index out of bounds");
        }
    }

    public void PrintLL() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void PrintReverse() {
        Node temp = head;
        if (temp == null) {
            System.out.println("List is empty");
            return;
        }
        
        while (temp.next != null) {
            temp = temp.next; 
        }
        
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.previous; 
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DubblyLinkedList list = new DubblyLinkedList();

        list.AddFirst(1); 
        list.AddFirst(2); 
        list.AddFirst(4); 
        list.AddLast(5);  
        list.AddAt(2, 3); 

        System.out.println("Forward:");
        list.PrintLL(); 

        System.out.println("Reverse:");
        list.PrintReverse(); 
    }
}