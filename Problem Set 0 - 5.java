// Problem: Write a code that calculates n! for input 0 <= n.

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();

        long Total = 1;
        
        // We need to multiply all numbers from 1 to n. So we declare a variable Total, and multiply each number to it.

        if (n == 0){
            System.out.println(1); // Since 0! = 1
        }
        else {
            while (n > 0) {
                Total = Total * n; // Multipling n to Total until n hits 1.
                n = n - 1;
            }

            System.out.println(Total);
        }
    }
}
