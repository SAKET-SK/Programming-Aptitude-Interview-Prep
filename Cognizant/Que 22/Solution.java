import java.util.*;
class Solution
{
  public static int cost (int grid[][], int row1, int col1, int row2,
			  int col2)
  {
    if (row1 == row2 && col1 == col2)
      {
	if (grid[row1][col1] == 1)
	  return 1;
	return 0;
      }
    int ans = 0;

    if (grid[row1][col1] == 1)
      ans++;

    if (grid[row2][col2] == 1)
      ans++;

    return ans;
  }

  public static int solve (int n, int m, int grid[][], int dp[][][], int row1,
			   int col1, int row2)
  {
    int col2 = (row1 + col1) - (row2);

    if (row1 == n - 1 && col1 == m - 1 && row2 == n - 1 && col2 == m - 1)
      return 0;

    if (row1 >= n || col1 >= m || row2 >= n || col2 >= m)
      return -1 * Integer.MAX_VALUE;

    if (dp[row1][col1][row2] != -1)
      return dp[row1][col1][row2];

    int ch1 = -1 * Integer.MAX_VALUE, ch2 = -1 * Integer.MAX_VALUE;
    int ch3 = -1 * Integer.MAX_VALUE, ch4 = -1 * Integer.MAX_VALUE;

    if (grid[row1][col1 + 1] != -1 && grid[row2 + 1][col2] != -1)
      ch1 =
	cost (grid, row1, col1 + 1, row2 + 1, col2) + solve (n, m, grid, dp,
							     row1, col1 + 1,
							     row2 + 1);

    if (grid[row1][col1 + 1] != -1 && grid[row2][col2 + 1] != -1)
      ch2 =
	cost (grid, row1, col1 + 1, row2, col2 + 1) + solve (n, m, grid, dp,
							     row1, col1 + 1,
							     row2);

    if (grid[row1 + 1][col1] != -1 && grid[row2][col2 + 1] != -1)
      ch3 =
	cost (grid, row1 + 1, col1, row2, col2 + 1) + solve (n, m, grid, dp,
							     row1 + 1, col1,
							     row2);

    if (grid[row1 + 1][col1] != -1 && grid[row2 + 1][col2] != -1)
      ch4 =
	cost (grid, row1 + 1, col1, row2 + 1, col2) + solve (n, m, grid, dp,
							     row1 + 1, col1,
							     row2 + 1);

    return dp[row1][col1][row2] =
      Math.max (ch1, Math.max (ch2, Math.max (ch3, ch4)));
  }

  public static void initializeDp (int dp[][][], int item)
  {
    for (int i = 0; i < 5; i++)
      {
	for (int j = 0; j < 5; j++)
	  for (int k = 0; k < 5; k++)
	    dp[i][j][k] = item;
      }
  }
  public static int collectMax (int n, int m, int grid[][])
  {
    int ans = 0;
    int dp[][][] = new int[6][6][6];
    initializeDp (dp, -1);
    if (grid[n - 1][m - 1] == -1 || grid[0][0] == -1)
      ans = -1 * Integer.MAX_VALUE;

    if (grid[0][0] == 1)
      ans++;
    grid[0][0] = 0;

    if (grid[n - 1][m - 1] == 1)
      ans++;
    grid[n - 1][m - 1] = 0;

    ans += solve (n, m, grid, dp, 0, 0, 0);
    return Math.max (ans, 0);

  }
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt ();
    int m = sc.nextInt ();
    int arr[][] = new int[n + 1][m + 1];
    for (int i = 0; i < n; i++)
      for (int j = 0; j < n; j++)
	arr[i][j] = sc.nextInt ();
    System.out.println (collectMax (n, m, arr));
  }
}
