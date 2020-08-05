/*

Print any given inputString in following format.

Output

index:  0    1   2   3   4
chars:  H    e   l   l   o

Every character is separated by tab, use "\t" for inserting tab.
*/

import java.sql.SQLOutput;
import java.util.Scanner;

public class AssignmentTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputstring = scan.nextLine();
        System.out.print("index:\t");
        for (int i = 0; i < inputstring.length(); i++) {
            System.out.print(i);
            if (i < inputstring.length() - 1) {
                System.out.print("\t");
            }
        }
        System.out.println();
        System.out.print("chars:\t");
        for (int j = 0; j < inputstring.length(); j++) {
            System.out.print(inputstring.charAt(j));
            if (j < inputstring.length() - 1) {
                System.out.print("\t");
            }
            scan.close();
        }
    }
}
