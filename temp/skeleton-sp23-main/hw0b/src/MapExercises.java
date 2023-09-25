import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MapExercises {
    /** Returns a map from every lower case letter to the number corresponding to that letter, where 'a' is
     * 1, 'b' is 2, 'c' is 3, ..., 'z' is 26.
     */
    public static Map<Character, Integer> letterToNum() {
        Map<Character, Integer> result = Map.ofEntries(Map.entry('a', 1),
                Map.entry('b', 2), Map.entry('c', 3), Map.entry('d', 4),
                Map.entry('e', 5), Map.entry('f', 6), Map.entry('g', 7),
                Map.entry('h', 8), Map.entry('i', 9), Map.entry('j', 10),
                Map.entry('k', 11), Map.entry('l', 12), Map.entry('m', 13),
                Map.entry('n', 14), Map.entry('o', 15), Map.entry('p', 16),
                Map.entry('q', 17), Map.entry('r', 18), Map.entry('s', 19),
                Map.entry('t', 20), Map.entry('u', 21), Map.entry('v', 22),
                Map.entry('w', 23), Map.entry('x', 24), Map.entry('y', 25),
                Map.entry('z', 26));
        return result;
    }

    /** Returns a map from the integers in the list to their squares. For example, if the input list
     *  is [1, 3, 6, 7], the returned map goes from 1 to 1, 3 to 9, 6 to 36, and 7 to 49.
     */
    public static Map<Integer, Integer> squares(List<Integer> nums) {
        Map<Integer, Integer> result = new TreeMap<>();
        for (int i : nums) {
            result.put(i, (int) Math.pow(i, 2));
        }
        return result;
    }

    /** Returns a map of the counts of all words that appear in a list of words. */
    public static Map<String, Integer> countWords(List<String> words) {
        Map<String, Integer> result = new TreeMap<>();
        for (String w : words) {
            if (result.containsKey(w)) {
                int val = result.get(w);
                int newVal = val + 1;
                result.put(w, newVal);
            }
            else {
                result.put(w, 1);
            }
        }
        return result;
    }
}
