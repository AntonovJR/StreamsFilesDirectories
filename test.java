import java.util.ArrayDeque;
import java.util.Scanner;


public class test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            int command = Integer.parseInt(input[0]);

            if (command == 1) {
                int number = Integer.parseInt(input[1]);
                stack.push(number);
            } else if (command == 2) {
                stack.pop();
            } else if((command==3)){
                System.out.println(giveMax(stack));
            }

        }

    }

    public static int giveMax(ArrayDeque<Integer> stack) {
        int maxNumber = Integer.MIN_VALUE;
        for (Integer integer : stack) {
            if (integer > maxNumber) {
                maxNumber = integer;
            }
        }

        return maxNumber;

    }
}