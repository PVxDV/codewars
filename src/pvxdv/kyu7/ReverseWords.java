package pvxdv.kyu7;
//Complete the function that accepts a string parameter, and reverses each word in the string. All spaces in the string should be retained.
//
//        Examples
//        "This is an example!" ==> "sihT si na !elpmaxe"
//        "double  spaces"      ==> "elbuod  secaps"

import java.util.ArrayList;

public class ReverseWords {

    public static String reverseWords(final String original) {

        Character character;
        String word = "";
        String result = "";

        for (int i = 0; i < original.length(); i++) {
            character = original.charAt(i);
            if(character.equals(' ')) {
                StringBuilder stringBuilder = new StringBuilder();
                result += stringBuilder.append(word).reverse().toString();
                result += character;
                word = "";
            } else {
                word += character;
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        result += stringBuilder.append(word).reverse().toString();

        return result;
    }
}



