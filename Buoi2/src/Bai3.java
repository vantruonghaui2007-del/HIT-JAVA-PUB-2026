import java.util.Scanner;
public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập mật khẩu: ");
        String password = scanner.nextLine().trim();

        boolean hasDigit = false;
        boolean hasUpperCase = false;
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (c >= '0' && c <= '9') {
                hasDigit = true;
            }
            if (c >= 'A' && c <= 'Z') {
                hasUpperCase = true;
            }
        }
        if (password.length() >= 8 && hasDigit && hasUpperCase) {
            System.out.println("Mật khẩu hợp lệ!");
        } else {
            System.out.println("Mật khẩu không hợp lệ!");
            if (password.length() < 8) {
                System.out.println("- Mật khẩu phải có độ dài tối thiểu là 8 ký tự (Độ dài hiện tại sau khi cắt khoảng trắng: " + password.length() + ").");
            }
            if (!hasDigit) {
                System.out.println("- Mật khẩu phải chứa ít nhất 1 chữ số.");
            }
            if (!hasUpperCase) {
                System.out.println("- Mật khẩu phải chứa ít nhất 1 chữ cái viết hoa.");
            }
        }

        scanner.close();
    }
}
