
import java.util.Scanner;

class day2_solution {
    public static void program1(int seconds) {
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int remainingSeconds = seconds % 60;
        System.out.printf("%02d:%02d:%02d", hours, minutes, remainingSeconds); 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter program number to execute:");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                int seconds = sc.nextInt();
                program1(seconds);
                break;
            default:
                System.out.println("Invalid choice!");
        }
        
    }
}