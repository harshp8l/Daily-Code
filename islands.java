import java.util.*;

public class islands {
  
  public static void main(String[] args) {

    System.out.println("Hello");
    char[][] one = {
      {'1','1','1','1','0'},
      {'1','1','0','1','0'},
      {'1','1','0','0','0'},
      {'0','0','0','0','0'}
    };

    char[][] two = {
      {'1','1','0','0','0'},
      {'1','1','0','0','0'},
      {'0','0','1','0','0'},
      {'0','0','0','1','1'}
    };

    System.out.println("numIslands:" + numIslands(one));
    System.out.println("numIslands:" + numIslands(two));
  }

  public static int numIslands(char[][] grid){
    if(grid == null || grid.length == 0) 
      return 0;
    
    int numIslands = 0;
    for(int i = 0; i < grid.length; i++){
      for(int j = 0; j < grid[i].length; j++){
        if(grid[i][j] == '1'){
          numIslands += dfs(grid, i, j);
        }     
      }
    }

    return numIslands;
  }
  
  public static int dfs(char[][] grid, int i, int j){
    if(i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == '0')
        return 0;
    
    grid[i][j] = '0';
    dfs(grid, i+1, j);
    dfs(grid, i-1, j);
    dfs(grid, i, j+1);
    dfs(grid, i, j-1);

    return 1;
  }
}