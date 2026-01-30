package examples.Arrays;

public class ScoreBoard {


  private int numEntries;
  private GameEntry[] board;

  public ScoreBoard(int capacity) {
    numEntries = 0;
    board = new GameEntry[capacity];
  }

  public void addEntry(GameEntry e) {
    int newScore = e.getScore();

    if (numEntries < board.length || newScore < board[numEntries - 1].getScore()) {
      if (numEntries < board.length)
        numEntries++;

      int i = numEntries - 1;
      for (; i > 0 && board[i - 1].getScore() < newScore; i--)
        board[i] = board[i - 1];

      board[i] = e;
    }

  }

  public GameEntry removeEntry(int idx) {
    if (idx >= numEntries || idx < 0)
      throw new IndexOutOfBoundsException("Invalid index: " + idx);

    GameEntry tempEntry = board[idx];

    for (int i = idx; i < numEntries - 1; i++)
      board[i] = board[i + 1];

    board[numEntries - 1] = null;
    numEntries--;
    return tempEntry;
  }

  public void display() {

    for (int i = 0; i < numEntries; i++) {
      System.out.println(board[i].getScore());
    }
  }
}
