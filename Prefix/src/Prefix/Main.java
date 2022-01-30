package Prefix;
import java.util.Scanner;
//29 January, 2022
//All Copyright © goes to Hamim Reza Shammo (https://github.com/hrshammo/)
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = input.nextLine();
        String reverse = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            reverse = reverse + string.charAt(i);
        }
        System.out.println("The reversed string is " + reverse);
        String evenPositions = "";
        for (int i = 1; i < string.length(); i = i + 2) {
            evenPositions = evenPositions + string.charAt(i);
        }
        System.out.println(evenPositions);
        System.out.print("Enter the first string: ");
        String string1 = input.nextLine();
        System.out.print("Enter the second string: ");
        String string2 = input.nextLine();
        int index = 0;
        String prefix = "";
        while (string1.charAt(index) == string2.charAt(index)) {
            prefix = prefix + string1.charAt(index);
            index++;
        }
        if (prefix.length() > 0) {
            System.out.println("The commmon prefix is " + prefix);
        } else {
            System.out.println(string1 + " and " + string2
                    + " have no commmon prefix");
        }
    }
}
