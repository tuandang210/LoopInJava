import java.util.Scanner;

public class MenuVeHinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("1: Hình tam giác");
        System.out.println("2: Hình vuông");
        System.out.println("3: Hình chữ nhật");
        System.out.println("0: Thoát");
        System.out.print("Nhập lựa chọn: ");

        int choice = sc.nextInt();

        switch (choice){
            case 0:
                System.exit(0);
            case 1:
                System.out.println("*");
                System.out.println("**");
                System.out.println("***");
                System.out.println("****");
                System.out.println("*****");
                System.out.println("******");
                break;
            case 2:
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                break;
            case 3:
                System.out.println("* * * * * * * * * *");
                System.out.println("* * * * * * * * * *");
                System.out.println("* * * * * * * * * *");
                System.out.println("* * * * * * * * * *");
                System.out.println("* * * * * * * * * *");
                break;
            default:
                System.out.println("Lựa chọn không đúng");
        }

    }
}
