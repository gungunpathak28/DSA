import java.util.Scanner;
public class Deletion {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int [] a = new int[5];
	        for (int i=0; i<a.length; i++){
	            System.out.println("Enter element:");
	            a[i]=sc.nextInt();
	        }
	        System.out.println("Enter position:");
	        int pos = sc.nextInt();
	        for (int i=pos-1; i<a.length-1; i++){
	            a[i]= a[i+1];
	        }
	        for (int i=0; i<a.length-1; i++){
	            System.out.print("\n"+a[i]);
	        }
	    }

	}


 