import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        System.out.println("Введите что-нибудь:");
        Scanner scanner = new Scanner(System.in);
        //String inputString = scanner.next();
        //String inputString = scanner.nextLine();
        //int inputInt = scanner.nextInt();
        double inputDouble = scanner.nextDouble();
        System.out.println("Введено: " + inputDouble);
    }
}
