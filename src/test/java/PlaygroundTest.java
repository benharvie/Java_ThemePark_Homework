import Attractions.Playground;
import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    Playground playground;
    Visitor visitor;

    @Before
    public void before() {
        playground = new Playground("FunFunFun");
    }

    @Test
    public void visitorUnderageNotAllowed(){
        visitor = new Visitor(12, 5.5, 24.50);
        assertEquals(false, playground.isAllowedTo(visitor));
    }

    @Test
    public void visitorOfAgeAllowed(){
        visitor = new Visitor(19, 5.5, 24.50);
        assertEquals(true, playground.isAllowedTo(visitor));
    }
}
