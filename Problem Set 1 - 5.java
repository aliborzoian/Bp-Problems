import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();

        int right = 0;
        int left = 0;
        boolean mood = true;

        for (int j = 0; j < string.length(); j++) {
            if (string.charAt(j) == '"') {
                mood = !mood;
            } else if (String.valueOf(string.charAt(j)).equals(")")) {
                if (mood) {
                    right++;
                    if (left > 0) {
                        left--;
                        right--;
                    }
                }
            } else if (String.valueOf(string.charAt(j)).equals("(")) {
                if (mood) {
                    left++;
                }
            }
        }

        System.out.println(right + " " + left);
    }
}
