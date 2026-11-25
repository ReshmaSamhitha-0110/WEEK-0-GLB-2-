public class EvenPositionSum {
    public static void main(String[] args) {
        int num = 12345;
        int position = 1;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;

            if (position % 2 == 0) {
                sum += digit;
            }

            position++;
            num /= 10;
        }

        System.out.println("Sum of digits at even positions = " + sum);
    }
}
