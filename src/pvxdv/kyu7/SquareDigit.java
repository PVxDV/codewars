package pvxdv.kyu7;
//Welcome. In this kata, you are asked to square every digit of a number and concatenate them.
//
//For example, if we run 9119 through the function, 811181 will come out, because 9^2 is 81 and 1^2 is 1.
//
//Note: The function accepts an integer and returns an integer

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SquareDigit {
    public int squareDigits(int n) {
        List<Integer> numbers = new ArrayList<Integer>();
        int temp = n;
        for (int i = 0; i < String.valueOf(n).length(); i++) {
            numbers.add((int) Math.pow(temp % 10, 2));
            temp /= 10;
        }
        Collections.reverse(numbers);

        String result = "";
        for(Integer integer: numbers) {
            result += integer;
        }

        return Integer.parseInt(result);
    }
}
