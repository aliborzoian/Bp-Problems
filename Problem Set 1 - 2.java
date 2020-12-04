// Problem: Josephus problem for n, k.

// Solution 1.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int sum = 0;
        for (int i = 2; i <= n; i++) {
            sum = (sum + k) % i;
        }

        System.out.println(sum + 1);
    }
}

// Solution 2.
/* import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] People = new int[n];

        for (int i = 0; i < n; i++) {
            People[i] = 1;
        }

        int counter = 0;
        int killed = 0;
        int i = 0;
        int last_person = 0;

        boolean bool = true;

        while (bool) {

            if (Adam[i] == 1) {
                counter++;
            }

            if (counter == m) {
                Adam[i] = 0;
                killed++;
                last_person = i + 1;
                counter = 0;
            }

            if (killed == n) {
                bool = false;
            }
            i++;
            i = i % n;
        }

        System.out.println(last_person);

    }
}*/
