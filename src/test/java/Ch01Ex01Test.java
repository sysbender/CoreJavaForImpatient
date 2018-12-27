//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Ch01Ex01Test {

    private static PrintStream originalOut;
    private static InputStream originalIn;

    private ByteArrayOutputStream out;

    private final String want = "Binary: 1000000011011\n" +
            "Octal: 10033\n" +
            "Hexadecimal: 101b\n" +
            "Hexadecimal floating point: 0x1.fca5a873bcb19p-13\n";

    @BeforeAll
    static void saveOriginals(){
        originalIn = System.in;
        originalOut = System.out;
    }

    @BeforeEach
    void setupInput(){
        ByteArrayInputStream in = new ByteArrayInputStream("4123".getBytes());
        this.out = new ByteArrayOutputStream(2000);
        System.setIn(in);
        System.setOut(new PrintStream(this.out));
    }

    @Test
    void test_Ch01Ex01(){
        Ch01Ex01.main(null);
        assertEquals(this.want, this.out.toString());




    }


    @AfterAll
    static void restoreOriginals(){
        System.setIn(originalIn);
        System.setOut(originalOut);
    }
}