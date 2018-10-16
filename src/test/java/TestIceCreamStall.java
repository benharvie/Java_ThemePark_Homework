import Stalls.IceCreamStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

// Can safely assume Stall's inheritance is working across all Stalls.
public class TestIceCreamStall {

    IceCreamStall stall;

    @Before
    public void before(){
        stall = new IceCreamStall("Benny's Icecream", "Ben", 44);
    }

    @Test
    public void stallHasName(){
        assertEquals("Benny's Icecream", stall.getName());
    }

    @Test
    public void stallHasOwner(){
        assertEquals("Ben", stall.getOwnerName());
    }

    @Test
    public void stallHasParkingSpot(){
        assertEquals(44, stall.getParkingSpot());
    }
}
