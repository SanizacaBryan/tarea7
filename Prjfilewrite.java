/*
    Curso: 6-1 Programación para Redes
    Autores: Sanizaca Bryan, Mirabá Washington Jiménez Anthony
    Fecha:12-01-2021 
 */
package prjfilewrite;
import java.io.FileWriter;
import java.io.IOException;
public class Prjfilewrite {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
         FileWriter fw = null;
        String arr[]={"Juan","Ana","Lupita","Carmela","Flor","Pepe","Paz","Modo_caracter"};
        try
        {    
        fw=new FileWriter ("c:/cls/nombres.txt");
        for(String temp:arr)
            {
            fw.write(temp+",");   
            }
            fw.close();
        }catch (IOException e)
       
        {
            System.out.println("Error: "+e.getMessage ());   
        }
        
              System.out.println("Operacion sin excepciones");   
    }
    }
    
    

        
        
        
        
        
    
    

