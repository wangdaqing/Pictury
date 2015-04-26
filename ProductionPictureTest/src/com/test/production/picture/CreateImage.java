package com.test.production.picture;
import java.awt.*;   
import java.awt.image.*;   
import java.io.*;   
import javax.imageio.*;   
import java.awt.font.*;   
import java.awt.geom.*;   
  
public class CreateImage    
{   
    public static void main(String[] args) throws Exception   
    {   
        int width = 1063;   
        int height = 650;   
           
           
        BufferedImage bi = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);   
        Graphics2D g2 = (Graphics2D)bi.getGraphics();   
        g2.setBackground(new Color(232, 235, 242));   
        g2.clearRect(0, 0, width, height);   
        Image image=ImageIO.read(new File("G:\\psb.jpg"));
        g2.drawImage(image, 0, 14, null);
        Font font=new Font("Serif", Font.BOLD, 35);
        g2.setFont(font);
        g2.setColor(Color.BLACK);
        g2.drawString("test", 100, 100);
          
        new TiffOutput(bi, "G:\\test.JPEG", 300);
    }   
}   