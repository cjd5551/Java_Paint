// Author   : Christian Dunn  
// Date     : December 8th, 2016
// Purpose  : To create a subclass of JButton that adds desired graphics to button
// Compiler : NetBeans IDE 8.1

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JButton;

// Class   : CircleButton
// Purpose : To create a class that extends JButton to display specified graphics as button
public class CircleButton extends JButton 
    {
        @Override
        public void paint(Graphics g)
        {
            try {
                super.paint(g);
                BufferedImage buttonIcon = ImageIO.read(new File("CircleIcon.png"));
                g.drawImage(buttonIcon,3,3,null);
                this.setBorder(BorderFactory.createEmptyBorder());
                this.setContentAreaFilled(false);
                this.setPreferredSize(new Dimension(35,35));
            } catch (IOException ex) {
                Logger.getLogger(OpenButton.class.getName()).log(Level.SEVERE, null, ex);
            } // end try-catch
            
        } // end paint()
    }// end Circle