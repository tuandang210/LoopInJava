import java.util.Scanner;

public class UocChungLonNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập sô thứ nhất: ");
        int a = sc.nextInt();

        System.out.print("Nhập số thứ hai: ");
        int b = sc.nextInt();

        a=Math.abs(a);
        b=Math.abs(b);

        if ((a==0) || (b==0)){
            System.out.println("Không có ước chung lớn nhất");
        }

        while (a!=b){
            if (a>b){
                a-=b;
            } else {
                b-=a;
            }
        }
        System.out.println("Ước chung lớn nhất của hai số là: " + a);
    }
}
