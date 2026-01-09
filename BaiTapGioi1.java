import java.util.Scanner;

public class BaiTapGioi1 {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Nhập số nguyên n: ");
                int n = Integer.parseInt(sc.nextLine());
                n = Math.abs(n);
                int tong = 0;
                 while (n > 0) {
                     tong += n % 10;
                     n /= 10;
                }

                System.out.println("Tổng các chữ số là: " + tong);
            }
        }


