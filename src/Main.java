import ConversorMonedas.Conversion;
import ConversorMonedas.Opciones;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Opciones resultado = new Opciones();
        ConversorTemperaturas.Opciones temperatura = new ConversorTemperaturas.Opciones();
        boolean isActive = true;

        while(isActive){
            try {
                String[] conversor = { "Moneda", "Temperatura" };
                String eleccion = JOptionPane.showInputDialog(null,
                        "Seleccione una opcion de conversion", "Menu",
                        JOptionPane.INFORMATION_MESSAGE, null,
                        conversor, conversor[0]).toString();

                switch (eleccion){
                    case "Moneda":
                        String monto = JOptionPane.showInputDialog("Por favor ingrese el monto de dinero a convertir");
                        resultado.convertir(Double.parseDouble(monto));
                        break;
                    case "Temperatura":
                        String temp = JOptionPane.showInputDialog("Por favor ingrese el valor de temperatura a convertir");
                        temperatura.convertir(Double.parseDouble(temp));
                }
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Valor ingresado no valido", "ERROR", JOptionPane.ERROR_MESSAGE);
            }


            int continuar = JOptionPane.showConfirmDialog(null,
                    "Desea continuar", "Elija una opcion", JOptionPane.YES_NO_OPTION);

            if(JOptionPane.OK_OPTION == continuar){
                isActive = true;
            }else {
                JOptionPane.showMessageDialog(null,"Programa terminado.");
                isActive = false;
            }
        }
    }
}
