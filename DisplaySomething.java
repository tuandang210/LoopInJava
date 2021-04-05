    import java.util.Scanner;

    public class DisplaySomething {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Menu:");
            System.out.println("1: Hình tam giác");
            System.out.println("2: Hình tam giác cân");
            System.out.println("3: Hình chữ nhật");
            System.out.println("0: Thoát");
            System.out.print("Nhập lựa chọn: ");

            int choice = sc.nextInt();

            switch (choice){
                case 0:
                    System.exit(0);
                case 1:
                    for(int i=0; i<6;i++){
                        for (int j=0; j<i;j++){
                            System.out.print("*");
                        }
                        System.out.println("");
                    }

                    System.out.println("");

                    for(int i=5; i>0; i--){
                        for(int j=0;j<i;j++){
                            System.out.print("*");
                        }
                        System.out.println("");
                    }

                    System.out.println("");

                    for(int i=0; i<5;i++){
                        for (int j=0;j<i;j++){
                            System.out.print(" ");
                        }
                        for (int a=5;a>i;a--){
                            System.out.print("*");
                        }
                        System.out.println("");
                    }

                    System.out.println("");

                    for(int i=6; i>0;i--){
                        for (int j=0;j<i;j++){
                            System.out.print(" ");
                        }
                        for (int a=6;a>i;a--){
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    for(int i=0; i<6;i++){
                        for (int j=0;j<i;j++){
                            System.out.print(" ");
                        }
                        for (int a=6;a>i;a--){
                            System.out.print("*");
                        }
                        for (int a=5;a>i;a--){
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 3:
                    for(int i=0; i<5; i++){
                        for  (int j =0;j<20;j++){
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                default:
                    System.out.println("Lựa chọn không đúng");
            }
        }
    }

