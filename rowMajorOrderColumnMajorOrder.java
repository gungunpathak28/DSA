import java.util.Scanner;

public class rowMajorOrderColumnMajorOrder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Enter rows : ");
		int rows = sc.nextInt();
		System.out.print("\n Enter columns : ");
		int cols = sc.nextInt();
		int [][]a= new int [rows][cols];
		for (int i=0;i<rows;i++) {
			for(int j=0;j<a.length;j++) {
				System.out.print("\n Enter elements : ");			
				a[i][j]=sc.nextInt();
			}
		}
		System.out.print("\n Row Major Order : ");
		for (int i=0;i<rows;i++) {
			for(int j=0;j<a.length;j++) {
				System.out.print(a[i][j]+" ");
			}
		}
		System.out.print("\n Column Major Order : ");
		for (int i=0;i<rows;i++) {
			for(int j=0;j<a.length;j++) {
				System.out.print(a[j][i]+" ");
			}
		}

	}

}