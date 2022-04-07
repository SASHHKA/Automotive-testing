package Task2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int first = scanner.nextInt();
        System.out.println("Enter second number");
        int second = scanner.nextInt();
        System.out.println("Choose operation(+ - * /)");


        System.out.println(first + "+" + second + " = " + augment(first, second) );
        System.out.println(first + "-" + second + " = " + subtraction(first, second) );
        System.out.println(first + "*" + second + " = " + multiplication(first, second) );
        System.out.println(first + "/" + second + " = " + dividing(first, second) );

    }
    private static int augment (int first, int second) {
        return first + second;
    }
    private static int subtraction (int first, int second) {
        return first - second;
    }
    private static  int multiplication (int first, int second) {
        return first * second;
    }
    private static  int dividing (int first , int second) {
        return first / second;
    }
}
