package examples.Arrays;

public class GameEntry{

  private String name;
  private int score;

  public GameEntry(){}
  public GameEntry(String naam, int scr){
    name = naam;
    score = scr;
  }

  public String getName(){
    return name;
  }

  public int getScore(){
    return score;
  }
}

