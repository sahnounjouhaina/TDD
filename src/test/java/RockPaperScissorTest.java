import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class RockPaperScissorTest {
    RockPaperScissor rps;
    @BeforeMethod
    public void setUp() {
        rps= new RockPaperScissor();
    }

    @AfterMethod
    public void tearDown() {
        rps=null;
    }
    @Parameters({"papier","pierre"})
    @Test
    public void testPlayWin(String p1,String p2) {
        assertEquals(rps.play(Play.valueOf(p1),Play.valueOf(p2)),Result.WIN);
    }
    @Parameters({"papier","papier"})
    @Test
    public void testPlayTie(String p1,String p2) {
        assertEquals(rps.play(Play.valueOf(p1),Play.valueOf(p2)),Result.TIE);
    }
    @Parameters({"papier","ciseau"})
    @Test
    public void testPlayLost(String p1,String p2) {
        assertEquals(rps.play(Play.valueOf(p1),Play.valueOf(p2)),Result.LOST);
    }
}