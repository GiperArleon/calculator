package art.kikill;

public class KikillTwo implements Calculator {

    @Override
    public double calc(double numberOne, double numberTwo, char operation) {
        // Используем switch для выбора действия
        switch (operation) {
            case '+':
                return numberOne + numberTwo;
            case '-':
                return numberOne - numberTwo;
            case '*':
                return numberOne * numberTwo;
            case '/':
                // Проверка на деление на ноль
                if (numberTwo == 0) {
                    System.out.println("Ошибка: Деление на ноль!");
                    return 0;
                }
                return numberOne / numberTwo;
            default:
                System.out.println("Неизвестная операция: " + operation);
                return 0;
        }
    }
}
