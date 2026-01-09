import java.util.Scanner;

public class BaiTapXuatSac1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập số vào: ");
            int number = Integer.parseInt(scanner.nextLine());
            if (number < 100 || number > 999) {
                System.out.println("Số nhập vào không hợp lệ");
            } else {
                int hundreds = number / 100;
                int tens = (number / 10) % 10;
                int units = number % 10;
                switch (hundreds) {
                    case 1: {
                        System.out.print("Một trăm ");
                        break;
                    }
                    case 2: {
                        System.out.print("Hai trăm ");
                        break;
                    }
                    case 3: {
                        System.out.print("Ba trăm ");
                        break;
                    }
                    case 4: {
                        System.out.print("Bốn trăm ");
                        break;
                    }
                    case 5: {
                        System.out.print("Năm trăm ");
                        break;
                    }
                    case 6: {
                        System.out.print("Sáu trăm ");
                        break;
                    }
                    case 7: {
                        System.out.print("Bảy trăm ");
                        break;
                    }
                    case 8: {
                        System.out.print("Tám trăm ");
                        break;
                    }
                    case 9: {
                        System.out.print("Chín trăm ");
                        break;
                    }
                }
                switch (tens) {
                    case 0: {
                        if (units != 0) System.out.print("lẻ ");
                        break;
                    }
                    case 1: {
                        System.out.print("mười ");
                     break;
                     }
                    case 2: {
                        System.out.print("hai mươi ");
                        break;
                    }
                    case 3: {
                        System.out.print("ba mươi ");
                        break;
                    }
                    case 4: {
                        System.out.print("bốn mươi ");
                        break;
                    }
                    case 5: {
                        System.out.print("năm mươi ");
                        break;
                    }
                    case 6: {
                        System.out.print("sáu mươi ");
                        break;
                    }
                    case 7: {
                        System.out.print("bảy mươi ");
                        break;
                    }
                    case 8: {
                        System.out.print("tám mươi ");
                        break;
                    }
                    case 9: {
                        System.out.print("chín mươi ");
                        break;
                    }
                }
                switch (units) {
                    case 1: {
                        System.out.print((tens >= 2) ? "mốt" : "một");
                        break;
                    }
                    case 2: {
                        System.out.print("hai");
                        break;
                    }
                    case 3: {
                        System.out.print("ba");
                        break;
                    }
                    case 4: {
                        System.out.print("bốn");
                        break;
                    }
                    case 5: {
                        System.out.print((tens >= 1) ? "lăm" : "năm");
                        break;
                    }
                    case 6: {
                        System.out.print("sáu");
                        break;
                    }
                    case 7: {
                        System.out.print("bảy");
                        break;
                    }
                    case 8: {
                        System.out.print("tám");
                        break;
                    }
                    case 9: {
                        System.out.print("chín");
                        break;
                    }
                }

            }
        }
    }

