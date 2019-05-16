package question_2;

public class Main {
    public static void main(String args[]) {
        //Assign value in temp array
        int[] array = new int[]{10, 20, 30, 40, 50, 5, 1, 7, 100, 65, 5};

        //Assign temp variables
        int highest = 0, secondHighest = 0, temp = 0;

        //Logic for getting second highest value
        for (int i = 0; i < array.length; i++) {
            if (array[i] > highest) {
                temp = highest;
                highest = array[i];
                secondHighest = temp;
            } else if (array[i] > secondHighest) {
                secondHighest = array[i];
            }
        }

        //Printing value for second highest value
        System.out.println("The highest number is " + highest);
        System.out.println("The highest number is " + secondHighest);

    }
}
