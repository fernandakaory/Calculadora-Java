
package Model;

import static View.Inicio_GUI.resul_txt;
import static View.Inicio_GUI.v1_txt;
import static View.Inicio_GUI.v2_txt;
import java.awt.Color;
import javax.swing.JOptionPane;

public class Funcoes_DAO {
    
     public static void somar(){
        String y = View.Inicio_GUI.v1_txt.getText();
        double val1 = Double.parseDouble(y);
        
        y = View.Inicio_GUI.v2_txt.getText();
        double val2 = Double.parseDouble(y);
        
        double res = val1 + val2;
        
        resul_txt.setText(String.valueOf(res));          
        resul_txt.setBackground(new Color(255,240,245));
        v1_txt.setBackground(new Color(255,240,245));
        v2_txt.setBackground(new Color(255,240,245));
    }
     
    public static void subtrair(){
        String y = View.Inicio_GUI.v1_txt.getText();
        double val1 = Double.parseDouble(y);
        
        y = View.Inicio_GUI.v2_txt.getText();
        double val2 = Double.parseDouble(y);
        
        double res = val1 - val2;
        
        resul_txt.setText(String.valueOf(res));          
        resul_txt.setBackground(new Color(255,240,245));
        v1_txt.setBackground(new Color(255,240,245));
        v2_txt.setBackground(new Color(255,240,245));
    }
    
    public static void dividir(){
        String y = View.Inicio_GUI.v1_txt.getText();
        double val1 = Double.parseDouble(y);
        
        y = View.Inicio_GUI.v2_txt.getText();
        double val2 = Double.parseDouble(y);
        
        double res = val1 / val2;
        try {
            resul_txt.setText(String.valueOf(res));          
            resul_txt.setBackground(new Color(255,240,245));
            v1_txt.setBackground(new Color(255,240,245));
            v2_txt.setBackground(new Color(255,240,245));
        } catch(Exception e){
            JOptionPane.showInternalMessageDialog(null, "Insira um valor válido!!!!");
        }
    }
    
    public static void multiplicar(){
        String y = View.Inicio_GUI.v1_txt.getText();
        double val1 = Double.parseDouble(y);
        
        y = View.Inicio_GUI.v2_txt.getText();
        double val2 = Double.parseDouble(y);
        
        double res = val1 * val2;
        
        resul_txt.setText(String.valueOf(res));          
        resul_txt.setBackground(new Color(255,240,245));
        v1_txt.setBackground(new Color(255,240,245));
        v2_txt.setBackground(new Color(255,240,245));
    }
    
    public static void limpar(){
        
        v1_txt.setText("");
        v2_txt.setText("");
        resul_txt.setText("");
        resul_txt.setBackground(Color.white);
        v1_txt.setBackground(Color.white);
        v2_txt.setBackground(Color.white);
    }
}
