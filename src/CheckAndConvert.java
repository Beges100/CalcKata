public class CheckAndConvert {
    private static final String[] roman = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

    static boolean checkArab(String arabNum) {
        try {
            Integer.parseInt(arabNum);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }

    static boolean checkRoma(String romaNumber) {
        boolean flag = false;
        for (String a:
                roman) {
            if (romaNumber.equals(a)) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    static int convertRoma(String a) {
        int b = 0;
        for (int i = 0; i < roman.length; i++) {
            if (a.equals(roman[i]))
                b = i;
        }
        return b;
    }

    static boolean checkCorrectFormat(int x, int y) {
        return (x > 0 && x <= 10) && (y > 0 && y <= 10);
    }

    static String convertResult(int result) {
        String[] romanian = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"
        };
        if (result > 0)
            return romanian[result];
        else
            return"Данные введены неверно";
    }
}
