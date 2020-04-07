public class DivideByFive {
    public static void main(String[] args) {
        DivideByFive number = new DivideByFive();
        int i = 25525;
        if (number.byFive(i)) {
            System.out.println("number is divisible by 5" + "  " + i);
        } else {
            System.out.println("Number is not divisible by 5" + " " + i);
        }
    }

    boolean byFive(int number) {
        int rem = number % 5;

        if (rem == 0) {
            return true;
        } else {
            return false;
        }
    }
}