import Book.Arrays.ScoreBoard;
import Book.Arrays.GameEntry;
// import tests.LinkedListProgram;

public class MainProgram {
        public static void main(String[] args) {
                GameEntry player1 = new GameEntry("jpt", 32);
                ScoreBoard brd = new ScoreBoard(5);
                brd.addEntry(player1);
                brd.addEntry(player1);
                // brd.display();
                brd.removeEntry(1);
                brd.display();
                // LinkedListProgram.testProgram();
        }
}
