import java.util.InputMismatchException;

public class Calculation {
    int num1;
    String operations;
    int num2;

    public Calculation(int num1, String operations, int num2) {
        this.num1 = num1;
        this.operations = operations;
        this.num2 = num2;
    }

    int calc() {
        int result = 0;
        switch (operations) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                try {
                    result = num1 / num2;
                } catch (ArithmeticException | InputMismatchException e) {
                    System.out.println("Ошибка : " + e);
                    System.out.println("На ноль делить нельзя");
                    break;
                }
                break;
            default:
                throw new IllegalStateException("Неверный знак операции: " + operations);
        }
        return result;
    }
}
