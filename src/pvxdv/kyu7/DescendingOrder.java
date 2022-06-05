package pvxdv.kyu7;

//Your task is to make a function that can take any non-negative integer as an argument and return it with its digits in descending order. Essentially, rearrange the digits to create the highest possible number.
//
//Examples:
//Input: 42145 Output: 54421
//
//Input: 145263 Output: 654321
//
//Input: 123456789 Output: 987654321

public class DescendingOrder {
    public static int sortDesc(final int num) {
        int[] numbers = new int[String.valueOf(num).length()];
        int count = num;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = count % 10;
            count /= 10;
        }
        sort(numbers);
        count = 0;
        for (int i = 0; i < numbers.length; i++) {
            count += numbers[i] * Math.pow(10, numbers.length - (i + 1));
        }
        return count;
    }

    public static void sort(int[] numbers) {
        int number = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] < numbers[j + 1]) {
                    number = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = number;
                }
            }
        }
    }
}
