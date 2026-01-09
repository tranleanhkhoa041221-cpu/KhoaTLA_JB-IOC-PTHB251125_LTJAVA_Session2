import java.util.Scanner;

public class BaitapGioi2 {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Nhập cạnh 1: ");
                int a = Integer.parseInt(sc.nextLine());
                System.out.println("Nhập cạnh 2: ");
                int b = Integer.parseInt(sc.nextLine());
                System.out.println("Nhập cạnh 3: ");
                int c = Integer.parseInt(sc.nextLine());
                if (a + b > c && a + c > b && b + c > a) {
                    if (a == b && b == c) {
                        System.out.println("Đây là tam giác đều.");
                    }
                    else if (a == b || a == c || b == c) {
                        System.out.println("Đây là tam giác cân.");
                    }
                    else if ((a * a == (b * b) + (c * c)) || (b * b == (a * a) + (c * c)) || (c * c == (a * a) + (b * b))) {
                        System.out.println("Đây là tam giác vuông.");
                    }
                    else {
                        System.out.println("Đây là tam giác thường.");
                    }

                } else {
                    System.out.println("Ba cạnh không tạo thành tam giác.");
                }

                sc.close();
            }
        }

