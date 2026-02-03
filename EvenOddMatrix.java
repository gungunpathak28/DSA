import java.util.Scanner;
public class EvenOddMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows, cols, i, j;
        int even = 0, odd = 0;
        System.out.print("Enter rows: ");
        rows = sc.nextInt();
        System.out.print("Enter columns: ");
        cols = sc.nextInt();
        int a[][] = new int[rows][cols];
        System.out.println("Enter matrix elements");
        for (i = 0; i < rows; i++) {
            for (j = 0; j < cols; j++) {
                a[i][j] = sc.nextInt();

                if (a[i][j] % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
        }
        System.out.println("Number of Even elements = " + even);
        System.out.println("Number of Odd elements = " + odd);
        sc.close();
    }
}
