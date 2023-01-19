package geeksforGeeks;

public class Stack {
    static class Node{
        int data ;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class StackImpl{
        static Node head;
        static boolean isEmplty(){
            return head==null;
        }
        static void push(int data){
            Node newNode = new Node(data);
            if (isEmplty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
        static int pop(){
            if (isEmplty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        static int peek(){
            if (isEmplty()){
                return -1;
            }
            return head.data;
        }

    }

    public static void main(String[] args) {
        StackImpl stack = new StackImpl();
         stack.push(10);
         stack.push(20);
         stack.push(30);
         stack.push(40);
         while (!stack.isEmplty()){
             System.out.println(stack.peek());
             stack.pop();
         }

    }
}
