/*public class NumberTask {
    public static void main(String[] args) {

        // int CheckNumber=7;

        // boolean isPrime=true;

        int remainder = 0;
        int counter = 0;

        // String primeNumber ="";
        for (int j = 2; j <= 100; j++) {

            for (int i = 2; i <= j / 2; i++) {
                remainder = j % i;

                // System.out.println(CheckNumber+"get two number"+ remainder);

            }
            if (remainder == 0) {
                System.out.println(j + " is not a Prime number");
                // break;
            }

            else {
                System.out.println(j + "is a Prime number    " + counter);
                counter++;
            }

        }

    }
}*/

public class NumberTask {

    public static void main(String[] args) {
        int remainder;
        boolean isPrime = true;
        int numberToCheck; // Enter the numberToCheckber you want to check for prime
        int counter = 0;

        // Loop to check whether the numberToCheckber is divisible any numberToCheckber
        // other than 1 and iteself

        for (numberToCheck = 2; numberToCheck <= 20; numberToCheck++) {

            for (int i = 2; i <= numberToCheck / 2; i++) {
                // numberToCheckber is dived by itself
                remainder = numberToCheck % i;
                // System.out.println(numberToCheck + " Divided by " + i + " gives a remainder "
                // + remainder);

                // if remainder is 0 than numberToCheckber is not prime and break loop. Elese
                // continue loop
                if (remainder == 0) {
                    isPrime = false;
                    // break;
                }

            }
            // Check value true or false,if isprime is true then numberToCheckber is prime
            // otherwise not prime
            if (isPrime) {
                counter++;
                if (counter <= 10) {
                    System.out.println(numberToCheck + " is a Prime numberToCheckber" + counter);
                    // break;

                }

            }

            // else
            // System.out.println(numberToCheck + " is not a Prime numberToCheckber ");
        }

    }
}