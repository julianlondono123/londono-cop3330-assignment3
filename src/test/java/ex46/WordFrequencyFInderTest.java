package ex46;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class WordFrequencyFInderTest {

    @Test
    void read_file() throws FileNotFoundException {
        WordFrequencyFInder app = new WordFrequencyFInder();
        File file = new File("C:/Users/j/IdeaProjects/untitled/londono-cop3330-assignment3/src/test/java/ex46/tester46");
        Map<String, Integer> map = new HashMap<>();
        map = WordFrequencyFInder.read_file(file);
        assertEquals(map.get("build"), 5);


    }

}