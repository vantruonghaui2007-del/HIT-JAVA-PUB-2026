import java.util.Scanner;

public class Bai4 {

    public static double findMax(double[] arr) {
        double max = arr[0];
        for (double score : arr) {
            if (score > max) {
                max = score;
            }
        }
        return max;
    }

    public static double calculateAverage(double[] arr) {
        double sum = 0;
        for (double score : arr) {
            sum += score;
        }
        return sum / arr.length;
    }

    public static int countFailedStudents(double[] arr) {
        int count = 0;
        for (double score : arr) {
            if (score < 5.0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng học sinh: ");
        int n = scanner.nextInt();

        if (n > 0) {
            double[] scores = new double[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Nhập điểm học sinh thứ " + (i + 1) + ": ");
                scores[i] = scanner.nextDouble();
            }

            System.out.printf("Điểm cao nhất: %.1f\n", findMax(scores));
            System.out.printf("Điểm trung bình lớp: %.2f\n", calculateAverage(scores));
            System.out.println("Số học sinh có điểm dưới trung bình (< 5.0): " + countFailedStudents(scores));
        }

        scanner.close();
    }
}