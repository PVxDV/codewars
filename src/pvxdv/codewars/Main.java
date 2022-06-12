package pvxdv.codewars;


import pvxdv.kyu5.DirectionsReduction;
import pvxdv.kyu5.PickPeaks;
import pvxdv.kyu7.ReverseWords;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{-1, 8, 17, 17, 9, -3};

        for(int i: PickPeaks.getPeaks(array).get("pos")) {
            System.out.println("pos = " + i);

        }

        for(int i: PickPeaks.getPeaks(array).get("peaks")) {
            System.out.println("peaks = " + i);

        }


    }
}

