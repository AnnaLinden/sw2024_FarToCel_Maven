package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FarToCelTest {

    @Test
    public void testFahrenheitToCelsius() {
        Assertions.assertEquals(0, FarToCel.fahrenheitToCelsius(32), 0.01);
        Assertions.assertEquals(100, FarToCel.fahrenheitToCelsius(212), 0.01);
    }

    @Test
    void testCelsiusToFahrenheit() {
        Assertions.assertEquals(32, FarToCel.celsiusToFahrenheit(0), 0.01);
        Assertions.assertEquals(212, FarToCel.celsiusToFahrenheit(100), 0.01);
    }

    @Test
    void testKelvinToCel() {
        Assertions.assertEquals(0, FarToCel.kelvintoCel(273.15f), 0.01);
        Assertions.assertEquals(100, FarToCel.kelvintoCel(373.15f), 0.01);
    }
    @Test
    void convertKeltoFarTest () {

        double test = Math.round(FarToCel.kelvinToFah(300.1));
        Assertions.assertEquals(81, test, 0.01) ;

    }

}