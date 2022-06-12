package pvxdv.kyu5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//In this kata, you will write a function that returns the positions and the values of the "peaks" (or local maxima) of a numeric array.
//
//        For example, the array arr = [0, 1, 2, 5, 1, 0] has a peak at position 3 with a value of 5 (since arr[3] equals 5).
//
//        The output will be returned as a ``Map<String,List>with two key-value pairs:"pos"and"peaks". If there is no peak in the given array, simply return {"pos" => [], "peaks" => []}`.
//
//        Example: pickPeaks([3, 2, 3, 6, 4, 1, 2, 3, 2, 1, 2, 3]) should return {pos: [3, 7], peaks: [6, 3]} (or equivalent in other languages)
//
//        All input arrays will be valid integer arrays (although it could still be empty), so you won't need to validate the input.
//
//        The first and last elements of the array will not be considered as peaks (in the context of a mathematical function, we don't know what is after and before and therefore, we don't know if it is a peak or not).
//
//        Also, beware of plateaus !!! [1, 2, 2, 2, 1] has a peak while [1, 2, 2, 2, 3] and [1, 2, 2, 2, 2] do not. In case of a plateau-peak, please only return the position and value of the beginning of the plateau. For example: pickPeaks([1, 2, 2, 2, 1]) returns {pos: [1], peaks: [2]} (or equivalent in other languages)
//
//        Have fun!
public class PickPeaks {

    public static Map<String, List<Integer>> getPeaks(int[] arr) {
        Map<String, List<Integer>> result = new HashMap();
        result.put("pos", new ArrayList<>());
        result.put("peaks", new ArrayList<>());

        if(arr.length >= 2) {
            boolean isUp = arr[0] < arr[1];

            for (int i = 0; i < arr.length - 1; i++) {

                if(isUp) {

                    if (arr[i] > arr[i + 1]) {

                        if(arr[i-1] == arr[i]) {
                            for (int j = i; j >= 1; j--) {
                                if(arr[j-1] < arr[j]) {
                                    result.get("pos").add(j);
                                    result.get("peaks").add(arr[j]);
                                    isUp = false;
                                    break;
                                }
                            }
                        } else {
                            result.get("pos").add(i);
                            result.get("peaks").add(arr[i]);
                            isUp = false;
                        }
                    }
                }

                if(!isUp) {
                    if (arr[i] < arr[i+1]) {
                        isUp = true;
                    }
                }
            }
        }
        return result;
    }
}
