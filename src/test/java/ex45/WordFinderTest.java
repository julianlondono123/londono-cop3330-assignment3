package ex45;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class WordFinderTest {

    @Test
    void replace_words() throws IOException {
        WordFinder app = new WordFinder();
        File file = new File ("C:\\Users\\j\\IdeaProjects\\untitled\\londono-cop3330-assignment3\\src\\test\\java\\ex45\\tester45");
        Scanner scan = new Scanner(file);

        WordFinder.replace_words(scan, "final");

        boolean flag = false;
        while (scan.hasNext()) {
            String test = scan.nextLine();
            if (test.contains("utilize") {
                flag = true;
            }

        }
        assertEquals(false, flag);

    }
}