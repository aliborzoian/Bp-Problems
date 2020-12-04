// Problem: Write a code that prints the output (a+b)*c-d for inputs a, b, c and d.

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextInt(); // We use long instead of int since 0 < a, b, c, d < 1000000.
        long b = scanner.nextInt();
        long c = scanner.nextInt();
        long d = scanner.nextInt();
        long x = (a + b) * c - d;
        System.out.println(x);
    }
}

/* P.S. My Actual solution at the first was a mess since I've used Python before and didn't know there was a nextInt syntax.
I usually take the whole series of numbers in a lines like "1 2 12 123" as a string and then use split to extract the actual numbers in Python (I don't know if there's a better way). 
So I used it the first time in Java as well. It's really embaressing, but I'll put is here as well:*/

/*import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine(); // We take the numbers in the line and put them in a string like "a b c d".
        String[] spl = str.split("\\s"); // We split that string with respect to spaces.
        long a = Integer.parseInt(spl[0]); // The first item on the array is a, the second item is b, and so on...
        long b = Integer.parseInt(spl[1]);
        long c = Integer.parseInt(spl[2]);
        long d = Integer.parseInt(spl[3]);
        long x = (a + b) * c - d;
        System.out.println(x);
    }
}*/

