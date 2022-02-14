package SumArray;
import java.util.Scanner;
// 14 February, 2022
//hrshammo 
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of Array :");
        int x = scanner.nextInt();
        int[] array = new int[x];
        int sum = 0;
        System.out.println("Enter "+x+" Array : ");
        for (int i=0; i<x; i++)
        {
            array[i] = scanner.nextInt();
        }
        for( int num : array) {
            sum = sum+num;
        }
        System.out.println("Sum of Array elements is: "+sum);
    }
}
