import java.util.*;

public class battleship {
  
  public static void main(String[] args) {

    System.out.println("Hello");
    char[][] ship1 = {
      {'X','.','.','X'},
      {'.','.','.','X'},
      {'.','.','.','X'}
    };

    char[][] ship2 = {
      {'X','.','.','.'},
      {'x','.','.','.'},
      {'.','.','.','.'}
    };
    
    // invalid example
    /* char[][] ship2 = {
      {'.','.','.','X'},
      {'X','X','X','X'},
      {'.','.','.','X'}
    }; */

    System.out.println("ships1: " + countBattleships(ship1));
    System.out.println("ships2: " + countBattleships(ship2));
    //System.out.println("ships1: " + countBattleships2(ship1));
    //System.out.println("ships2: " + countBattleships2(ship2));
  }
  
  public static int countBattleships(char[][] board) {
    int numBattleships = 0;
    for(int i = 0; i < board.length; i++){
      for(int j = 0; j < board[i].length; j++){
        if(board[i][j] == 'X'){
          numBattleships++;
          sink(board, i, j);
        }
      }
    }
    return numBattleships;
  }
  
  public static void sink(char[][] board, int i, int j) {
   if(i < 0 || i >= board.length || j < 0 || j >= board[i].length || board[i][j] != 'X')
     return;
   board[i][j] = '.';
   sink(board, i+1, j);
   sink(board, i-1, j);
   sink(board, i, j+1);
   sink(board, i, j-1);
  }

  public static int countBattleships2(char[][] board) {
    int numBattleships = 0;
    for(int i = 0; i < board.length; i++){
      for(int j = 0; j < board[i].length; j++){
        if(board[i][j] == '.')
          continue;
        if(i > 0 && board[i-1][j] == 'X')
          continue;
        if(j > 0 && board[i][j-1] == 'X')
          continue;
        numBattleships++;
      }
    }
    return numBattleships;
  }
    
}
