import java.util.Scanner;

public class AddMatrix
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements in rows and columns: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr1 = new int[n][m];
        int[][] arr2 = new int[n][m];
        int[][] arr3 = new int[n][m];
        int i,j;
        System.out.println("Enter elements of first matrix: ");
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter elements of second matrix: ");
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                arr2[i][j] = sc.nextInt();
            }
        }
        System.out.println("Addition matrix: ");
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                arr3[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(arr3[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}