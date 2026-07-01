import java.util.Scanner;

public class Demo_Input {
     static void main() {
         Scanner sc = new Scanner(System.in);

         System.out.println("What is your name");
         String name = sc.nextLine();
         System.out.println("My name is : " + name);

         System.out.println("What is your rollno");
         int rollno = sc.nextInt();
         System.out.println("My rollno is : " +rollno);

     }
}
