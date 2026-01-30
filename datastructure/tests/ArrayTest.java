package datastructure.tests;

import datastructure.arrays.Array;

public class ArrayTest {

    public static void testCases() {

        Array<Integer> arr = new Array<Integer>(3);

        System.out.println("=== Initial State ===");
        Array.display(arr);

        System.out.println("\n=== Insert Elements ===");
        arr.insert(0, 10);
        arr.insert(1, 20);
        arr.insert(2, 30);
        Array.display(arr);

        System.out.println("\n=== Insert At Middle ===");
        arr.insert(1, 15); // triggers resize
        Array.display(arr);

        System.out.println("\n=== Get Elements ===");
        System.out.println("Element at index 2: " + arr.get(2));

        System.out.println("\n=== Set Element ===");
        arr.set(2, 99);
        Array.display(arr);

        System.out.println("\n=== indexOf Tests ===");
        System.out.println("Index of 99: " + arr.indexOf(99));
        System.out.println("Index of 100 (not present): " + arr.indexOf(100));

        System.out.println("\n=== Remove Element ===");
        System.out.println("Removed: " + arr.remove(1));
        Array.display(arr);

        System.out.println("\n=== Remove First Element ===");
        arr.remove(0);
        Array.display(arr);

        System.out.println("\n=== Remove Last Element ===");
        arr.remove(arr.size() - 1);
        Array.display(arr);

        System.out.println("\n=== Empty Check ===");
        System.out.println("Is empty? " + arr.isEmpty());

        System.out.println("\n=== Remove All ===");
        while (!arr.isEmpty()) {
            arr.remove(0);
        }
        Array.display(arr);

        System.out.println("\nIs empty now? " + arr.isEmpty());

        System.out.println("\n=== Boundary Case (Exception Expected) ===");
        try {
            arr.get(0);
        } catch (Exception e) {
            System.out.println("Caught exception: " + e);
        }
    }

}
