    import java.util.Scanner;
    
    public class Main {
        public static void main(String[] args) {
    
            Scanner scanner = new Scanner(System.in);
    
            String str1 = scanner.nextLine().toLowerCase();
            String str2 = scanner.nextLine().toLowerCase();
            String alpha = scanner.nextLine();
    
            int len1 = str1.length();
            int len2 = str2.length();
            int len_alpha = alpha.length();
    
            int temp1 = 0;
            int temp2 = 0;
    
            String ans = "";
    
            int min = 0;
            if (len1 < len2) {
                min = len1;
                ans = str1;
            } else {
                min = len2;
                ans = str2;
            }
    
            int i = 0;
            while (i < min) {
                String char1 = String.valueOf(str1.charAt(i));
                String char2 = String.valueOf(str2.charAt(i));
                int j = 0;
                while (j < len_alpha) {
                    if (String.valueOf(alpha.charAt(j)).equals(char1)) {
                        temp1 = j;
                    }
                    if (String.valueOf(alpha.charAt(j)).equals(char2)) {
                        temp2 = j;
                    }
                    j++;
                }
                if (temp1 < temp2) {
                    ans = str1;
                    break;
                } else if (temp1 > temp2) {
                    ans = str2;
                    break;
                }
                i++;
            }
    
            String upper = String.valueOf(ans.charAt(0)).toUpperCase() + ans.substring(1);
            String reverse = new StringBuffer(upper).reverse().toString();
            System.out.println(upper + reverse);
        }
    }
