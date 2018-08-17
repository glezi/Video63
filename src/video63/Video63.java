/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video63;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author gleez
 */
public class Video63 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MarcoImagen mimarco = new MarcoImagen(); 
        mimarco.setVisible(true); 
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
class MarcoImagen extends JFrame {
    public MarcoImagen(){
        
        setTitle("Marco con Imagen"); 
        setBounds(750,300,300,200); 
        LaminaConImagen milamina= new LaminaConImagen(); 
        add(milamina); 
    }
}

class LaminaConImagen extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g); 
        
        File miimagen= new File("src/graficos/cerdito.png"); 
       try{
        
       imagen=ImageIO.read(miimagen);  
    }catch(IOException e){
        System.out.println("La imagen no se necuentra");
    }
    
    }
    private Image imagen; 
    
}