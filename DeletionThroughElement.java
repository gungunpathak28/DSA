import java.util.Scanner;

public class DeletionThroughElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] a = new int[5];
		for (int i=0;i<a.length;i++) {
			System.out.print("\n Enter elements : ");
			a[i]=sc.nextInt();
		}
		System.out.print("\n Enter element you want to delete : ");
		int element = sc.nextInt();
		int pos=0;
		boolean found = false;
		for(int i=0;i<a.length ; i++) {
			if (a[i] == element) {
				pos=i;
				found=true;
				for(int j=pos;j<a.length-1 ; j++) {
					a[j]=a[j+1];
				}
			}	
		}
		if (found == true) {
			System.out.print("\n Element found!!!");
			System.out.print("\n New Updated Array is : ");
			for (int i=0 ; i<a.length-1;i++) {
				System.out.print("\n "+a[i]);
			}
		}else {
			System.out.print("\n Element not found !!!");
			System.out.print("\n Existing Array is : ");
			for (int i=0 ; i<a.length;i++) {
				System.out.print("\n "+a[i]);
			}
		}	
	}

}