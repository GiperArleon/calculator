package art;

import java.util.Scanner;

import art.kikill.Calculator;
import art.kikill.KikillTwo;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Main {
    private static final Log LOGGER = LogFactory.getLog(Main.class);
    public static final String VERSION = "1.0004";
    public static final String DATE = "10.10.2026";

    public static void main(String[] args) {
        LOGGER.info("* * *");
        LOGGER.info(String.format("Algo initialized, version %s, date %s", VERSION, DATE));

        Scanner scan = new Scanner(System.in);

        // 1. Создаем объект нашего калькулятора
        Calculator calculator = new KikillTwo();

        // 2. Запрашиваем первое число
        System.out.print("Введите первое число: ");
        double num1 = scan.nextDouble();

        // 3. Запрашиваем операцию
        System.out.print("Введите операцию (+, -, *, /): ");
        char operation = scan.next().charAt(0);

        // 4. Запрашиваем второе число
        System.out.print("Введите второе число: ");
        double num2 = scan.nextDouble();

        // 5. Вызываем метод calc и получаем результат
        double result = calculator.calc(num1, num2, operation);

        // 6. Выводим результат
        System.out.println("Результат: " + num1 + " " + operation + " " + num2 + " = " + result);

        LOGGER.info("Press Enter key to exit . . .");
        scan.nextLine(); // съедаем остаток строки после nextDouble
        scan.nextLine(); // ожидание Enter
        scan.close();
    }
}
