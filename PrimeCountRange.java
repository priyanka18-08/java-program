import java.util.Scanner;
class  PrimeCountRange {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        int count = 0;

        for (int num= start; num<= end; num++) {
            int factors = 0;

            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    factors++;
                }
            }

            if (factors == 2) {
                count++;
            }
        }

        System.out.println("Number of primes = " + count);
    }
}