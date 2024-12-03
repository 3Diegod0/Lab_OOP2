import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите проверяемую строку:");
        String input = scanner.nextLine();
        String hexColorPattern = "^#[0-9A-Fa-f]{6}$";
        boolean isValidHexColor = Pattern.matches(hexColorPattern, input);
        if (isValidHexColor) {
            System.out.println("Введенная строка - идентификатор цвета");
        } else {
            System.out.println("Строка не является идентификатором цвета");
        }
        scanner.close();
    }
}