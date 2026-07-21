import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập thông tin nhân viên: ");
        String input = scanner.nextLine().trim();
        String[] parts = input.split("-");

        if (parts.length == 4) {
            String id = parts[0].trim();
            String rawName = parts[1].trim();
            String yearStr = parts[2].trim();
            String department = parts[3].trim();

            String[] words = rawName.split("\\s+"); // Cắt theo 1 hoặc nhiều khoảng trắng
            StringBuilder standardizedName = new StringBuilder();

            for (String word : words) {
                if (word.length() > 0) {
                    String firstLetter = word.substring(0, 1).toUpperCase();
                    String restLetters = word.substring(1).toLowerCase();
                    standardizedName.append(firstLetter).append(restLetters).append(" ");
                }
            }
            String fullName = standardizedName.toString().trim();
            String deptLower = department.toLowerCase();
            if (deptLower.contains("kỹ thuật") || deptLower.contains("ky thuat")) {
                System.out.println("Phân loại: Nhân viên kỹ thuật");
            } else {
                System.out.println("Phân loại: Nhân viên nghiệp vụ");
            }
            int birthYear = Integer.parseInt(yearStr);
            int age = 2026 - birthYear;
            System.out.printf("Mã nhân viên: %s | Họ và tên: %s | Tuổi: %d | Bộ phận: %s\n",
                    id, fullName, age, department);
        }

        scanner.close();
    }
}