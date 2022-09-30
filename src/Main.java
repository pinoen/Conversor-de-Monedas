import ConversorMonedas.Conversion;
import ConversorMonedas.Opciones;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Opciones resultado = new Opciones();
        boolean isActive = true;

        while(isActive){
            String[] conversor = { "Moneda", "Temperatura" };
            String eleccion = JOptionPane.showInputDialog(null,
                    "Seleccione una opcion de conversion", "Menu",
                    JOptionPane.INFORMATION_MESSAGE, null,
                    conversor, conversor[0]).toString();

            String monto = JOptionPane.showInputDialog("Por favor ingrese el monto de dinero a convertir");
            resultado.convertir(Double.parseDouble(monto));

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
