package by.jrr.bean;

import by.jrr.service.SignComparatoService;
import org.junit.Test;

import static org.junit.Assert.*;

public class SignComparatoTest {

    @Test
    public void getNumber() {
        SignComparato signComparato = new SignComparato();
        signComparato.setNumber(10);

        int expected = 10;
        int actual = signComparato.getNumber();
        assertEquals(expected, actual);
    }


    @Test
    public void testEquals() {
        SignComparato signComparatoLeft = new SignComparato();
        signComparatoLeft.setNumber(10);

        SignComparato signComparatoRight = new SignComparato();
        signComparatoRight.setNumber(10);

        boolean expected = true;
        boolean actual = signComparatoLeft.equals(signComparatoRight);
        assertEquals(expected, actual);
    }

    @Test
    public void testHashCode() {
        SignComparato signComparato = new SignComparato();
        signComparato.setNumber(10);

        int expected = 10;
        int actual = signComparato.hashCode();
        assertEquals(expected, actual);

    }

    @Test
    public void testToString() {
        SignComparato signComparato = new SignComparato();
        signComparato.setNumber(10);

        String expected = "SignComparato{number=10}";
        String actual = signComparato.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void testEquals1() {
        SignComparato signComparato = new SignComparato();
        signComparato.setNumber(10);

        boolean expected = true;
        boolean actual = signComparato.equals(signComparato);
        assertEquals(expected, actual);
    }
    @Test
    public void testEqualsFalse() {
        SignComparato signComparato = new SignComparato();
        signComparato.setNumber(-10);

        boolean expected = false;
        boolean actual = signComparato.equals(false);
        assertEquals(expected, actual);
    }
    @Test
    public void testEqualsTrue() {
        SignComparato signComparato = new SignComparato();
        signComparato.setNumber(0);

        boolean expected = true;
        boolean actual = signComparato.equals(signComparato);
        assertEquals(expected, actual);
    }
}

