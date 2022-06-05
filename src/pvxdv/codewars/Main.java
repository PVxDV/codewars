package pvxdv.codewars;


import pvxdv.kyu5.DirectionsReduction;
import pvxdv.kyu7.ReverseWords;

public class Main {
    public static void main(String[] args) {

       for (String string : DirectionsReduction.dirReduc(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"})) {
           System.out.println(string);
       }
    }
}

