public class PrimeNumber {
    public static void main(String[] agrs) {
        // System.out.println("hello world");
        int i;
        int number = 35;
        if (number <= 0) {
            System.out.println("number not less than 0");
        } else if (number == 1) {
            System.out.println("prime not number");
        } else if (number == 2) {
            System.out.println("prime number");
        } else {
            for (i = 2; i <= (number) / 2; i++) {
                System.out.println(i);
                int rem = number % i;
                System.out.println("rem:" + i);
                if (rem == 0) {
                    // System.out.println("number is not prime");
                    break;
                }
                if (i == number) {
                    System.out.println("number is prime");
                    // return true;
                } else {
                    System.out.println("number is not prime");
                    // return false;
                }

            }

        }

    }

}