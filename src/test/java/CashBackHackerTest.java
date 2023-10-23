package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashBackHackerTest {
   @Test
    public void shouldTestWhenItsUnder1000() {
        CashBackHacker service = new CashBackHacker();

        int expected = 100;
        int actual = service.remain(900);
        assertEquals(actual, expected);

    }

    @Test
    public void shouldTestWhenItsAbove1000() {
        CashBackHacker service = new CashBackHacker();

        int expected = 300;
        int actual = service.remain(1700);
        assertEquals(actual, expected);

    }

    @Test
    public void shouldTestWhenIts1000() {
        CashBackHacker service = new CashBackHacker();

        int expected = 0;
        int actual = service.remain(1000);
        assertEquals(actual, expected);
    }
}
