import java.util.Scanner;
public class syntax {
    public static Scanner scanner = new Scanner(System.in);

    public static void chuVi() {
        System.out.print("Nhap chieu dai: ");
        int chieuDai = Integer.parseInt(scanner.nextLine());
        System.out.println(chieuDai);
        System.out.print("Nhap chieu rong: ");
        int chieuRong = Integer.parseInt(scanner.nextLine());
        System.out.println(chieuRong);
        System.out.println("Chu vi cua hinh chu nhat la: " + (chieuDai+chieuRong)*2);
    }
    public static void namNhuan() {
        System.out.print("Nhap nam: ");
        int year = Integer.parseInt(scanner.nextLine());
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)){
            System.out.println("Nam nay la nam nhuan");
        }
        else{
            System.out.println("Nam nay khong la nam nhuan");
        }
    }
    public static void main(String[] args){
        chuVi();
        namNhuan();
    }
}
