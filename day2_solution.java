
import java.util.Scanner;

class day2_solution {
    public static void program1(int seconds) {
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int remainingSeconds = seconds % 60;
        System.out.printf("%02d:%02d:%02d", hours, minutes, remainingSeconds);
    }

    public static void program2() {
        int count = 0;
        int num = 2;
        int sum = 0;

        while (count < 100) {
            if (isPrime(num)) {
                sum += num;
                count++;
            }
            num++;
        }

        System.out.println("Sum of the first 100 prime numbers: " + sum);
    }

    public static boolean isPrime(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter program number to execute:");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                System.out.println("PROGRAM 1");
                int seconds = sc.nextInt();
                program1(seconds);
                break;
            case 2:
                System.out.println("PROGRAM 2");
                program2();
                break;  
            default:
                System.out.println("Invalid choice!");
        }
        sc.close();
        }
}