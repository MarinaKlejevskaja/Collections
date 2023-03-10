import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Numbers {

    public static void run() {
        int[] numbers = {40,55, 63, 17, 22, 68, 89, 97, 89};

        List<int[]> numbersList = Arrays.asList(numbers);
        List<Integer> numList   = new ArrayList<>();
        for (int number : numbers) {
            numList.add(number);
       //     System.out.print(number+ " ");
        }
        System.out.println(numList);
    }
}
