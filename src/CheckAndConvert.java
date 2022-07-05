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


}
