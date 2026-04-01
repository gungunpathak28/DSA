import java.util.Scanner;

public class stackoperations {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int st[]=new int[5];
		int top=-1;
		int size=st.length-1;
		
		//Enter elements in stack
		for(int i=0;i<4 ; i++) {
		System.out.println("\n Enter number you want to insert");
		int num=sc.nextInt();
		top++;
		st[top]=num;
		}
		System.out.println("\n Stack elements : ");
		for(int i=top;i>=0;i--)
			System.out.print("\n "+st[i]);
		System.out.println("\n ---------------------------");
		
		//swap two elements
		System.out.println("\n Swapping of top two numbers : ");
		int temp=st[top];
		top--;
		int temp1=st[top];
		st[top]=temp;
		top++;
		st[top]=temp1;
		for(int i=top;i>=0;i--)
			System.out.print("\n "+st[i]);
		System.out.println("\n ---------------------------");
		
		//Max Min
		int min=st[top];
		int max=st[top];
		for(int i=top;i>=0;i--) {
			if(max<st[i])
				max=st[i];
			if(min>st[i])
				min=st[i];
		}
		System.out.print("\n Maximum element in stack is : "+max);
		System.out.print("\n Minimum element in stack is : "+min);
		System.out.println("\n ---------------------------");
		
		//factorial of stack
		int fact=1;
		for(int i=top;i>=0;i--) {
			fact*=st[i];
		}
		System.out.print("\n Factorial of the stack is : "+fact);
		System.out.println("\n ---------------------------");

		//count no.of element
		int count=top+1;
		System.out.print("\n Count of no.of elements are : "+count);
		System.out.println("\n ---------------------------");
		
		//postfix expression
		System.out.println("\n Enter expression : ");
		String expression=sc.next();
		int l=expression.length();
		int top2=-1;
		int [] exp = new int [l];
		for(int i=0;i<l ; i++) {
			top2++;
			char num=expression.charAt(i);
			if (Character.isDigit(num)){
				exp[top2] = num - '0';

			}else {
				int a=exp[--top2];
				int b=exp[--top2];
				if(num=='+') 
					exp[top2]=b+a;
				else if (num=='-')
					exp[top2]=b-a;
				else if (num=='*')
					exp[top2]=b*a;
				else if(num=='/')
					exp[top2]=b/a;
			}
		}
		System.out.print("\n Result is : "+exp[0]);
		System.out.println("\n ---------------------------");
		
		//fabonacci series
		int [] fab = new int [10];
		int top1=0;
		System.out.print("\n enter element : ");
		fab[top1]=sc.nextInt();
		top1++;
		System.out.print("\n enter element : ");
		fab[top1]=sc.nextInt();
		top1++;		
		for (int i=2 ; i<=fab.length-1 ; i++) {
			fab[i]=fab[i-1]+fab[i-2];
			top1++;
		}
		System.out.print("\n Fabonacci Series : ");
		for(int i=top1-1;i>=0;i--)
			System.out.print("\n "+fab[i]);
		System.out.println("\n ---------------------------");
		
		
	}

}
