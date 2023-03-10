import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Fruits {

    public static void run() {

        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Pear", "Banana", "Apple", "Cherry", "Fig", "Orange", "Banana", "Apple"));
        Set<String> uniqueFruits = new HashSet<>(fruits);
        System.out.println("\nList of fruits: " + fruits + "\nFruits list size: " + fruits.size() + "\n\nList of unique fruits: " + uniqueFruits + "\nUnique fruits list size: " + uniqueFruits.size());

    }
}
