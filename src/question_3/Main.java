package question_3;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String args[]) {
        System.out.println("Without equals and hashcode");
        withoutEqualAndHashcode();

        System.out.println("With equals and hashcode");
        withEqualAndHashcode();
    }

    //Example - 1  without equals and hashcode
    public static void withoutEqualAndHashcode() {
        Map<Employee, String> exampleOne = new HashMap<>();

        Employee objOne = new Employee(1, "Tom");
        Employee objTwo = new Employee(1, "Tom");
        Employee objThree = new Employee(1, "Tom");
        Employee objFour = new Employee(1, "Tom");

        exampleOne.put(objOne, "User 1");
        exampleOne.put(objTwo, "User 1");
        exampleOne.put(objThree, "User 1");
        exampleOne.put(objFour, "User 1");

        /*Though we have same information in object but object will be unique in HashMap due to absence
            of matching criteria of fields in Employee*/

        for (Map.Entry item : exampleOne.entrySet()) {
            System.out.println(item.toString());
        }

        System.out.println("Size : " + exampleOne.size());
    }

    //Example - 1  with equals and hashcode
    public static void withEqualAndHashcode() {
        Map<EmployeeWithEqHc, String> exampleTwo = new HashMap<>();

        EmployeeWithEqHc objOne = new EmployeeWithEqHc(1, "Tom");
        EmployeeWithEqHc objTwo = new EmployeeWithEqHc(1, "Tom");
        EmployeeWithEqHc objThree = new EmployeeWithEqHc(1, "Tom");
        EmployeeWithEqHc objFour = new EmployeeWithEqHc(1, "Tom");
        EmployeeWithEqHc objFive = new EmployeeWithEqHc(2, "Harry");

        exampleTwo.put(objOne, "User 1");
        exampleTwo.put(objTwo, "User 1");
        exampleTwo.put(objThree, "User 1");
        exampleTwo.put(objFour, "User 1");
        exampleTwo.put(objFive, "User 2");

        /*Though we have same information in object and object will be unique in HashMap due to
             matching criteria of fields id in Employee therefore only 1 value for each unique id will exist, rest will
             be override */

        for (Map.Entry item : exampleTwo.entrySet()) {
            System.out.println(item.toString());
        }

        System.out.println("Size : " + exampleTwo.size());

    }
}
