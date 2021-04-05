import java.util.Scanner;

public class LaiNganHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số tiền gửi: ");
        double money = sc.nextDouble();

        System.out.print("Nhập số tháng gửi: ");
        int month = sc.nextInt();

        System.out.print("Nhập lãi suất: ");
        double rate = sc.nextDouble();

        double totalLai = 0;

        for (int i = 0; i<month; i++){
            totalLai += money * (rate/100)/12 * month;
        }
        System.out.println("Tổng số tiền lãi là: " + totalLai);
    }
}
