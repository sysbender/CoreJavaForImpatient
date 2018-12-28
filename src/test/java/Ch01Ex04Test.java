import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ch01Ex04Test extends ConsoleBaseTest{

    @Override
    protected String input() {
        return "";
    }

    @Override
    protected String expectedOutput() {
        return "up=4.90000e-324\n" +
                "down=1.79769e+308\n";
    }

    @Test
    public void check(){
        Ch01Ex04.main(null);
        assertEquals(expectedOutput(),this.out.toString());
    }
}
