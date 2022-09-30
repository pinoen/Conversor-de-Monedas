package ConversorTemperaturas;

import javax.swing.*;

public class Opciones {

    Conversion total = new Conversion();

    public void convertir(double monto){

        String[] tipoConversion = { "Celsius a Fahrenheit", "Celsius a Kelvin", "Fahrenheit a Celsius", "Kelvin a Celsius"};
        String tipoMoneda = JOptionPane.showInputDialog(null,
                "Elija la moneda a convertir", "Monedas",
                JOptionPane.INFORMATION_MESSAGE, null,
                tipoConversion, tipoConversion[0]).toString();

        switch (tipoMoneda){
            case "Celsius a Fahrenheit":
                total.convertirCelsiusAFahrenheit(monto);
                break;
            case "Celsius a Kelvin":
                total.convertirCelsiusAKelvin(monto);
                break;
            case "Fahrenheit a Celsius":
                total.convertirFahrenheitACelsius(monto);
                break;
            case "Kelvin a Celsius":
                total.convertirKelvinACelsius(monto);
                break;
        }
    }
}
