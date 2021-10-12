package ex42;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class ParserTest {

    @Test
    void read_File() throws FileNotFoundException {
        Parser app = new Parser();
        File file = new File ("C:\\Users\\j\\IdeaProjects\\untitled\\londono-cop3330-assignment3\\src\\test\\java\\ex42\\tester42");
        assertEquals( Parser.read_File(file).size(), 3);
    }

    @Test
    void print_table() {
    }
}