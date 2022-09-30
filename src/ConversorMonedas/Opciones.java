package ConversorMonedas;

import javax.swing.*;

public class Opciones {
    Conversion total = new Conversion();

    public void convertir(double monto){

        String[] tipoConversion = { "Pesos Argentinos a Dolar", "Pesos Argentinos a Euro", "Pesos Argentinos a Bitcoin", "Pesos Argentinos a Ether",
                                    "Dolares a Pesos Argentinos", "Euros a Pesos Argentinos", "Bitcoins a Pesos Argentinos", "Ethers a Pesos Argentinos"};
        String tipoMoneda = JOptionPane.showInputDialog(null,
                "Elija la moneda a convertir", "Monedas",
                JOptionPane.INFORMATION_MESSAGE, null,
                tipoConversion, tipoConversion[0]).toString();

        switch (tipoMoneda){
            case "Pesos Argentinos a Dolar":
                total.convertirPesosADolares(monto);
                break;
            case "Pesos Argentinos a Euro":
                total.convertirPesosAEuros(monto);
                break;
            case "Pesos Argentinos a Bitcoin":
                total.convertirPesosABitcoins(monto);
                break;
            case "Pesos Argentinos a Ether":
                total.convertirPesosAEthers(monto);
                break;
            case "Dolares a Pesos Argentinos":
                total.convertirDolaresAPesos(monto);
                break;
            case "Euros a Pesos Argentinos":
                total.convertirEurosAPesos(monto);
                break;
            case "Bitcoins a Pesos Argentinos":
                total.convertirBitcoinsAPesos(monto);
                break;
            case "Ethers a Pesos Argentinos":
                total.convertirEthersAPesos(monto);
                break;
        }
    }
}
