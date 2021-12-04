import java.util.*;
class Solution
{
  private int directions[][] = { {1, 0}, {-1, 0}, {0, 1}, {0, -1} };

  public static int countIsland (int[][]arr)
  {
    if (arr == null || arr.length == 0)
      return 0;
    int islandId = 2, m = arr.length, n = arr[0].length;
    Map < Integer, Integer > map = new HashMap ();

    for (int i = 0; i < m; i++)
      {
	for (int j = 0; j < n; j++)
	  {
	    if (arr[i][j] == 1)
	      {
		int size = getIslandSize (arr, i, j, islandId);
		map.put (islandId++, size);
	      }
	  }
      }
    return map.size ();
  }

  private static int getIslandSize (int[][]grid, int i, int j, int islandId)
  {
    if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length
	|| grid[i][j] != 1)
      return 0;
    grid[i][j] = islandId;

    int left = getIslandSize (grid, i, j - 1, islandId);
    int right = getIslandSize (grid, i, j + 1, islandId);
    int up = getIslandSize (grid, i - 1, j, islandId);
    int down = getIslandSize (grid, i + 1, j, islandId);
    int a = getIslandSize (grid, i - 1, j - 1, islandId);
    int b = getIslandSize (grid, i + 1, j + 1, islandId);
    int c = getIslandSize (grid, i + 1, j - 1, islandId);
    int d = getIslandSize (grid, i - 1, j + 1, islandId);

    return left + right + up + down + 1 + a + b + c + d;
  }

  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    int m = sc.nextInt ();
    int n = sc.nextInt ();
    int arr[][] = new int[m][n];

    for (int i = 0; i < m; i++)
      for (int j = 0; j < n; j++)
	arr[i][j] = sc.nextInt ();

    System.out.println (countIsland (arr));
  }
}
