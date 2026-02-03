import java.util.Scanner;

public class MultiplyOfMatrix1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Enter rows : ");
		int rows = sc.nextInt();
		System.out.print("\n Enter columns : ");
		int cols = sc.nextInt();
		System.out.print("\n Enter rows : ");
		int rows1 = sc.nextInt();
		System.out.print("\n Enter columns : ");
		int cols1 = sc.nextInt();

		int [][]a= new int [rows][cols];
		int [][]b= new int[rows1][cols1];
		int [][]mul = new int[rows][cols1];
		for(int i=0 ; i<rows ; i++) {
			for(int j=0 ; j<cols ; j++) {
				System.out.print("\n a["+i+"]["+j+"] : ");
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0 ; i<rows1 ; i++) {
			for(int j=0 ; j<cols1 ; j++) {
				System.out.print("\n b["+i+"]["+j+"] : ");
				b[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<rows ; i++) {
			for(int j=0;j<cols1;j++) {
				for(int k=0;k<cols;k++) {
					mul[i][j]=mul[i][j]+a[i][k]*b[k][j];
				}
			}
		}
		for(int i=0 ; i<rows ; i++) {
			System.out.print("\n ");
			for(int j=0 ; j<cols1 ; j++) {
				System.out.print(mul[i][j]+" ");
			}
		}
	}

}