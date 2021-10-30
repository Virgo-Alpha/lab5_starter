
/**
 * Class containing some example methods for the exercises in Lab 5.
 *
 * @author JP
 * @version 1.0
 */
public class Matrices
{
    public static void main (String [] args)
    {

        int [][] A = {{1, 3, 4}, {2, 4, 3}, {3, 4, 5}};
        int [][] B = {{1, 3, 4}, {2, 4, 3}, {1, 2, 4}};

        int c [][] = new int [3][3];

        for(i = 0; i < 3; i++)
        {
            for (j = 0; j < 3; j++)
            {
                c [i][j] = A [i][j] + B [i][j];
            }
        }

        System.out.print(c[i][j] + " ");
    }

/*
1 3 4
2 4 3
3 4 5
*/
}