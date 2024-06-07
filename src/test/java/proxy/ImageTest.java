package proxy;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ImageTest {

    @Test
    void testProxyImage_WithValidPayload_DisplaysValidData() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Image image = new ProxyImage("example.jpg");
        image.display();
        image.display();

        System.setOut(System.out);
        String consoleOutput = outContent.toString().trim();
        assertEquals("Loading image: example.jpg\nDisplaying image: example.jpg\nDisplaying image: example.jpg", consoleOutput);
    }
}