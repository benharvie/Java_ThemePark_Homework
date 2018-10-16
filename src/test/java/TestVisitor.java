import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestVisitor {

    Visitor visitor;

    @Before
    public void before(){
        visitor = new Visitor(12, 5.5, 24.50);
    }

    @Test
    public void hasAge(){
        assertEquals(12, visitor.getAge());
    }

    @Test
    public void hasHeight(){
        assertEquals(5.5, visitor.getHeight(), 0.1);
    }

    @Test
    public void hasMoney(){
        assertEquals(24.50, visitor.getMoney(), 0.1);
    }
}
