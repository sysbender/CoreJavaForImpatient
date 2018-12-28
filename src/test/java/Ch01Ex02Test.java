import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ch01Ex02Test extends ConsoleBaseTest{
    @Override
    protected String input() {
        return "-2";
    }

    @Override
    protected String expectedOutput() {
        return "Mod=2\nMath.floorMod=358\n";
    }

    @Test
    public void check(){
        Ch01Ex02.main(null);
        assertEquals(expectedOutput(), this.out.toString());
    }
}
