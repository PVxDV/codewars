package pvxdv.kyu6;

//Create a function taking a positive integer as its parameter and returning a string containing the Roman Numeral representation of that integer.
//        Modern Roman numerals are written by expressing each digit separately starting with the left most digit and skipping any digit with a value of zero.
//        In Roman numerals 1990 is rendered: 1000=M, 900=CM, 90=XC; resulting in MCMXC. 2008 is written as 2000=MM, 8=VIII; or MMVIII.
//        1666 uses each Roman symbol in descending order: MDCLXVI.
//        Example:
//        conversion.solution(1000); //should return "M"
//        Help:
//        Symbol    Value
//        I          1
//        V          5
//        X          10
//        L          50
//        C          100
//        D          500
//        M          1,000
//        Remember that there can't be more than 3 identical symbols in a row.
//        More about roman numerals - http://en.wikipedia.org/wiki/Roman_numerals

public class RomanNumeralsEncoder {
    private static final String[] ROMAN_NUMBERS = new String[]{"I", "V", "X", "L", "C", "D", "M"};
    public static String solution(int n) {
        StringBuilder result = new StringBuilder();
        int count = 0;
        String one = "";
        String two = "";
        String tree = "";
        while(n > 0 ) {
          switch (count) {
              case 0:
                  one = ROMAN_NUMBERS[0];
                  two = ROMAN_NUMBERS[1];
                  tree = ROMAN_NUMBERS[2];
                  break;
              case 1:
                  one = ROMAN_NUMBERS[2];
                  two = ROMAN_NUMBERS[3];
                  tree = ROMAN_NUMBERS[4];
                  break;
              case 2:
                  one = ROMAN_NUMBERS[4];
                  two = ROMAN_NUMBERS[5];
                  tree = ROMAN_NUMBERS[6];
                  break;
              case 3:
                  one = ROMAN_NUMBERS[6];
                  two = ROMAN_NUMBERS[6];
                  tree = ROMAN_NUMBERS[6];
                  break;
          }
            switch (n % 10) {
                case 1:
                    result.append(one);
                    break;
                case 2:
                    result.append(one);
                    result.append(one);
                    break;
                case 3:
                    result.append(one);
                    result.append(one);
                    result.append(one);
                    break;
                case 4:
                    result.append(two);
                    result.append(one);
                    break;

                case 5:
                    result.append(two);
                    break;
                case 6:
                    result.append(one);
                    result.append(two);
                    break;
                case 7:
                    result.append(one);
                    result.append(one);
                    result.append(two);
                    break;
                case 8:
                    result.append(one);
                    result.append(one);
                    result.append(one);
                    result.append(two);
                    break;
                case 9:
                    result.append(tree);
                    result.append(one);
                    break;
                default:
                    break;
            }
            count ++;
            n /= 10;
        }
        return result.reverse().toString();
    }
}
