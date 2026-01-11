import _4LinkedLists.*;

public class MainProgram {
    public static void main(String[] args) {
        try {
            int index = 2;
            System.out.println();
            LinkedList<Integer> linkedList = new Doubly<Integer>(0);
            linkedList.displayList();

            System.out.println("\nThe removed element from end of list is: " + linkedList.removeEndNode());
            linkedList.addFrontNode(10);
            linkedList.displayList();
            linkedList.addEndNode(15);
            linkedList.displayList();
            linkedList.addNthNode(2, 4);
            linkedList.displayList();

            // linkedList.rotate();
            System.out.println("\nThe element in front is: " + linkedList.getfrontNodeElement());
            System.out.println("\nThe element in index " + index + " is: " + linkedList.getNthNodeElement(index));

            System.out.println("\nThe removed element from front of list is: " + linkedList.removeFrontNode());
            linkedList.displayList();
            System.out.println(
                    "\nThe removed element from index " + index + " of list is: " + linkedList.removeNthNode(index));
            linkedList.displayList();
            linkedList.displayList();
            System.out.println("\nThe element in end is: " + linkedList.getEndNodeElement());

        } catch (Exception e) {

            System.out.println("Error: " + e.toString());
        }
    }

}
