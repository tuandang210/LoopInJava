
public class thePrime {
    public static void main(String[] args) {

        int number=2;

        while(number<100){
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.print(number + " ");
            } number++;
        }
    }
}
