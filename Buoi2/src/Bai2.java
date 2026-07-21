
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập cạnh a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập cạnh b: ");
        int b = scanner.nextInt();
        System.out.print("Nhập cạnh c: ");
        int c = scanner.nextInt();
        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                System.out.println("Đây là tam giác đều.");
            } else if (a == b || b == c || a == c) {
                System.out.println("Đây là tam giác cân.");
            } else {
                System.out.println("Đây là tam giác thường.");
            }
            int perimeter = a + b + c;
            double p = perimeter / 2.0; // Ép kiểu ngầm định qua 2.0
            double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));

            System.out.println("Chu vi: " + perimeter);
            System.out.printf("Diện tích: %.2f\n", area);
        } else {
            System.out.println("Ba cạnh đã nhập không tạo thành một tam giác hợp lệ.");
        }

        scanner.close();
    }
}
