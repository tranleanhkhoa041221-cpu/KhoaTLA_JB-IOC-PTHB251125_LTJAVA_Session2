import java.util.Scanner;

public class BaitapXuatsac2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập n: ");
            int n = Integer.parseInt(sc.nextLine());
            for (int i = 0; i <= n; i++) {
                int temp = i;
                int count = 0;
                int sum = 0;
                while (temp > 0) {
                    count++;
                    temp = temp / 10;
                }
                temp = i;
                while (temp > 0) {
                    int digit = temp % 10;
                    sum += Math.pow(digit, count);
                    temp /= 10;
                    }
                if (sum == i) {
                    System.out.print(i + " ");
                }
            }
        }
    }


