public class Cars {
    public static void run() {
        String[] cars = {"Subaru", "BMW", "Suzuki"};
        System.out.println("Second item: " + cars[1]);

        cars[2] = "Honda";

        System.out.println("Array has " + cars.length + " elements");
        for (String car : cars) {

            System.out.println(car);
        }
    }
}
