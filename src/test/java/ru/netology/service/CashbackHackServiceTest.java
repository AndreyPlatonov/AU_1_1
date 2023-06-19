package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;


public class CashbackHackServiceTest {

    @Test
    public void shouldCashBack() {

        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);

        Assert.assertEquals(actual, expected);


    }

    @Test
    public void shouldCashBackZero() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);

        Assert.assertEquals(actual, expected);
    }

}
