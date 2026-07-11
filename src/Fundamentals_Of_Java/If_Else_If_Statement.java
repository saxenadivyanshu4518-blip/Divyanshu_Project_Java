package Fundamentals_Of_Java;

import java.util.Scanner;

public class If_Else_If_Statement {
    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter the Age ");
        int age = sc.nextInt();

        if (age <= 12){
            System.out.println(" Child ");
        } else if (age > 12 && age < 18){
            System.out.println(" Teenager ");
        } else {
            System.out.println(" Adult ");
        }

    }
}