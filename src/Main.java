import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(array));
        int key = scanner.nextInt();
        array = Arrays.stream(array).filter(value -> value != key).toArray();
        System.out.println(Arrays.toString(array));
    }
}
