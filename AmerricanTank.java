//kuchenthal 
// lab 6 drawing shapes to form a picture

import javax.swing.JApplet;
import javax.swing.JOptionPane;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Polygon;

public class AmerricanTank extends JApplet
{
   public void paint(Graphics g)
    {
    super.paint(g);
    
    Color Army = new Color (150, 200, 100);
    
   g.setColor(Color.BLUE);
   g.fillRect(0,0,1000,1000);
   
   
    int sX = 200;
    int sY = 300;
    
    //turret
    
    g.setColor(Army);
    g.fillOval(sX,sY,90,35);
    g.fillRect(sX+85,sY+13,50,8);
    
    //body
    
    g.fillRect(sX-35,sY+30,175,40);
   
   //track
    g.setColor(Color.LIGHT_GRAY);
    g.fillOval(sX-45,sY+40,195,45);
   
    //wheels
    g.setColor(Color.RED);
    g.drawOval(sX-45,sY+40,195,45);
    g.setColor(Color.WHITE);
    g.fillOval(sX-30,sY+48,30,30);
    g.setColor(Color.BLUE);
    g.fillOval(sX,sY+43,40,40);
    g.setColor(Color.RED);
    g.fillOval(sX+40,sY+43,40,41);
    g.setColor(Color.WHITE);
    g.fillOval(sX+80,sY+48,32,33);
    g.setColor(Color.BLUE);
    g.fillOval(sX+112,sY+50,26,26);
    
    Polygon star = new Polygon( );
    star.addPoint(sX+40,sY+10);
    star.addPoint(sX+50,sY+20);
    star.addPoint(sX+60,sY+20);
    star.addPoint(sX+50,sY+30);
    star.addPoint(sX+57,sY+30);
    star.addPoint(sX+52,sY+33);
    star.addPoint(sX+50,sY);
    g.fillPolygon(star);
    
    g.setColor(Color.RED);
    g.drawString("MEEEEERICA",sX+10,sY);
    
    
    }
}