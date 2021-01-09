/*
    Curso: 6-1 Programación para Redes
    Autores: Sanizaca Bryan, Mirabá Washington Jiménez Anthony
    Fecha:10-01-2021 
 */
package ctruser;

import javax.swing.JOptionPane;
public class seguridad {
      
    frmcontrol login = new frmcontrol();
    String res;
    public void validarUsuario(String usuarios[], String User, String password, int intentos){
        boolean encontrado=false;
       
        for (int i = 0; i < usuarios.length; i++) {
            
            if((usuarios[i].equalsIgnoreCase(User) && usuarios[i+1].equals(password))){
              res="Bienvenido "  + User;
              encontrado = true;
              JOptionPane.showMessageDialog(null, res, "Inicio de Sesión", JOptionPane.INFORMATION_MESSAGE);
              intentos=0;
              login.setIntentos(intentos);
              new frmcontrol().setVisible(true);
              break;
            }        
        } //fin del for
            
    if (encontrado==false){
                
                res = "clave y/o usuario erroneos van" + intentos + "intentos fallidos";
                 JOptionPane.showMessageDialog(null, res, "Inicio de Sesión", JOptionPane.ERROR_MESSAGE);             
            }
            if (intentos > 2 ){
                JOptionPane.showMessageDialog(null, "3 intentos erroneos, se bloquea", "Inicio de Sesión", JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            
            }
    }
}
