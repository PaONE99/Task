import java.util.Random;

public class ArrayShuffler {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        shuffleArray(numbers);
     
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

    public static void shuffleArray(int[] arr) {
        int length = arr.length;
        Random random = new Random();

        for (int i = length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
