package art;

import art.kikill.Calculator;
import art.kikill.KikillTwo;
import java.util.Scanner;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Main {
    private static final Log LOGGER = LogFactory.getLog(Main.class);
    public static final String VERSION = "1.0004";
    public static final String DATE = "10.10.2026";
    static Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {
        LOGGER.info("* " + VERSION + " *");
        LOGGER.info(String.format("Algo initialized, version %s, date %s", VERSION, DATE));
        Calculator calculator = new KikillTwo();

        double num1 = getDoubleInput();

        char operation;
        while (true) {
            System.out.print("Введите операцию (+, -, *, /): ");
            String input = scan.next();
            if (input.charAt(0) == '+'
             || input.charAt(0) == '-'
             || input.charAt(0) == '*'
             || input.charAt(0) == '/') {
                operation = input.charAt(0);
                break;
            } else {
                System.out.println("Напиши знак, дурак! Я всё работаю как надо!");
            }
        }

        double num2 = getDoubleInput();

        double result = calculator.calc(num1, num2, operation);
        System.out.println("Результат: " + num1 + " " + operation + " " + num2 + " = " + result);

        LOGGER.info("Press Enter key to exit . . .");
        scan.nextLine();
        scan.nextLine();
        scan.close();
    }

    private static double getDoubleInput() {
        double number;
        while (true) {
            System.out.print("ведите число");
            if (scan.hasNextDouble()) {
                number = scan.nextDouble();
                break;
            } else {
                System.out.println("Напиши цифру, дурак! Я всё работаю как надо!");
                scan.next();
            }
        }
        return number;
    }
}