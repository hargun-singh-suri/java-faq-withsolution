package questionOne;

import java.util.*;

public class Main {

    public static void main(String args[]) {
        //Creating initial temporary list
        ArrayList<Integer> initialList = new ArrayList<>();
        initialList.addAll(Arrays.asList(10, 20, 30, 40, 50, 10, 30, 80, 1, 2, 3, 1, 2));

        //Creating list which will hold the unique data
        ArrayList<Integer> finalList = new ArrayList<>();

        //Creating set to maintain unique value through out Iteration
        Set<Integer> uniqueKey = new HashSet<>();
        int listSize = initialList.size();

        //Print initial data
        System.out.println("Initial data with Duplicate elements "+initialList.toString());

        //Perform Logic
        for (int i = 0; i < listSize; i++) {
            if (!uniqueKey.contains(initialList.get(i))) {
                uniqueKey.add(initialList.get(i));
                finalList.add(initialList.get(i));
            }
        }

        //Making initial to point to final list created in iteration
        initialList = finalList;

        //Printing value of list with unique data
        System.out.println("Final Data with Unique elements "+ initialList.toString());

        //Objects Eligible for Garbage Collection
        finalList = null;
        uniqueKey = null;
    }
}
