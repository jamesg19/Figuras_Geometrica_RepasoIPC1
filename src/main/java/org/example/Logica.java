

package org.example;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * 
 * @author James Gramajo 
 */
public class Logica {

    public Logica() {
        
    }
    
    public void calcular(String figuraSeleccionada,double valor1,double valor2,JLabel labelResultado){
        switch(figuraSeleccionada){
            case "Cuadrado":
                Cuadrado objeto1=new Cuadrado("",valor1);
                labelResultado.setText("RESULTADO: "+objeto1.calcularArea());
                break;
            case "Circulo":
                Circulo objeto2=new Circulo("",valor1);
                labelResultado.setText("RESULTADO: "+objeto2.calcularArea());
                break;
            case "Triangulo":
                Triangulo objeto3=new Triangulo(valor1,valor2,"");
                labelResultado.setText("RESULTADO: "+objeto3.calcularArea());
                break;
            case "Rectangulo":
                Rectangulo objeto4=new Rectangulo(valor1,valor2,"");
                labelResultado.setText("RESULTADO: "+objeto4.calcularArea());
                
                break;
                
            
        }
    }
    
    
    public void mostrarCampos(String figuraSeleccionada, JTextField campo1,JTextField campo2, JLabel labelCampo1,JLabel labelCampo2){
        switch(figuraSeleccionada){
            case "Cuadrado":
                labelCampo1.setText("Lado: ");
                labelCampo2.setText("0");
                campo1.setVisible(true);
                campo2.setVisible(false);
                
                break;
            case "Circulo":
                campo1.setVisible(true);
                campo2.setVisible(false);
                labelCampo1.setText("Radio: ");
                labelCampo2.setText("");
                break;
            case "Triangulo":
                campo1.setVisible(true);
                campo2.setVisible(true);
                labelCampo1.setText("Base: ");
                labelCampo2.setText("Altura: ");
                break;
            case "Rectangulo":
                campo1.setVisible(true);
                campo2.setVisible(true);
                labelCampo1.setText("Lado X: ");
                labelCampo2.setText("Lado Y: ");
                break;
                
            
        }
    }
    
    public void mostrarImagen(String figuraSeleccionada,JLabel miLabel){
        
        switch(figuraSeleccionada){
            case "Cuadrado":
                showImg("cuadrado",miLabel);
                
                break;
            case "Circulo":
                showImg("circulo",miLabel);
                break;
            case "Triangulo":
                showImg("triangulo",miLabel);
                break;
            case "Rectangulo":
                showImg("rectangulo",miLabel);
                break;
                
            
        }
        
    }
    
    private void showImg(String nombreFigura,JLabel miLabel){
        ImageIcon imagenIcono= new ImageIcon("src\\main\\java\\imagenes\\"+nombreFigura+".png");
        
        Image imagen =imagenIcono.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        
        ImageIcon imagenFinal=new ImageIcon(imagen);
        
        miLabel.setIcon(imagenFinal);
        
    }
    
    
    
    

}
