import java.util.Scanner;
public class DataAnalysis {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter number of elements: ");
            int n = sc.nextInt();
	    int[] data = new int[n];
	    System.out.println("Enter elements:");
            for (int i = 0; i < n; i++) {
                data[i] = sc.nextInt();
            }
	    int sum = 0;
            int max = data[0];
            int min = data[0];
	    for (int i = 0; i < n; i++) {
                sum += data[i];

                if (data[i] > max)
                    max = data[i];

                if (data[i] < min)
                    min = data[i];
            }

            double average = (double) sum / n;

            // Manual Sorting (Bubble Sort)
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (data[j] > data[j + 1]) {
                        int temp = data[j];
                        data[j] = data[j + 1];
                        data[j + 1] = temp;
                    }
                }
            }
	    System.out.println("\nResults");
            System.out.printf("Sum: %d\n", sum);
            System.out.printf("Average: %.2f\n", average);
            System.out.printf("Maximum: %d\n", max);
            System.out.printf("Minimum: %d\n", min);

            System.out.print("Sorted Data: ");
            for (int i = 0; i < n; i++) {
                System.out.print(data[i] + " ");
            }
            System.out.println("\n\n2D Array");
            int[][] matrix = {
                {10, 20, 30},
                {40, 50, 60}
            };

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index accessed!");
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter numbers only.");
        } finally {
            sc.close();
        }
    }
}
