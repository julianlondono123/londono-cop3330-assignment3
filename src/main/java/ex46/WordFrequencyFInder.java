package ex46;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class WordFrequencyFInder {
    public static void main(String args[]) throws FileNotFoundException {
        File file = new File("C:/Users/j/Desktop/exercise46_input.txt");
        Map<String, Integer> map = read_file(file);
        ArrayList<String> words_sorted = build_output(map);
        Collections.reverse(words_sorted);
        print_output(words_sorted);

    }

    public static Map<String, Integer> read_file(File file) throws FileNotFoundException {
        Map<String, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(file);
        ArrayList<String> words = new ArrayList<>();
        String s;


        while (sc.hasNext()) {
            s = sc.nextLine();
            words = new ArrayList<>(Arrays.asList(s.split(" ")));
            for (int i = 0; i < words.size(); i++) {
                if (map.containsKey(words.get(i))) {
                    map.put(words.get(i), map.get(words.get(i)) + Collections.frequency(words, words.get(i)));
                } else {
                    map.put(words.get(i), 1);
                }

            }


        }
        return map;
    }

    public static ArrayList<String> build_output (Map<String, Integer> map) {
        ArrayList<String> words_sorted = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String x = entry.getKey() + " ";
            for (int j = 0; j < entry.getValue(); j++) {
                x = x + "*";
            }
            words_sorted.add(x);
        }
        return words_sorted;
    }

    public static void print_output (ArrayList<String> words_sorted) {
        for (int i = 0; i < words_sorted.size(); i++) {
            System.out.println(words_sorted.get(i));
        }
    }
}
