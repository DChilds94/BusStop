import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {
    Bus bus;
    Person person;

    @Before
    public void before() {
        bus = new Bus("Glasgow", 20);
        person = new Person();
    }
    @Test
    public void getDestination() {
        assertEquals("Glasgow", bus.getDestination());
    }
    @Test
    public void getCapacity() {
        assertEquals(20, bus.getCapacity());
    }
    @Test
    public void canAddPassenger() {
        bus.addPassenger(person);
        assertEquals(1, bus.totalPassengers());
    }
    @Test
    public void canRemovePassenger() {
        bus.addPassenger(person);
        bus.removePassenger();
        assertEquals(0, bus.totalPassengers());
    }
}
