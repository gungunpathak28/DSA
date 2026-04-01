import java.util.*;
public class EnqueueOperationOnCircularQueue {
    static int front = -1, rear = -1, size;
    static int[] queue;
    static boolean isFull() {
        return (front == 0 && rear == size - 1) || (rear + 1) % size == front;
    }

    static boolean isEmpty() {
        return front == -1;
    }

    static void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is Full");
            return;
        }
        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % size;
        }
        queue[rear] = value;
        System.out.println("Inserted: " + value);
        System.out.println(".....................................................");
    }

    static void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }
        int i = front;
        while (true) {
            System.out.print(queue[i] + " ");
            if (i == rear) break;
            i = (i + 1) % size;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        queue = new int[size];

        if (!isFull()) {
            int x = sc.nextInt();
            enqueue(x);
            display();
        }

        for (int i = 0; i < size; i++) {
            int x = sc.nextInt();
            enqueue(x);
        }

        display();
    }
}