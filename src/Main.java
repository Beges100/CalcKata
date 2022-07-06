import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(calc(input));
    }

    public static String calc(String input) {
        String[] line = input.split(" ");
        String returnedResult = "";
        if (line.length <= 3) {
            if (CheckAndConvert.checkArab(line[0]) && CheckAndConvert.checkArab(line[2])) {
                if (CheckAndConvert.checkCorrectFormat(Integer.parseInt(line[0]), Integer.parseInt(line[2]))) {
                    Calculation result = new Calculation(Integer.parseInt(line[0]),line[1],Integer.parseInt(line[2]));
                    returnedResult = String.valueOf(result.calc());
                } else {
                    System.out.println("Ввели неверное значение");
                }
            } else if (CheckAndConvert.checkRoma(line[0]) && CheckAndConvert.checkRoma(line[2])){
                if (CheckAndConvert.checkCorrectFormat(CheckAndConvert.convertRoma(line[0]), CheckAndConvert.convertRoma(line[2]))) {
                    Calculation roma = new Calculation(CheckAndConvert.convertRoma(line[0]),line[1],CheckAndConvert.convertRoma(line[2]));
                    returnedResult = CheckAndConvert.convertResult(roma.calc());
                } else {
                    System.out.println("Ввели неверное значение");
                }
            } else {
                System.out.println("Ввели неверное значение");
            }
        } else {
            returnedResult = "Введены некорректные данные";
        }
        return returnedResult;
    }

}
