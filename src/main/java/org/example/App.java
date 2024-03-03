package org.example;

public class App {
    public static void main(String[] args) {
        // ahrenheit to Celsius
        double fahrenheit = 100;
        double celsius = FarToCel.fahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + " Fahrenheit is equal to " + String.format("%.2f", celsius) + " Celsius.");

        // Celsius to Fahrenheit
        celsius = 0;
        fahrenheit = FarToCel.celsiusToFahrenheit(celsius);
        System.out.println(celsius + " Celsius is equal to " + String.format("%.2f", fahrenheit) + " Fahrenheit.");

        // Kelvin to Celsius
        float kelvin = 273.15f;
        celsius = FarToCel.kelvintoCel(kelvin);
        System.out.println(kelvin + " Kelvin is equal to " + String.format("%.2f", celsius) + " Celsius.");

        // Kelvin to Fahrenheit
        kelvin = 255.37f; // Roughly -18 Celsius
        fahrenheit = FarToCel.kelvinToFah(kelvin);
        System.out.println(kelvin + " Kelvin is equal to " + String.format("%.2f", fahrenheit) + " Fahrenheit.");

    }
}
