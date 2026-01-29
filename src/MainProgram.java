import Book.Arrays.ScoreBoard;
import _3Arrays.Array;
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
                // LinkedListProgram.testProgram();
                Array<Integer> array = new Array<Integer>(2);
                array.insert(0, 99);
                array.insert(1, 99);
                array.set(0, 54);
                array.insert(0, 3);
                array.insert(3, 32);
                System.out.println(array.indexOf(99));
                array.display();

        }
}
