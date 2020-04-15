package Metodo;

import javax.swing.JOptionPane;

public class Metodos 
{
    public void checkBoleto(int selecDestino, double costoBoleto, String destino)
    {     
        if(selecDestino == 1) //Nicaragua
        {
            costoBoleto = 95;
            destino = "NCA";
            
        }
        else
        {
            if(selecDestino == 2) //Panamá
            {
                costoBoleto = 100;
                destino = "PNA";
            
            }//Fin if
            
        }//Fin if
    }//Fin checkBoleto
    
    public double checkDescuento(int edad, double costoBoleto)
    {
        double descuento = 0;

        if(edad < 14)
        {
            descuento = (costoBoleto - (costoBoleto * 0.10));
        }
        else
        {
            if(edad > 65)
            {
                descuento = (costoBoleto - (costoBoleto * 0.35));
               
            }//Fin if

        }//Fin if
        return descuento;
        
    }//Fin checkDescuento
    
    
    public void checkEspacios(String apellido1, String apellido2, String nombre, String pasaporte, int destino, int edad, int genero, int regPension)
    {
        if((nombre == "") || (apellido1 == "") || (apellido2 == "") || (pasaporte == ""))
        {
            JOptionPane.showMessageDialog(null, "Debe llenar todos los espacios.");
        
        }//Fin if
        
        if((genero == 0) || (destino == 0) || ((edad > 65) && (regPension == 0)))
        {
            JOptionPane.showMessageDialog(null, "Debe seleccionar todas las opciones.");
        }//Fin if
        
    }//Fin checkEspacios

    public void checkCiudadanoOro(int edad, String ciudadanoOro)
    {
        if(edad > 65)
        {
            ciudadanoOro = "Si";            
        }
        else
        {
            ciudadanoOro = "No";
        }
    }//Fin checkCiudadanoOro
    
}//Fin Metodos
