import Book.Arrays.ScoreBoard;
import tests.*;
import Book.Arrays.GameEntry;

public class MainProgram {
        public static void gameScore() {

                GameEntry player1 = new GameEntry("jpt", 32);
                ScoreBoard brd = new ScoreBoard(5);
                brd.addEntry(player1);
                brd.addEntry(player1);
                brd.display();
                brd.removeEntry(1);
                brd.display();
        }

        public static void main(String[] args) {
                // ArrayTest.testCases();
                // StackTest.testStackArray();
                StackTest.testStackLinkedList();
                // LinkedListTest.testProgram();
        }
}
