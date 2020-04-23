package Metodo;

import javax.swing.JOptionPane;

public class Metodos 
{
    public boolean checkEspacios(String apellido1, String apellido2, String nombre, String pasaporte, int destino, int genero)
    {
        boolean continuar = true;
        
        if((nombre == "") || (apellido1 == "") || (apellido2 == "") || (pasaporte == ""))
        {
            JOptionPane.showMessageDialog(null, "Debe llenar todos los espacios.");
            continuar = false;
        }
        else
        {
            if((genero == 0) || (destino == 0))
            {
                JOptionPane.showMessageDialog(null, "Debe seleccionar todas las opciones.");
                continuar = false;
            }//Fin if
            
        }//Fin if
        return continuar;
        
    }//Fin checkEspacios
      
}//Fin Metodos
