public class Checker {
    public static boolean isLeapYear(int year){
        boolean result = false;
        if (year % 4 == 0 && 100 != 0) {
            result = true;
        }
        else if (year % 400 == 0) {
            result = true;
        }
        else {
            result = false;
        }

        return result;
    }

    public static boolean isDivisibleBy4ButNot100(int year) {
        boolean result = false;
        if (year % 4 == 0 && 100 != 0) {
            result = true;
        }
        return result;
    }
    public static boolean divisibleBy400(int year) {
        boolean result = false;
        if (year % 400 == 0) {
            result = true;
        }
        return result;
    }
    public static boolean notDivisibleBy4(int year) {
        boolean result = false;
        if (year % 4 != 0) {
            result = true;
        }
        return result;
    }
    public static boolean divisibleBy100ButNot400(int year) {
        boolean result = false;
        if (year % 100 == 0 && year % 400 != 0) {
            result = true;
        }
        return result;
    }
}
// Et år er et skuddår
//Når det er delelig med 4, men ikke 100
//Når det er delelig med 400
//(For eksempel var år 2000 et skuddår)
//
//Et år er ikke et skuddår
//Når det ikke er delelig med 4
//Når det er delelig med 100, men ikke 400.
//(For eksempel var ikke 1700, 1800 og 1900 skuddår, ei heller blir 2100 et)
