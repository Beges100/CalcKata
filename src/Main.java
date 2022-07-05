import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split(" ");
        if (CheckAndConvert.checkArab(line[0]) && CheckAndConvert.checkArab(line[2])) {
            if (CheckAndConvert.checkCorrectFormat(Integer.parseInt(line[0]), Integer.parseInt(line[2]))) {
                Calculation result = new Calculation(Integer.parseInt(line[0]),line[1],Integer.parseInt(line[2]));
                System.out.println(result.calc());
            } else {
                System.out.println("Ввели неверное значение");
            }
        } else if (CheckAndConvert.checkRoma(line[0]) && CheckAndConvert.checkRoma(line[2])){
             if (CheckAndConvert.checkCorrectFormat(CheckAndConvert.convertRoma(line[0]), CheckAndConvert.convertRoma(line[2]))) {
                Calculation roma = new Calculation(CheckAndConvert.convertRoma(line[0]),line[1],CheckAndConvert.convertRoma(line[2]));
                convertResult(roma.calc());
            } else {
                System.out.println("Ввели неверное значение");
            }
        } else {
            System.out.println("Ввели неверное значение");
        }
    }

    static void convertResult(int result) {
        String[] romanian = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"
        };
        System.out.println(romanian[result]);
    }
}
