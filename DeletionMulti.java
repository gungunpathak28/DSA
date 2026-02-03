import java.util.Scanner;

public class DeletionMulti {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] a = new int[5];

        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter element: ");
            a[i] = sc.nextInt();
        }

        System.out.print("Enter element you want to delete: ");
        int element = sc.nextInt();

        int newSize = a.length;
        boolean found = false;

        for (int i = 0; i < newSize; i++) {
            if (a[i] == element) {
                found = true;
                for (int j = i; j < newSize - 1; j++) {
                    a[j] = a[j + 1];
                }
                newSize--;
                i--;
            }
        }

        if (found) {
            System.out.println("Element deleted successfully");
            System.out.println("Updated Array:");
            for (int i = 0; i < newSize; i++) {
                System.out.print(a[i] + " ");
            }
        } else {
            System.out.println("Element not found");
            System.out.println("Original Array:");
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i] + " ");
            }
        }

        sc.close();
    }
}
