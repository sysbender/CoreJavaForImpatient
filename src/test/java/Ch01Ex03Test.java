import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ch01Ex03Test extends ConsoleBaseTest {

    @Override
    protected String input() {
        return "4 8 10";
    }

    @Override
    protected String expectedOutput() {
        return "max=10\nMath.max=10\n";
    }

    @Test
    void check(){
        Ch01Ex03.main(null);
        assertEquals( expectedOutput(), this.out.toString());
    }


}
