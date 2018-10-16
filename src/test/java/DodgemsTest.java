import Attractions.Attraction;
import Attractions.Dodgems;
import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    Attraction dodgems;
    Visitor visitor;

    @Before
    public void before(){
        dodgems = new Dodgems("Crash Carz");
        visitor = new Visitor(14, 5.5, 24.50);
    }

    @Test
    public void hasName(){
        assertEquals("Crash Carz", dodgems.getName());
    }

    @Test
    public void canVisit(){
        dodgems.addVisitor(visitor);
        dodgems.addVisitor(visitor);
        assertEquals(2, dodgems.getVisitors().size());
    }
}
