//672115045 Virawit Kongthong OOP Lab 12 Generics Question 1
import java.util.ArrayList;
import java.util.Random;

public class question1generics {
    public static void main(String[] args) {
        //testcase 1
        ArrayList<Integer> numList = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            numList.add(i);
        }

        //testcase 2
        ArrayList<String> stringList = new ArrayList<String>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Carrot");
        stringList.add("Donkey");
        stringList.add("Elon Musk");
        stringList.add("Figma");

        System.out.println("Original List: " + numList);
        shuffle(numList);
        System.out.println("Shuffled List: " + numList);

        System.out.println();

        System.out.println("Original List: " + stringList);
        shuffle(stringList);
        System.out.println("Shuffled List: " + stringList);
    }

    public static <E> void shuffle(ArrayList<E> list) {
        Random rand = new Random();
        int n = list.size();
        for (int i = 0; i < n; i++) {
            int pos1, pos2;
            pos1 = rand.nextInt(n);
            pos2 = rand.nextInt(n);
            E temp = list.get(pos1);
            list.set(pos1, list.get(pos2));
            list.set(pos2, temp);
        }
    }
}
