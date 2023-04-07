//Medidas de masa

package medidasmasa;

import javax.swing.JOptionPane;

public class MedidasMasa {
     
    public static void main(String[] args) {
       double masa;
       int opcion;
       opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido al conversor de masa\n"
       +"Elige una unidad para convertir\n"
       +"1. Gramos (g)\n"
       +"2. Libras (lb)\n"
       +"3. Onzas (oz)\n"
       +"4. Miligramos (mg)\n"
       +"5.Salir\n"));
       
            
       switch (opcion){
           case 1: masa = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de masa a convertir en KILOGRAMOS (kg)"));
                    masa*=1000;
                    JOptionPane.showMessageDialog(null, "Son "+masa+" gramos");
                    break;
           case 2: masa = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de masa a convertir en KILOGRAMOS (kg)"));
                    masa*=(1/453.6)*1000;
                    JOptionPane.showMessageDialog(null, "Son "+masa+" libras");
                    break;
           case 3: masa = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de masa a convertir en KILOGRAMOS (kg)"));
                    masa*=(1/28.3)*1000;
                    JOptionPane.showMessageDialog(null, "Son "+masa+" onzas");
                    break;
           case 4: masa = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de masa a convertir en KILOGRAMOS (kg)"));
                    masa*=1000*1000;
                    JOptionPane.showMessageDialog(null, "Son "+masa+" miligramos");
                    break;
           case 5: break;
           default: JOptionPane.showMessageDialog(null, "La opción seleccionada no se encuentra dentro del menú");
           
       }
       
       
       
       
    }
    
}
