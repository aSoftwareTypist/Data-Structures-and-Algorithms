package datastructure;

import datastructure.abstracts.Queue;
import datastructure.queue.array.*;;

public class TestProgram {

        public static void testQueue(Queue<Integer> q, String name) {

                System.out.println("\n===== Testing Queue : " + name + " =====");

                /* ---------- EMPTY QUEUE TESTS ---------- */

                System.out.println("1. isEmpty (expected true): " + q.isEmpty());
                System.out.println("2. size (expected 0): " + q.size());

                try {
                        q.dequeue();
                        System.out.println("3. Dequeue on empty: FAILED");
                } catch (Exception e) {
                        System.out.println("3. Dequeue on empty: PASSED (" + e.getMessage() + ")");
                }

                try {
                        q.getFront();
                        System.out.println("4. getFront on empty: FAILED");
                } catch (Exception e) {
                        System.out.println("4. getFront on empty: PASSED (" + e.getMessage() + ")");
                }

                try {
                        q.getRear();
                        System.out.println("5. getRear on empty: FAILED");
                } catch (Exception e) {
                        System.out.println("5. getRear on empty: PASSED (" + e.getMessage() + ")");
                }

                /* ---------- ENQUEUE TESTS ---------- */

                q.enqueue(10);
                q.enqueue(20);
                q.enqueue(30);

                System.out.println("6. Enqueued: 10, 20, 30");

                System.out.println("7. getFront (expected 10): " + q.getFront());
                System.out.println("8. getRear (expected 30): " + q.getRear());
                System.out.println("9. size (expected 3): " + q.size());

                /* ---------- FIFO ORDER TEST ---------- */

                System.out.println("10. dequeue (expected 10): " + q.dequeue());
                System.out.println("11. dequeue (expected 20): " + q.dequeue());

                System.out.println("12. getFront (expected 30): " + q.getFront());
                System.out.println("13. size (expected 1): " + q.size());

                /* ---------- CLEAR TEST ---------- */

                q.clear();
                System.out.println("14. clear()");
                System.out.println("15. isEmpty after clear (expected true): " + q.isEmpty());
                System.out.println("16. size after clear (expected 0): " + q.size());

                /* ---------- REUSABILITY TEST ---------- */

                q.enqueue(99);
                System.out.println("17. enqueue after clear (expected 99): " + q.getFront());

                System.out.println("===== Generic Queue Tests Completed =====");
        }

        public static void testFixedCapacityQueue(Queue<Integer> q, int capacity) {

                System.out.println("\n===== Testing Fixed Capacity Behavior =====");

                for (int i = 1; i <= capacity; i++) {
                        q.enqueue(i * 10);
                }

                System.out.println("1. Filled queue to capacity (" + capacity + ")");
                System.out.println("2. isFull (expected true): " + q.isFull());

                try {
                        q.enqueue(999);
                        System.out.println("3. Enqueue on full queue: FAILED");
                } catch (Exception e) {
                        System.out.println("3. Enqueue on full queue: PASSED (" + e.getMessage() + ")");
                }

                q.dequeue();
                q.dequeue();

                System.out.println("4. Dequeued two elements");

                try {
                        q.enqueue(777);
                        q.enqueue(888);
                        System.out.println("5. Enqueue after dequeue: PASSED (Circular or Resizable behavior)");
                } catch (Exception e) {
                        System.out.println("5. Enqueue after dequeue: FAILED (" + e.getMessage() + ")");
                }

                System.out.println("===== Fixed Capacity Tests Completed =====");
        }

        public static void testLinkedListQueue(Queue<Integer> q) {

                System.out.println("\n===== Testing LinkedList Queue Behavior =====");

                try {
                        for (int i = 0; i < 1000; i++)
                                q.enqueue(i);

                        System.out.println("1. Enqueued 1000 elements: PASSED");
                } catch (Exception e) {
                        System.out.println("1. Overflow in LinkedList Queue: FAILED");
                }

                System.out.println("2. size (expected 1000): " + q.size());
                System.out.println("===== LinkedList Queue Tests Completed =====");
        }

        public static void main(String[] args) {

                testQueue(new LinearQueue<Integer>(5), "Linear Queue (Array)");
                testFixedCapacityQueue(new LinearQueue<Integer>(5), 5);

                testQueue(new CircularQueue<Integer>(5), "Circular Queue (Array)");
                testFixedCapacityQueue(new CircularQueue<Integer>(5), 5);

                testQueue(new datastructure.queue.linkedlist.LinearQueue<Integer>(),
                                "Linear Queue (LinkedList)");
                testLinkedListQueue(new datastructure.queue.linkedlist.LinearQueue<Integer>());
        }

}
