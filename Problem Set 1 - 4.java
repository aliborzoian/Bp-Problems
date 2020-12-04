import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        String[] line_arr = line.split("\\s");

        String n = line_arr[0];
        int a = Integer.parseInt(line_arr[1]);
        int b = Integer.parseInt(line_arr[2]);

        int i = 0;
        int Number = 0;
        while (i < n.length()) {
            Number += Integer.parseInt(String.valueOf(n.charAt(i))) * Math.pow(a, n.length() - i - 1);
            i++;
        }

        StringBuilder Answer = new StringBuilder();

        while (Number > 0) {
            int temp = Number % b;
            Number = Number / b;
            if (temp < 10) {
                Answer.append(String.valueOf(temp));
            } else if (temp == 10) {
                Answer.append("a");
            } else if (temp == 11) {
                Answer.append("b");
            } else if (temp == 12) {
                Answer.append("c");
            } else if (temp == 13) {
                Answer.append("d");
            } else if (temp == 14) {
                Answer.append("e");
            } else if (temp == 15) {
                Answer.append("f");
            }

        }
        StringBuilder Final = Answer.reverse();
        System.out.println(Final);

    }
}
