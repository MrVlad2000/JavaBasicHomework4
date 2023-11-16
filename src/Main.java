import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введіть дохід: ");
        double income = sc.nextDouble();

        double taxAmount;

        if (income <= 10000) {
            taxAmount = income * 0.025;
        } else if (income <= 25000) {
            taxAmount = income * 0.043;
        } else {
            taxAmount = income * 0.067;

            sc.close();
        }

        System.out.printf("Податок: %.2f грн%n", taxAmount);}}