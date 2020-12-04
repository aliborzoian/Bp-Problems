import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int Sigma_A2 = 0;
        int Sigma_A = 0;

        for (int i = 1; i <= n; i++) {
            int temp = scanner.nextInt();
            Sigma_A += temp;
            Sigma_A2 += Math.pow(temp, 2);
        }

        double R = (Math.pow(Sigma_A, 2) - Sigma_A2) / 2;
        int counter = 0;

        for (int i = 2; i <= R; i++) {

            int sum = 0;
            for (int j = 0; j < String.valueOf(i).length(); j++) {
                sum += Math.pow(Integer.parseInt(String.valueOf(String.valueOf(i).charAt(j))), 2);
            }
            
            boolean f1 = false;
            if (sum != 1) {
                for (int k = 2; k <= sum / 2; ++k) {
                    if (sum % k == 0) {
                        f1 = true;
                        break;
                    }
                }
            } else if (sum == 1) {
                f1 = false;
            }
            
            boolean f2 = false;
            if (i != 1) {
                for (int k = 2; k <= i / 2; ++k) {
                    if (i % k == 0) {
                        f2 = true;
                        break;
                    }
                }
            } else if (sum == 1) {
                f2 = false;
            }
            
            if ((f1 && !f2) || (!f1 && f2)) {
                counter++;
            }
        }
        
        System.out.println(counter);
    }
}
