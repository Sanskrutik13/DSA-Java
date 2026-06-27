import java.util.Scanner;

public class FindMaximumConsecutiveOnes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements (0 or 1):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }

        System.out.println("Maximum Consecutive Ones: " + max);

        sc.close();
    }
}