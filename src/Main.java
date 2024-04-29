import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("Kaç tane sayı gireceksiniz : ");
        number = input.nextInt();

        // Assign the first input as the minimum and maximum
        System.out.print("1. sayıyı giriniz : ");
        int firstNumber = input.nextInt();
        int min = firstNumber;
        int max = firstNumber;

        // Get the other inputs and update
        for (int i = 2; i <= number; i++) {
            System.out.print(i + ". sayıyı giriniz : ");
            int num = input.nextInt();
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        // Printing the results
        System.out.println("En küçük sayı: " + min);
        System.out.println("En büyük sayı: " + max);
    }
}