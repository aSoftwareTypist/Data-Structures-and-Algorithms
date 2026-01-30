import Book.Arrays.ScoreBoard;
import tests.ArrayTest;
import tests.StackTest;
import Book.Arrays.GameEntry;

// import tests.LinkedListProgram;

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
                StackTest.arrayStackTest();
        }
}
