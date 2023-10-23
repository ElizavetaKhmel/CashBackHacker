package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashBackHackerTest {
    @Test
    public void shouldTestUnder1000() {
        CashBackHacker service = new CashBackHacker();

        int expected = 100;
        int actual = service.remain(900);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldTestAbove1000() {
        CashBackHacker service = new CashBackHacker();

        int expected = 300;
        int actual = service.remain(1700);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldTest1000() {
        CashBackHacker service = new CashBackHacker();

        int expected = 0;
        int actual = service.remain(1000);
        assertEquals(expected, actual);
    }
}
