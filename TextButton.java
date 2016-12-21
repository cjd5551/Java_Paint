
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

public class TextButton extends JButton 
    {
        @Override
        public void paint(Graphics g)
        {
            try {
                super.paint(g);
                BufferedImage buttonIcon = ImageIO.read(new File("TextIcon.png"));
                g.drawImage(buttonIcon,3,3,null);
                this.setBorder(BorderFactory.createEmptyBorder());
                this.setContentAreaFilled(false);
                this.setPreferredSize(new Dimension(40,35));
            } catch (IOException ex) {
                Logger.getLogger(OpenButton.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }// end Oval