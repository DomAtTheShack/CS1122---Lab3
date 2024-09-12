import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestCasesTest
{
    @Test
    void TestTwinkiePrice() {
        ForSale twink = new Twinkies();
        assertEquals(twink.getPrice(5), new Twinkies().getPrice(5));
    }

    @Test
    void TestTwinkieFood() {
        Twinkies twink = new Twinkies();
        assertEquals(twink.isFood(), new Twinkies().isFood());
    }

    @Test
    void TestTruckPrice() {
        Truck ram = new Truck(5.99);
        assertEquals(ram.getPrice(5), new Truck(5.99).getPrice(5));
    }

    @Test
    void TestTruckBool() {
        Truck ram = new Truck(2.99);
        assertEquals(ram.isFood(), new Truck(7.99).isFood());
    }

}