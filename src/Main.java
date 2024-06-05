import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();

        String password;
        do {
            System.out.print("Введите пароль от 8 до 15 символов: ");
            password = scanner.nextLine();

            if (password.length() < 8 || password.length() > 15) {
                System.out.println("Пароль должен быть от 8 до 15 символов.");
            }
        } while (password.length() < 8 || password.length() > 15);

        System.out.println("Имя пользователя: " + name);
        System.out.println("Пароль: " + password);

        scanner.close();
    }
}