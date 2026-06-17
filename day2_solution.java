
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
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
    public static void program3(String str1, String str2) {
        String result = str1.substring(1) + str2.substring(1);
        System.out.println("Concatenated String: " + result);
    }
    public static void program4(String str) {
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        for(int i=0;i<str.length();i++){
            if (charCount.get(str.charAt(i)) == 1) {
                System.out.println(i);
                break;
            }
        }
    }

    public static int program6(int[] arr, int val) {
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != val) {
                arr[index] = arr[i];
                index++;
            }
        }
        return index;
    }
    public static boolean program7(String str1, String str2) {
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // If lengths differ → not anagram
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert to char arrays
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        // Sort arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare arrays
        return Arrays.equals(arr1, arr2);
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
            case 3:
                System.out.println("PROGRAM 3");
                String str1 = sc.next();
                String str2 = sc.next();
                program3(str1, str2);
                break;    
            case 4:
                System.out.println("PROGRAM 4");
                String str = sc.next();
                program4(str);
                break;
            case 6:
                System.out.println("PROGRAM 6");
                System.out.println("Enter size of array and elements : ");
                int num = sc.nextInt();
                int[] arr = new int[num];

                for (int i = 0; i < num; i++) {
                    arr[i] = sc.nextInt();
                }
                System.out.println("Enter value to remove:");
                int val = sc.nextInt();            
                int newLength = program6(arr, val);
                System.out.println("The length of the new array is: " + newLength);
                break;
            case 7:
                System.out.println("String-1 : ");
                String s1 = sc.next();

                System.out.println("String-2 : ");
                String s2 = sc.next();

                // Check anagram
                boolean result = program7(s1, s2);

                System.out.println("Check if two given strings are anagrams or not?: " + result);
                break;
            default:
                System.out.println("Invalid choice!");
        }
        sc.close();
        }
}