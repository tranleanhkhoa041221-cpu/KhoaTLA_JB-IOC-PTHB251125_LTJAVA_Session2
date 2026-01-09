import java.util.Scanner;

public class BaiTapKha1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = Integer.parseInt(sc.nextLine());
        int sum = 0;
        if (n < 0 || n == 0) {
            System.out.println("Số nhập vào không hợp lệ");
        } else {
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            System.out.printf("Tổng Các Số Từ 1 đến %d là: %d", n, sum);
            sc.close();
        }
    }
}

