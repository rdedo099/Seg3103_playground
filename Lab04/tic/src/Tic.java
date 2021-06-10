package tic;

public class Tic{
  private static String[][] board = {{"_|","|_","|_"},{"_|","|_","|_"},{"_|","|_","|_"}};
  public static String[][] updateBoard(int x, int y, int player){
    if (player == 1) {
      board[x][y] = "X";
    } else if (player == 2) {
      board[x][y] = "O";
    } else {
      System.out.println("Invalid player");
    }
    return board;
  }
}