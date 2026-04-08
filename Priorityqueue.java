import java.util.*;

public class Priorityqueue {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        List<Integer> priorityOrder = Arrays.asList(3,1,2,4);

        PriorityQueue<Integer> pq = new PriorityQueue<>(
            Comparator.comparingInt(priorityOrder::indexOf)
        );
        for(int num : arr){
            pq.add(num);
        }

        System.out.println("Priority Queue Order:");
        while(!pq.isEmpty()){
            System.out.print(pq.poll() + " ");
        }
    }
}













