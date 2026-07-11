package Fundamentals_Of_Java;

import java.util.Scanner;

public class If_Statement {
    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter the number :- ");
        int num = sc.nextInt();

        if (num % 2 == 0){
            System.out.println(" Number is Even ");
        } if (num %2 != 0) {
            System.out.println("  Number is Odd ");
        }
    }
}
