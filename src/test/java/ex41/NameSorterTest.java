package ex41;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class NameSorterTest {

    @Test
    void read_File() throws FileNotFoundException {
        NameSorter App = new NameSorter();
        File file = new File("C:/Users/j/IdeaProjects/untitled/londono-cop3330-assignment3/src/test/java/ex41/tester41");
        ArrayList<String> mylist= new ArrayList<>();
        mylist.add("Julian");
        assertEquals(NameSorter.read_File(file).get(0), "Julian");

    }
}