package ConversorMonedas;

import javax.swing.*;

public class Conversion {
    private double pesoDolarRate = 0.0068;
    private double pesoEuroRate = 0.0069;
    private double pesoBitcoinRate = 0.00000034;
    private double pesoEtherRate = 0.0000050;
    private double dolarPesoRate = 147.31;
    private double euroPesoRate = 144.18;
    private double bitcoinPesoRate = 2903383.69;
    private double etherPesoRate = 199359.08;

    public void convertirPesosADolares(double monto){
        double resultado = monto * pesoDolarRate;
        JOptionPane.showMessageDialog(null, "Tienes $ "+resultado+" dolares.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
    public void convertirPesosAEuros(double monto){
        double resultado = monto * pesoEuroRate;
        JOptionPane.showMessageDialog(null, "Tienes $ "+resultado+" euros.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
    public void convertirPesosABitcoins(double monto){
        double resultado = monto * pesoBitcoinRate;
        JOptionPane.showMessageDialog(null, "Tienes $ "+resultado+" bitcoins.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
    public void convertirPesosAEthers(double monto){
        double resultado = monto * pesoEtherRate;
        JOptionPane.showMessageDialog(null, "Tienes $ "+resultado+" ethers.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }


    public void convertirDolaresAPesos(double monto){
        double resultado = monto * dolarPesoRate;
        JOptionPane.showMessageDialog(null, "Tienes $ "+resultado+" pesos.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
    public void convertirEurosAPesos(double monto){
        double resultado = monto * euroPesoRate;
        JOptionPane.showMessageDialog(null, "Tienes $ "+resultado+" pesos.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
    public void convertirBitcoinsAPesos(double monto){
        double resultado = monto * bitcoinPesoRate;
        JOptionPane.showMessageDialog(null, "Tienes $ "+resultado+" pesos.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
    public void convertirEthersAPesos(double monto){
        double resultado = monto * pesoEtherRate;
        JOptionPane.showMessageDialog(null, "Tienes $ "+resultado+" pesos.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
