//672115045 Virawit Kongthong OOP-Lab12 Question 3
import java.util.ArrayList;

public class question3Generics {
    public static void main(String[] args) {
        ArrayList<String> stringListTestCase1 = new ArrayList<String>();
        stringListTestCase1.add("Giraffe");
        stringListTestCase1.add("Octopus");
        stringListTestCase1.add("Mountains");
        stringListTestCase1.add("Jungle");
        stringListTestCase1.add("Chocolate");
        stringListTestCase1.add("Cucumber");
        stringListTestCase1.add("Dinosaur");
        stringListTestCase1.add("Laptop");
        stringListTestCase1.add("Sunflower");
        stringListTestCase1.add("Pineapple");

        System.out.println("Original List: " + stringListTestCase1);
        sort(stringListTestCase1);
        System.out.println("Sorted List: " + stringListTestCase1);

    }

    public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
        for (int i = 1; i < list.size(); i++) {
            E key = list.get(i);
            int j = i - 1;
            while (j >= 0 && list.get(j).compareTo(key) > 0) {
                list.set(j + 1, list.get(j));
                j -= 1;
            }
            list.set(j + 1, key);
        }
    }
}
