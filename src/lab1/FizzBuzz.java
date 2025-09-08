package lab1;

/**
 * Solve the lab1.FizzBuzz challenge.
 */
public class FizzBuzz {

    public static void main(String[] args) {
        extracted();
    }

    private static void extracted() {
        for (int i = 1; i < 100; i++) {
            System.out.println(getFizzBuzz(i));
        }
    }

    private static String getFizzBuzz(int number) {
        if (number % 15 == 0) {
            return "Fizz Buzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(number);
        }
    }
}
