// Author   : Christian Dunn
// Date     : Oct. 27th, 2016
// Purpose  : To create an object that stores the user shape data
//            from last drawn shape that will be utilized through
//            ArrayList
// Compiler : NetBeans 8.1

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

// Class   : Shape_data
// Purpose : To create the shape_data object through given methods
public class ShapeData
    {
        int      x1, y1, x2, y2, t1;        // Integer Variables to store input data for last drawn shape
        Color    c1;                        // Color variable to store the desired color of the shape
        Font     font;
        String   text, fontStr;
        int      size, releaseX, releaseY, strokeSize;
        ArrayList<Integer> getX;
        ArrayList<Integer> getY;
    
        // Default constructor to initialize all integers to zero
        ShapeData()
        {
            x1 = 0;
            y1 = 0;
            x2 = 0;
            y2 = 0;
            t1 = 0;
            strokeSize = 0;
            c1 = new Color(0,0,0);
            getX = new ArrayList();
            getY = new ArrayList();
        } // end default constructor
        
        // Constructor used to set all shape values accordingly to user's input
        ShapeData(int oldx, int oldy, int newx, int newy, int type, Color c, int strokeSize)
        {
             x1 = oldx;
             y1 = oldy;
             x2 = newx;
             y2 = newy;
             t1 = type;
             c1 = c;
             this.strokeSize = strokeSize;
        } // end constructor
        
        public ShapeData(Font font, String text, String fontStr, int size, int releaseX, int releaseY, Color color, int type, int strokeSize) {
            this.font     = font;
            this.text     = text;
            this.fontStr  = fontStr;
            this.size     = size;
            c1            = color;
            this.releaseX = releaseX;
            this.releaseY = releaseY;
            t1 = type;
            this.strokeSize = strokeSize;
        }
        
        public ShapeData(ArrayList<Integer> getX, ArrayList<Integer> getY, int size, Color color, int type, int strokeSize) {
            this.getX = getX;
            this.getY = getY;
            this.size = size;
            this.c1   = color;
            this.t1   = type;
            this.strokeSize = strokeSize;
        }
      
    } // end Shape_data