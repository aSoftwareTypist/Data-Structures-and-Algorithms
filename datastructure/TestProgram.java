package datastructure;

import datastructure.tests.*;
import datastructure.queue.linkedlist.LinearQueue;;

public class TestProgram {

        public static void testArrayQueue() {

                System.out.println("===== Testing LinearQueue (Array Implementation) =====");

                LinearQueue<Integer> q = new LinearQueue<Integer>();

                // 1. Test empty queue
                System.out.println("1. isEmpty (expected true): " + q.isEmpty());
                System.out.println("1. size (expected 0): " + q.size());

                // 2. Dequeue on empty queue
                try {
                        q.dequeue();
                        System.out.println("2. Dequeue on empty: FAILED");
                } catch (Exception e) {
                        System.out.println("2. Dequeue on empty: PASSED (" + e.getMessage() + ")");
                }

                // 3. Front on empty queue
                try {
                        q.getFront();
                        System.out.println("3. Front on empty: FAILED");
                } catch (Exception e) {
                        System.out.println("3. Front on empty: PASSED (" + e.getMessage() + ")");
                }

                // 4. Enqueue elements
                q.enqueue(10);
                q.enqueue(20);
                q.enqueue(30);

                System.out.println("4. Enqueued 10, 20, 30");

                // 5. Front element
                System.out.println("5. front (expected 10): " + q.getFront());

                // 6. Size check
                System.out.println("6. size (expected 3): " + q.size());

                // 7. Fill the queue
                q.enqueue(40);
                q.enqueue(50);

                // System.out.println("7. isFull (expected true): " + q.isFull());

                // 8. Enqueue when full
                try {
                        q.enqueue(60);
                        System.out.println("8. Enqueue on full queue: LinkedList queue implemented");
                } catch (Exception e) {
                        System.out.println("8. Enqueue on full queue: Array queue implemented (" + e.getMessage() + ")");
                }

                // 9. Dequeue elements
                System.out.println("9. dequeue (expected 10): " + q.dequeue());
                System.out.println("9. dequeue (expected 20): " + q.dequeue());

                // 10. FIFO order check
                System.out.println("10. front (expected 30): " + q.getFront());

                // 11. Dequeue remaining elements
                q.dequeue(); // 30
                q.dequeue(); // 40
                q.dequeue(); // 50

                System.out.println("11. isEmpty (expected true): " + q.isEmpty());
                System.out.println("11. size (expected 0): " + q.size());

                // 12. Linear queue limitation test
                try {
                        q.dequeue();
                        q.enqueue(70);
                        System.out.println("12. Enqueue after full dequeue (Linear behavior): "
                                        + "depends on implementation");
                } catch (Exception e) {
                        System.out.println("12. Enqueue after full dequeue: PASSED (" + e.getMessage() + ")");
                }

                System.out.println("===== All LinearQueue Tests Completed =====");
        }

        public static void main(String[] args) {
                // ArrayTest.testCases();
                // StackTest.testStackArray();
                StackTest.testStackArray();
                // LinkedListTest.testProgram();
        }
}
