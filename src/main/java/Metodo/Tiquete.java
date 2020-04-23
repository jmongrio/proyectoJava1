package Metodo;

public class Tiquete 
{
    //Formato de tiquete Destino,Asiento ejemplo(PNA00).
    
    //Calcula el costo del boleto.
    public double costoBoleto(int selecDestino, int edad)
    {   
        double costoBoleto = 0;
        //double boletoNeto = 0;
        
        if(selecDestino == 1) //Panamá.
        {
            costoBoleto = 100;
            
        }
        else
        {
            if(selecDestino == 2)  //Nicaragua.
            {
                costoBoleto = 95;
            
            }//Fin if.
            
        }//Fin if.
        
        if(edad <= 14)
        {
            costoBoleto = (costoBoleto - (costoBoleto * 0.10));
        }
        else
        {
            if(edad > 65)
            {
                costoBoleto = (costoBoleto - (costoBoleto * 0.35));
               
            }//Fin if.

        }//Fin if.
        return costoBoleto;
        
    }//Fin costoBoleto.
    
    //Generación de tiquete.
    public String generaTiquete(String destino, String asiento)
    {     
        String Destino;
        String Tiquete = "";
        
        if(destino == "nicaragua")
        {
            Destino = "NCA";
            Tiquete = (Destino + asiento);

        }
        else
        {
            if(destino == "panamá")
            {
                Destino = "PNA";
                Tiquete = (Destino + (String.valueOf(asiento)));
                
            }//Fin If.
            
        }//Fin if.
        return Tiquete;
        
    }//Fin generaTiquete.
    
}//Fin Tiquete.
