import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number;
        int digits[] = new int[10];
        int frequency[] = new int[10];
        int index = 0;

        System.out.print("Enter a number: ");
        number = sc.nextInt();

        // Extract digits and store in array
        while(number != 0) {
            digits[index] = number % 10;
            number = number / 10;
            index++;
        }

        // Count frequency
        for(int i = 0; i < index; i++) {
            frequency[digits[i]]++;
        }

        // Display frequency
        System.out.println("Digit Frequencies:");

        for(int i = 0; i < 10; i++) {
            if(frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " times");
            }
        }

        sc.close();
    }
}