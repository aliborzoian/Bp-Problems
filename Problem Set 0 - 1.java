// Problem: Write a problem that takes an string input from the user and replies it with "Hello + string".

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine(); // We take the input.
        System.out.println("Hello " + str); // We add a space after "Hello" since we want an output like "Hello Sina" instead of "HelloSina" for the input "Sina".
    }
}
