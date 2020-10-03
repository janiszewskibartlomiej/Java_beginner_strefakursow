package inneTematy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * Created by Piotr Dzwiniel.
 *
 * Odcinek 13_2
 * "Framework Collections"
 */
public class FrameworkCollections {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        arrayList.add(0, 10);

        for (int i: arrayList) {
            System.out.println(i);
        }

        int x = arrayList.get(0);

        arrayList.remove(1);

        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(0, "Piotr Dzwiniel");
        hashMap.put(3, "Jan Kowalski");
        hashMap.put(7, "Beata Kozidrak");
        hashMap.put(9, "Elon Musk");

        // System.out.println(hashMap.get(9));

        ArrayList<String> mapList = new ArrayList<>(hashMap.values());

        Collections.shuffle(mapList);

        for (String s: mapList) {
            System.out.println(s);
        }

    }
}












