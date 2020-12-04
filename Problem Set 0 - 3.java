// Problem: Write a code that takes two time values like "h1 m1 s1" and "h2 m2 s2" and prints the sum of these two time lengths.

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int h1 = scanner.nextInt();
        int m1 = scanner.nextInt();
        int s1 = scanner.nextInt();

        int h2 = scanner.nextInt();
        int m2 = scanner.nextInt();
        int s2 = scanner.nextInt();

        int h = h1 + h2;
        int m = m1 + m2;
        int s = s1 + s2;

        int t = h * 3600 + m * 60 + s; // We convert the whole time to seconds in order to find the hour, minute and second values.
        // The reason we don't just add h, m and s values is the fact that we only have 60 seconds in a minute and 60 minutes in an hour.
        // Therefore, if we put S = s1 + s2, for large values for s1, s2 we'll end up with a number greater than 60. e.g. 47 + 33 = 80 > 60.

        int H = t / 3600; // Total number of hours 
        t = t % 3600; // Replacing t with what's left of time, now that we've determined the total number of hours.
        int M = t / 60; // Total number of minutes left
        int S = t % 60; // Total number of seconds left

        System.out.println(H + " " + M + " " + S);
    }
}
