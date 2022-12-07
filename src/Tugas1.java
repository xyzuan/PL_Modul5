import java.util.Arrays;
import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] data = new int[]{-75, -10, 0, 30, 0, -30, 90, 70, 89, -50, -55, -30};
        boolean swapped = true;
        int j = 0;

        System.out.println("Unsorted Arrays : ");
        for (int num : data)
            System.out.printf("%6s", num);

        System.out.println("\n\nSorted Arrays : ");
        while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < data.length - j; i++) {
                if (data[i] > data[i + 1]) {
                    int tmp = data[i];
                    data[i] = data[i + 1];
                    data[i + 1] = tmp;
                    swapped = true;
                }
            }
        }
        for (int num : data)
            System.out.printf("%6s", num);

        System.out.print("\n\nFind index element : ");
        findIndex(data, input.nextInt());

    }

    static void findIndex(int[] array, int value) {
        int[] foundArr = {};
        int foundIndex = 0;
        for(int i = 0; i < array.length; i++)
            if (array[i] == value) {
                foundArr = Arrays.copyOf(foundArr, foundArr.length + 1);
                foundArr[foundIndex] = i;
                foundIndex++;
            } else {
                foundArr = Arrays.copyOf(foundArr, foundArr.length + 1);
                foundArr[foundIndex] = -1;
                foundIndex++;
            }

        // Disp Block
        for (int data : array)
            System.out.printf("%6s", data);

        System.out.println();
        for (int data : foundArr)
            if (data == -1) System.out.printf("%6s", "");
            else System.out.printf("%6s", "^");

        System.out.print("\n" + value + " found in index ");
        for (int data : foundArr)
            if (data != -1) System.out.print(data + " ");
    }
}
