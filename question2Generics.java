//672110545 Virawit Kongthong OOP-Lab12 Question 2
import java.util.ArrayList;
import java.util.Random;

public class question2Generics {
    public static void main(String[] args) {
        //testcase 1
        ArrayList<Integer> numberList = new ArrayList<Integer>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            numberList.add(rand.nextInt(10));
        }

        //testcase 2
        ArrayList<String> stringList = new ArrayList<String>();
        stringList.add("Apple");
        stringList.add("Animation");
        stringList.add("Banana");
        stringList.add("Carrot");
        stringList.add("Donkey");
        stringList.add("Elon Musk");
        stringList.add("Figma");

        System.out.println("List: " + numberList + "\nThe smallest element is " + min(numberList));
        System.out.println("List: " + stringList + "\nThe smallest element is " + min(stringList));
    }

    public static <E extends Comparable<E>> E min(ArrayList<E> list) {
        E min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).compareTo(min) < 0) {
                min = list.get(i);
            }
        }
        return min;
    }
}
