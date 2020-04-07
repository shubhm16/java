public class Number {
    public static void main(String[] args) {
        Number number = new Number();

        for (int i = 10; i <= 20; i++) {
            if (number.isOdd(i)) {
                System.out.println("number is odd" + i);
            }
            if (number.isEven(i)) {
                System.out.println("number is even" + i);
            }

        }

    }

    boolean isEven(int number) {
        int rem = number % 2;

        if (rem == 0) {
            return true;

        } else {
            return false;
        }
    }

    boolean isOdd(int number2) {
        int rem = number2 % 2;

        if (rem != 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean byFive(int i) {
        return false;
    }

    public boolean byFive(int i) {
        return false;
    }

    public boolean byFive(int i) {
        return false;
    }
}
