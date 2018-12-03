import java.util.*;

public class floodfill {
  
  public static void main(String[] args) {

    System.out.println("Hello");
    int[][] image1 = {{1,1,1},{1,1,0},{1,0,1}};
    System.out.println(Arrays.deepToString(floodFill(image1,1,1,2))); 
    //[[2,2,2],[2,2,0],[2,0,1]]
  }

  public static int[][] floodFill(int[][] image, int sr, int sc, int newColor){
    if(image[sr][sc] == newColor)
      return image;

    fill(image, sr, sc, image[sr][sc], newColor);
    return image; 
  }

  public static void fill(int[][] image, int i, int j, int color, int newColor){
    if(i < 0 || i >= image.length || j < 0 || j >= image[i].length || image[i][j] != color)
      return;
    
    image[i][j] = newColor;
    fill(image, i+1, j, color, newColor);
    fill(image, i-1, j, color, newColor);
    fill(image, i, j+1, color, newColor);
    fill(image, i, j-1, color, newColor);
  }
}
