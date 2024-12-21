import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of steps: ");
        int n = scanner.nextInt();

        int tourCost = countPreciousStones(n);
        System.out.println("The cost of the tour is: " + tourCost);
    }

    private static int countPreciousStones(int steps) {
        int count = 0;

        for (int step = 1; step <= steps; step++) {
            if (step % 8 == 0 || step == steps) {
                count += countLuckyDigits(step);
            }
        }

        return count;
    }

    private static int countLuckyDigits(int num) {
        int count = 0;

        while (num > 0) {
            int digit = num % 10;
            if (digit == 6 || digit == 8) {
                count++;
            }
            num /= 10;
        }

        return count;
    }
}
