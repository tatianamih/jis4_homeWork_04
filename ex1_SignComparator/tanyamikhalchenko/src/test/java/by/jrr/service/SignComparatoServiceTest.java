package by.jrr.service;

import by.jrr.bean.SignComparato;
import org.junit.Test;

import static org.junit.Assert.*;

public class SignComparatoServiceTest {
//
       @Test
    public void printAPositiveNumber() {
        SignComparato signComparato = new SignComparato();
        signComparato.setNumber(10);

        SignComparatoService signComparatoService = new SignComparatoService();
        if (signComparato.getNumber() > 0) {

           String expected = "Number is positive";
           String actual = signComparatoService.determineTheSign(signComparato);
           assertEquals(expected, actual);
       }
    }
    @Test
    public void printAPositiveNumber2() {
        SignComparato signComparato = new SignComparato();
        signComparato.setNumber(100000);

        SignComparatoService signComparatoService = new SignComparatoService();
        if (signComparato.getNumber() > 0) {

            String expected = "Number is positive";
            String actual = signComparatoService.determineTheSign(signComparato);
            assertEquals(expected, actual);
        }
    }
    @Test
    public void printANegativeNumber() {
        SignComparato signComparato = new SignComparato();
        signComparato.setNumber(-10);

        SignComparatoService signComparatoService = new SignComparatoService();
        if (signComparato.getNumber() < 0) {
            String expected = "Number is negative";
            String actual = signComparatoService.determineTheSign(signComparato);
            assertEquals(expected, actual);
        }
    }
    @Test
    public void printANegativeNumber2() {
        SignComparato signComparato = new SignComparato();
        signComparato.setNumber(-1000000000);

        SignComparatoService signComparatoService = new SignComparatoService();
        if (signComparato.getNumber() < 0) {
            String expected = "Number is negative";
            String actual = signComparatoService.determineTheSign(signComparato);
            assertEquals(expected, actual);
        }
    }
    @Test
    public void outputZero() {
        SignComparato signComparato = new SignComparato();
        signComparato.setNumber(0);

        SignComparatoService signComparatoService = new SignComparatoService();
        if (signComparato.getNumber() == 0) {
            String expected = "Number is equal to zero";
            String actual = signComparatoService.determineTheSign(signComparato);
            assertEquals(expected, actual);
        }
    }


}

