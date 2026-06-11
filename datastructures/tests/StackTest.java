package datastructure.tests;

import datastructure.abstracts.Stack;
import datastructure.stacks.StackArray;
import datastructure.stacks.StackLinkedList;

public class StackTest {

    public static void testStackArray() {

        System.out.println("=== ARRAY STACK TEST STARTED ===");

        Stack<Integer> stack = new StackArray<>(3);

        /* ---------- TEST 1: isEmpty on new stack ---------- */
        assert stack.isEmpty() : "❌ Stack should be empty initially";
        assert stack.size() == 0 : "❌ Initial size should be 0";
        System.out.println("✔ Test 1 passed: Empty stack check");

        /* ---------- TEST 2: push elements ---------- */
        stack.push(10);
        stack.push(20);
        stack.push(30);

        assert !stack.isEmpty() : "❌ Stack should not be empty after push";
        assert stack.size() == 3 : "❌ Stack size should be 3";
        System.out.println("✔ Test 2 passed: Push operation");

        /* ---------- TEST 3: peek ---------- */
        assert stack.peek() == 30 : "❌ Peek should return top element (30)";
        assert stack.size() == 3 : "❌ Peek should not remove element";
        System.out.println("✔ Test 3 passed: Peek operation");

        /* ---------- TEST 4: pop ---------- */
        int popped = stack.pop();
        assert popped == 30 : "❌ Pop should return 30";
        assert stack.size() == 2 : "❌ Size should reduce after pop";
        System.out.println("✔ Test 4 passed: Pop operation");

        /* ---------- TEST 5: LIFO order ---------- */
        assert stack.pop() == 20 : "❌ Stack is not following LIFO";
        assert stack.pop() == 10 : "❌ Stack is not following LIFO";
        assert stack.isEmpty() : "❌ Stack should be empty after popping all elements";
        System.out.println("✔ Test 5 passed: LIFO behavior");

        /* ---------- TEST 6: pop on empty stack (UNDERFLOW) ---------- */
        try {
            stack.pop();
            assert false : "❌ Pop on empty stack should throw exception";
        } catch (RuntimeException e) {
            System.out.println("✔ Test 6 passed: Underflow handled");
        }

        /* ---------- TEST 7: peek on empty stack ---------- */
        try {
            stack.peek();
            assert false : "❌ Peek on empty stack should throw exception";
        } catch (RuntimeException e) {
            System.out.println("✔ Test 7 passed: Peek on empty stack handled");
        }

        /* ---------- TEST 8: overflow ---------- */

        stack.push(1);
        stack.push(3);

        try {
            stack.push(4);
            assert false : "❌ Push on full stack should throw exception";
        } catch (RuntimeException e) {
            System.out.println("✔ Test 8 passed: Overflow handled");
        }

        /* ---------- TEST 9: stack integrity after overflow ---------- */
        assert stack.size() == 3 : "❌ Stack size changed after overflow attempt";
        assert stack.peek() == 3 : "❌ Top element incorrect after overflow attempt";
        System.out.println("✔ Test 9 passed: Stack integrity preserved");

        System.out.println("=== ALL ARRAY STACK TESTS PASSED ===");
    }

    public static void testStackLinkedList() {

        System.out.println("=== LINKED STACK TEST STARTED ===");

        Stack<Integer> stack = new StackLinkedList<Integer>();

        /* ---------- TEST 1: isEmpty on new stack ---------- */
        assert stack.isEmpty() : "❌ Stack should be empty initially";
        assert stack.size() == 0 : "❌ Initial size should be 0";
        System.out.println("✔ Test 1 passed: Empty stack check");

        /* ---------- TEST 2: push elements ---------- */
        stack.push(10);
        stack.push(20);
        stack.push(30);

        assert !stack.isEmpty() : "❌ Stack should not be empty after push";
        assert stack.size() == 3 : "❌ Stack size should be 3";
        System.out.println("✔ Test 2 passed: Push operation");

        /* ---------- TEST 3: peek ---------- */
        assert stack.peek() == 30 : "❌ Peek should return top element (30)";
        assert stack.size() == 3 : "❌ Peek should not remove element";
        System.out.println("✔ Test 3 passed: Peek operation");

        /* ---------- TEST 4: pop ---------- */
        int popped = stack.pop();
        assert popped == 30 : "❌ Pop should return 30";
        assert stack.size() == 2 : "❌ Size should reduce after pop";
        System.out.println("✔ Test 4 passed: Pop operation");

        /* ---------- TEST 5: LIFO order ---------- */
        assert stack.pop() == 20 : "❌ Stack is not following LIFO";
        assert stack.pop() == 10 : "❌ Stack is not following LIFO";
        assert stack.isEmpty() : "❌ Stack should be empty after popping all elements";
        System.out.println("✔ Test 5 passed: LIFO behavior");

        /* ---------- TEST 6: pop on empty stack (UNDERFLOW) ---------- */
        try {
            stack.pop();
            assert false : "❌ Pop on empty stack should throw exception";
        } catch (RuntimeException e) {
            System.out.println("✔ Test 6 passed: Underflow handled");
        }

        /* ---------- TEST 7: peek on empty stack ---------- */
        try {
            stack.peek();
            assert false : "❌ Peek on empty stack should throw exception";
        } catch (RuntimeException e) {
            System.out.println("✔ Test 7 passed: Peek on empty stack handled");
        }

        /* ---------- TEST 8: push after empty (dynamic growth) ---------- */
        for (int i = 1; i <= 100; i++) {
            stack.push(i); // LinkedStack can grow dynamically
        }
        assert stack.size() == 100 : "❌ Dynamic push failed";
        assert stack.peek() == 100 : "❌ Top element incorrect after dynamic push";
        System.out.println("✔ Test 8 passed: Dynamic growth check");

        /* ---------- TEST 9: clear ---------- */
        stack.clear();
        assert stack.isEmpty() : "❌ Stack should be empty after clear";
        System.out.println("✔ Test 9 passed: Clear operation");

        System.out.println("=== ALL LINKED STACK TESTS PASSED ===");
    }
}
