import java.util.Arrays;
import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Integer[] data = new Integer[]{-75, -10, 0, 30, 0, -30, 90, 70, 89, -50, -55, -30};

        System.out.println("Unsorted Arrays : ");
        for (int num : data)
            System.out.printf("%6s", num);

        System.out.println("\n\nSorted Arrays : ");
        Arrays.sort(data);
        for (int num : data)
            System.out.printf("%6s", num);

        System.out.print("\n\nFind index element : ");
        int userIndex = input.nextInt();
        System.out.print("\n" + userIndex + " found in index " + Arrays.binarySearch(data, userIndex));
    }
}
