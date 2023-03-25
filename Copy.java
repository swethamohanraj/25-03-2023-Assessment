import java.util.Scanner;

public class Copy
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements in the array: ");
        int x = sc.nextInt();
        String[] name = new String[x];
        int i;
        System.out.println("Enter the array elements: ");
        for(i=0;i<x;i++)
        {
            name[i] = sc.next();
        }
        String[] copied = new String[x];
        for(i=0;i<x;i++)
        {
            copied[i] = name[i];
        }
        System.out.println("Copied array: ");
        for(i=0;i<x;i++)
        {
            System.out.print(copied[i]+" ");
        }
    }
}
