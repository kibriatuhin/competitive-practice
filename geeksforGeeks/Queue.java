package geeksforGeeks;

public class Queue {
    static int[] array;
    static int size;
    static int rear=-1;
    Queue(int size){
        array = new int[size];
        this.size= size;
    }
    static boolean isEmpty(){
        return  rear == -1;
    }
    static void push(int data){
        if (rear == size-1){
            System.out.println("queue is full");
            return;
        }
        rear++;
        array[rear] = data;
    }
    static int pop(){
        if (isEmpty()){
            System.out.println("Queue is epmty");
            return -1;
        }
        int font = array[0];
        for (int i=0 ; i< rear ;i++){
            array[i] = array[i+1];
        }
        rear--;
        return font;
    }

    public static void main(String[] args) {
        
    }

}
