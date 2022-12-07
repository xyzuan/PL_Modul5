import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);

        System.out.print("Size : ");
        int size = inputData.nextInt();
        int[] data = new int[size];
        System.out.print("Input Data : ");
        for (int i = 0; i < data.length; i++){
            data[i] = inputData.nextInt();
        }
        Arrays.sort(data);
        System.out.println("\nResult :");
        for (int num : data) {
            System.out.print(num + " ");
        }
        System.out.println("\n");
        System.out.printf("Positif : " + "%1.2f\n", ratio(data, "positive"));
        System.out.printf("Negatif : " + "%1.2f\n", ratio(data, "negative"));
        System.out.printf("Zero : " +"%1.2f\n", ratio(data, "zero"));
        System.out.println();
    }

    static float ratio(int[] arr, @NotNull String params){
        float count = 0;
        switch (params) {
            case "positive" -> {
                for (int num : arr) {
                    if (num > 0) count++;
                }
            }
            case "negative" -> {
                for (int num : arr) {
                    if (num < 0) count++;
                }
            }
            case "zero" -> {
                for (int num : arr) {
                    if (num == 0) count++;
                }
            }
        }
        return count / arr.length;
    }
}
