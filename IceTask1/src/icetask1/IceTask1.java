package icetask1;

import java.util.Scanner;

public class IceTask1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num1, num2;

        System.out.println("Please enter the first number.");
        num1 = scan.nextInt();
        System.out.println("Please enter the second number.");
        num2 = scan.nextInt();

        if (num1 == num2) {
            System.out.println("Please enter a new number. \nThe two numbers cannont equal eachother.");
            num2 = scan.nextInt();

        }
        if (num1 < num2) {
            System.out.println("Numbers from " + num1 + " to " + num2);
            while (num1 <= num2) {

                System.out.println(num1);
                num1++;
            }
        } else if (num1 > num2) {
            System.out.println("Numbers from " + num1 + " to " + num2);
            while (num1 >= num2) {
                System.out.println(num1);
                num1--;
            }
        }
    }
}
