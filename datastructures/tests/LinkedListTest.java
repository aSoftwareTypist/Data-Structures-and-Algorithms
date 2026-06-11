package datastructure.tests;

import datastructure.abstracts.LinkedList;
import datastructure.linkedlists.Singly;

public class LinkedListTest {
    public static void testProgram() {
        try {

            LinkedList<Integer> list = new Singly<Integer>();

            System.out.println("===== EMPTY LIST TEST =====");
            System.out.println("Size: " + list.size());
            System.out.println("Is Empty: " + list.isEmpty());
            list.displayList();

            try {
                list.removeFrontNode();
            } catch (Exception e) {
                System.out.println("removeFrontNode() on empty list ✔");
            }

            try {
                list.removeNthNode(0);
            } catch (Exception e) {
                System.out.println("removeNthNode() on empty list ✔");
            }

            try {
                list.removeEndNode();
            } catch (Exception e) {
                System.out.println("removeEndNode() on empty list ✔");
            }

            System.out.println("\n===== SINGLE ELEMENT TEST =====");
            list.addFrontNode(10);
            list.displayList();

            System.out.println("Front: " + list.getFrontNodeElement());
            System.out.println("Nth(0): " + list.getNthNodeElement(0));
            System.out.println("End: " + list.getEndNodeElement());

            System.out.println("Removed Front: " + list.removeFrontNode());
            list.displayList();

            System.out.println("\n===== MULTIPLE ELEMENT ADD TEST =====");
            list.addEndNode(1);
            list.addEndNode(2);
            list.addEndNode(4);
            list.displayList();

            System.out.println("Add at index 2 (value 3)");
            list.addNthNode(2, 3);
            list.displayList();

            System.out.println("Add at front (0)");
            list.addNthNode(0, 0);
            list.displayList();

            System.out.println("Add at end (size)");
            list.addNthNode(list.size(), 5);
            list.displayList();

            System.out.println("\n===== GET TEST =====");
            System.out.println("Front: " + list.getFrontNodeElement());
            System.out.println("Nth(3): " + list.getNthNodeElement(3));
            System.out.println("End: " + list.getEndNodeElement());

            System.out.println("\n===== REMOVE TEST =====");
            System.out.println("Remove front: " + list.removeFrontNode());
            list.displayList();

            System.out.println("Remove nth(2): " + list.removeNthNode(2));
            list.displayList();

            System.out.println("Remove end: " + list.removeEndNode());
            list.displayList();

            System.out.println("\n===== FINAL STATE =====");
            System.out.println("Size: " + list.size());
            System.out.println("Is Empty: " + list.isEmpty());
            list.displayList();

            System.out.println("\n===== ALL TESTS COMPLETED =====");

        } catch (Exception e) {

            System.out.println("Error: " + e.toString());
        }
    }

}
