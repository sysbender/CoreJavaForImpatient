import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public abstract class ConsoleBaseTest {
    private static PrintStream originalOut;
    private static InputStream originalIn;

    protected ByteArrayOutputStream out;


    //private final String want = "Mod % 360 is -2\n" +            "Math.floorMod(angle, 360) is 358\n";

    /**
     * save original in and out
     */
    @BeforeAll
    protected static void saveOriginals() {
        originalOut = System.out;
        originalIn = System.in;
    }

    @BeforeEach
    protected void setupInput() {
        ByteArrayInputStream in = new ByteArrayInputStream(input().getBytes());
        this.out = new ByteArrayOutputStream(expectedOutput().length() * 2);
        System.setIn(in);
        System.setOut(new PrintStream(this.out));
    }

    /**
     * restore original in and out
     */
    @AfterAll
    protected static void restoreOriginals() {
        System.setOut(originalOut);
        System.setIn(originalIn);
    }

     protected abstract String input();
     protected abstract String expectedOutput();

}
