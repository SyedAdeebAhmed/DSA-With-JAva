class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

}
public class StackWithLL {

    Node top;

    public void push(int data){
        Node newNode = new Node(data);
        if(top==null){
            top=newNode;
        }else{
            Node temp = top;

            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
            newNode.next=null;
        }
    }

    public void pop(){
        if(top==null){
            System.out.println("Stack is empty");
        }else{
            top=top.next;
        }
    }

    public boolean isEmpty(){
        if(top==null){
            return true;
        }else{
            return false;   
        }
    }

    public void PrintStack(){
        Node temp=top;

        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }

    
    }

    public static void main(String[] args) {
        StackWithLL stack=new StackWithLL();

        stack.push(10);
        stack.push(15);
        stack.push(20);
        stack.push(25);
        stack.pop();
        stack.PrintStack();

    }
}