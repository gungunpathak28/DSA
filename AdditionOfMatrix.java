import java.util.Scanner;
public class AdditionOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, r, c;
        System.out.print("Enter number of rows: ");
        r = sc.nextInt();
        System.out.print("Enter number of columns: ");
        c = sc.nextInt();
        int a[][] = new int[r][c];
        int b[][] = new int[r][c];
        int sum[][] = new int[r][c];
        System.out.println("Enter elements of first matrix");
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter elements of second matrix");
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("Addition of matrices is");
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                System.out.print(sum[i][j] + " "); 
            }
            System.out.println();
        }
        sc.close();
    }
}
