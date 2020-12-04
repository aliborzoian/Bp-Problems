// Problem: Write a code that returns the value b^p for inputs b and p.

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long b = scanner.nextLong();
        long p = scanner.nextLong();

        long Total = 1;

        // So basically we need to multiply b, p times to itself. For that, We declare a variable Total and multiply b, p times to it.

        while (p > 0){
            Total = Total * b;
            p = p - 1;
        }

        System.out.println(Total);
    }
}
