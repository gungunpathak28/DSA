import java.util.Scanner;

public class queueEnqueueDequeue {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("\n Enter length");
		int l=sc.nextInt();
		int [] a= new int[l];
		int front=-1;
		int rear=-1;
		while(true) {
			System.out.print("\n 1. Enqueue");
			System.out.print("\n 2. Dequeue");
			System.out.println("\n 3. Queue ");
			System.out.println("\n 0. Stop ");
			int choice= sc.nextInt();
		if (choice==1) {
			System.out.print("Element = ");
			int ele=sc.nextInt();
			if (front==(rear+1)%l){
				System.out.print("\n Overflow");
			}else if( front==-1 && rear ==-1){
				front=rear=0;
				a[rear]=ele;
			}else if (rear==l-1 && front!=0){
				rear=0;
				a[rear]=ele;
			}else{
				rear=(rear+1)%l;
				a[rear]=ele;
			}
			
		}
		else if(choice==2) {
			if (front==-1 && rear==-1){
				System.out.print("\n Underflow");
			}int val=a[front];
			if(front==rear) {
				front=rear=-1;
			}else {
				front=(front+1)%l;
			}
		}
		else if(choice==3){
			if(rear>front) {
			for(int i=front;i<=rear ; i++) {
				System.out.print("\n "+a[i]);
				
			}}
			else {
				for(int i=rear;i<l ; i++) {
					System.out.print("\n "+a[i]);
					
				}
			}
		}else {
			break;
		}
		}

	}

}