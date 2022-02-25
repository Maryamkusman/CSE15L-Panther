import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.ArrayList;

public class MarkdownParseTest {
    ArrayList<String> emptyArrayList = new ArrayList<>();

    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test 
    public void fail() {
        assertTrue(true);
    }

    @Test 
    public void secondFail() {
        assertEquals(2*2, 2*2);
    }

    @Test
    public void testFile1() throws IOException {
        Path fileName = Path.of("./test-file.md");
	    String contents = Files.readString(fileName);
        List<String> expected = List.of("https://something.com", "some-page.html");
        assertEquals(expected, MarkdownParse.getLinks(contents));
    }

    @Test
    public void testFile2() throws IOException {
        Path fileName = Path.of("./test-file2.md");
	    String contents = Files.readString(fileName);
        List<String> expected = List.of();
        assertEquals(expected, MarkdownParse.getLinks(contents));
    }

    @Test
    public void testFile3() throws IOException {
        Path fileName = Path.of("./test-file3.md");
	    String contents = Files.readString(fileName);
        List<String> expected = List.of();
        assertEquals(expected, MarkdownParse.getLinks(contents));
    }

    @Test
    public void testFile4() throws IOException {
        Path fileName = Path.of("./test-file4.md");
	    String contents = Files.readString(fileName);
        List<String> expected = List.of();
        assertEquals(expected, MarkdownParse.getLinks(contents));
    }

    @Test
    public void testFile5() throws IOException {
        Path fileName = Path.of("./test-file5.md");
	    String contents = Files.readString(fileName);
        List<String> expected = List.of();
        assertEquals(expected, MarkdownParse.getLinks(contents));
    }

    @Test
    public void testFile6() throws IOException {
        Path fileName = Path.of("./test-file6.md");
	    String contents = Files.readString(fileName);
        List<String> expected = List.of();
        assertEquals(expected, MarkdownParse.getLinks(contents));
    }

    @Test
    public void testFile7() throws IOException {
        Path fileName = Path.of("./test-file7.md");
	    String contents = Files.readString(fileName);
        List<String> expected = List.of();
        assertEquals(expected, MarkdownParse.getLinks(contents));
    }

    @Test
    public void testFile8() throws IOException {
        Path fileName = Path.of("./test-file8.md");
	    String contents = Files.readString(fileName);
        List<String> expected = List.of();
        assertEquals(expected, MarkdownParse.getLinks(contents));
    }
    @Test
    public void getLinksJoeTest9() throws IOException{
        Path fileName = Path.of("./joe-test-files/test-file11.md");
        String contents = Files.readString(fileName);
        assertEquals(emptyArrayList, MarkdownParse.getLinks(contents));
    }
    @Test
    public void getLinksJoeTest10() throws IOException{
        Path fileName = Path.of("./joe-test-files/test-file12.md");
        String contents = Files.readString(fileName);
        assertEquals(emptyArrayList, MarkdownParse.getLinks(contents));
    }
    @Test
    public void getLinksJoeTest11() throws IOException{
        Path fileName = Path.of("./joe-test-files/test-file13.md");
        String contents = Files.readString(fileName);
        assertEquals(emptyArrayList, MarkdownParse.getLinks(contents));
    }
}