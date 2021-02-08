package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldCalculateIfAmountCorrect() {
        CashbackHackService service= new CashbackHackService();
        int amount = 2500;
        int actual = service.remain(amount);
        int expected= 500;
        assertEquals(actual,expected);
    }

    @Test
    public void shouldCalculateIfAmountZero() {
        CashbackHackService service= new CashbackHackService();
        int amount =0;
        int actual = service.remain(amount);
        int expected= 1000;
        assertEquals(actual,expected);
    }
    @Test
    public void shouldCalculateIfAmount1000() {
        CashbackHackService service= new CashbackHackService();
        int amount =1000;
        int actual = service.remain(amount);
        int expected= 0;
        assertEquals(actual,expected);
    }

}