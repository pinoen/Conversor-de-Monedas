package ConversorTemperaturas;

import javax.swing.*;

public class Conversion {

    public void convertirCelsiusAFahrenheit(double temp){
        double resultado = (temp * 9/5) + 32;
        JOptionPane.showMessageDialog(null, "La temperatura ingresada equivale a "+resultado+" grados fahrenheit.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
    public void convertirCelsiusAKelvin(double temp){
        double resultado = temp + 273.15;
        JOptionPane.showMessageDialog(null, "La temperatura ingresada equivale a "+resultado+" grados kelvin.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
    public void convertirFahrenheitACelsius(double temp){
        double resultado = (temp - 32) * 5/9;
        JOptionPane.showMessageDialog(null, "La temperatura ingresada equivale a "+resultado+" grados celsius.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
    public void convertirKelvinACelsius(double temp){
        double resultado = temp - 273.15;
        JOptionPane.showMessageDialog(null, "La temperatura ingresada equivale a "+resultado+" grados celsius.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
