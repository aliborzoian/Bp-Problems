// Problem: Write a code that takes n values and n-1 mathematic operations and apply them to the numbers in order from left to right.
// e.g. for input "1 2 3 4" and "+ / -", return "((1+2)/3)-4"

import javax.swing.*;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String n = scanner.nextInt();
        int[] Nums = new int[n];

        int i = 0;
        while (i < n){
            Nums[i] = scanner.nextInt(); // Saving numbers in an array
            i += 1;
        }

        String str = scanner.nextLine();
        String[] Chars = str.split("\\s"); // Saving mathematic operations in an array
        // I did it again. I used taking string input and spliting it. Python habits... You can do it by using scanner.next(); in a loop like this:
        
        /* String[] Chars = new String[n - 1];
        int j = 0;
        while (j < n - 1){
            Nums[j] = scanner.next();
            j += 1;
        } */
        

        int j = 0;
        double Total = list[0]; // The variable we'd like to make changes to it since in every step we perform the operation to the previous number. 

        while (j<n-1){
            if (Chars[j].equals("+")){
                Total += list[j + 1];
            }
            else if (Chars[j].equals("-")){
                Total -= list[j + 1];
            }
            else if (Chars[j].equals("*")){
                Total *= list[j + 1];
            }
            else if (Chars[j].equals("/")){
                Total = Total / (double) list[j + 1];
            }
            j += 1;
        }

        String Total_str = String.format("%.6f", Total); // Setting the decimal to ".6f"
        System.out.println(Total_str);
        }
    }
