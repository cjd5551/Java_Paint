// Author   : Christian Dunn
// Date     : December 8th, 2016
// Purpose  : To create a GUI for the main program and utilize the action 
//            listeners for each button and panel accordingly
// Compiler : NetBeans IDE 8.1

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Stroke;
import java.awt.event.ItemEvent;
import java.awt.image.RenderedImage;
import java.awt.print.Book;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.File;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class Paint_GUI extends javax.swing.JFrame {

    ArrayList<ShapeData> al;
    ArrayList<Integer>   circles_getX;
    ArrayList<Integer>   circles_getY;
    Image                offScreen, bufferGraphics;
    Dimension            appDim;
    int                  clickX, clickY, releaseX, releaseY, type, text_size, strokeSize;  
    boolean              scaled;
    String               text_dis, font_dis;
    CustomDialog         popup; 
    boolean              checked;
    
    public Paint_GUI() {
        initComponents();
        appDim            = Draw_Panel.getSize();
        offScreen         = createImage(appDim.width, appDim.height);
        bufferGraphics    = createImage(appDim.width, appDim.height);
        this.al           = new ArrayList();
        this.circles_getX = new ArrayList();
        this.circles_getY = new ArrayList();
        scaled            = false;
        strokeSize        = 8;
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
    }
    
    @Override
    public void update(Graphics g) {
        paint(g);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Tool_Panel = new javax.swing.JPanel();
        ToolBar = new javax.swing.JToolBar();
        Open_Button = new OpenButton();
        Save_Button = new SaveButton();
        Print_Button = new PrintButton();
        Eraser_Button = new EraserButton();
        TextEditor_Button = new TextButton();
        Pen_Button = new PenButton();
        Circle_Button = new CircleButton();
        Rectangle_Button = new RectangleButton();
        Line_Button = new LineButton();
        Draw_Panel = new javax.swing.JPanel();
        Color_Panel = new javax.swing.JPanel();
        Red_Slider = new javax.swing.JSlider();
        Green_Slider = new javax.swing.JSlider();
        Blue_Slider = new javax.swing.JSlider();
        Color_Display = new javax.swing.JPanel();
        BrushWidth_Panel = new javax.swing.JPanel();
        BrushWidth_Label = new javax.swing.JLabel();
        BrushWidth_Slider = new javax.swing.JSlider();
        MenuBar = new javax.swing.JMenuBar();
        File_Menu = new javax.swing.JMenu();
        Open_MenuItem = new javax.swing.JMenuItem();
        NewCanvas_MenuItem = new javax.swing.JMenuItem();
        Save_MenuItem = new javax.swing.JMenuItem();
        Print_MenuItem = new javax.swing.JMenuItem();
        Exit_MenuItem = new javax.swing.JMenuItem();
        Shape_Menu = new javax.swing.JMenu();
        Circle_MenuItem = new javax.swing.JMenuItem();
        Rectangle_MenuItem = new javax.swing.JMenuItem();
        Line_MenuItem = new javax.swing.JMenuItem();
        Help_Menu = new javax.swing.JMenu();
        Info_MenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Paint");
        setMaximumSize(new java.awt.Dimension(600, 500));
        setMinimumSize(new java.awt.Dimension(600, 500));
        setPreferredSize(new java.awt.Dimension(600, 500));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });

        ToolBar.setBorder(null);
        ToolBar.setFloatable(false);
        ToolBar.setRollover(true);
        ToolBar.setMaximumSize(new java.awt.Dimension(34, 27));
        ToolBar.setMinimumSize(new java.awt.Dimension(34, 27));
        ToolBar.setPreferredSize(new java.awt.Dimension(100, 27));

        Open_Button.setText("     ");
        Open_Button.setToolTipText("Open");
        Open_Button.setFocusable(false);
        Open_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Open_Button.setMaximumSize(new java.awt.Dimension(35, 35));
        Open_Button.setMinimumSize(new java.awt.Dimension(35, 35));
        Open_Button.setPreferredSize(new java.awt.Dimension(35, 35));
        Open_Button.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Open_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Open_ButtonActionPerformed(evt);
            }
        });
        ToolBar.add(Open_Button);

        Save_Button.setText("     ");
        Save_Button.setToolTipText("Save");
        Save_Button.setFocusable(false);
        Save_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Save_Button.setMaximumSize(new java.awt.Dimension(35, 35));
        Save_Button.setMinimumSize(new java.awt.Dimension(35, 35));
        Save_Button.setPreferredSize(new java.awt.Dimension(35, 35));
        Save_Button.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Save_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Save_ButtonActionPerformed(evt);
            }
        });
        ToolBar.add(Save_Button);

        Print_Button.setText("     ");
        Print_Button.setToolTipText("Print");
        Print_Button.setFocusable(false);
        Print_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Print_Button.setMaximumSize(new java.awt.Dimension(35, 35));
        Print_Button.setMinimumSize(new java.awt.Dimension(35, 35));
        Print_Button.setPreferredSize(new java.awt.Dimension(35, 35));
        Print_Button.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Print_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Print_ButtonActionPerformed(evt);
            }
        });
        ToolBar.add(Print_Button);

        Eraser_Button.setText("     ");
        Eraser_Button.setToolTipText("Eraser");
        Eraser_Button.setFocusable(false);
        Eraser_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Eraser_Button.setMaximumSize(new java.awt.Dimension(35, 35));
        Eraser_Button.setMinimumSize(new java.awt.Dimension(35, 35));
        Eraser_Button.setPreferredSize(new java.awt.Dimension(35, 35));
        Eraser_Button.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Eraser_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Eraser_ButtonActionPerformed(evt);
            }
        });
        ToolBar.add(Eraser_Button);

        TextEditor_Button.setText("     ");
        TextEditor_Button.setToolTipText("Text Editor");
        TextEditor_Button.setFocusable(false);
        TextEditor_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        TextEditor_Button.setMaximumSize(new java.awt.Dimension(35, 35));
        TextEditor_Button.setMinimumSize(new java.awt.Dimension(35, 35));
        TextEditor_Button.setPreferredSize(new java.awt.Dimension(35, 35));
        TextEditor_Button.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        TextEditor_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextEditor_ButtonActionPerformed(evt);
            }
        });
        ToolBar.add(TextEditor_Button);

        Pen_Button.setText("     ");
        Pen_Button.setToolTipText("Pen");
        Pen_Button.setFocusable(false);
        Pen_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Pen_Button.setMaximumSize(new java.awt.Dimension(35, 35));
        Pen_Button.setMinimumSize(new java.awt.Dimension(35, 35));
        Pen_Button.setPreferredSize(new java.awt.Dimension(35, 35));
        Pen_Button.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Pen_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pen_ButtonActionPerformed(evt);
            }
        });
        ToolBar.add(Pen_Button);

        Circle_Button.setText("     ");
        Circle_Button.setToolTipText("Circle");
        Circle_Button.setFocusable(false);
        Circle_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Circle_Button.setMaximumSize(new java.awt.Dimension(35, 35));
        Circle_Button.setMinimumSize(new java.awt.Dimension(35, 35));
        Circle_Button.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Circle_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Circle_ButtonActionPerformed(evt);
            }
        });
        ToolBar.add(Circle_Button);

        Rectangle_Button.setText("        ");
        Rectangle_Button.setToolTipText("Rectangle");
        Rectangle_Button.setFocusable(false);
        Rectangle_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Rectangle_Button.setMaximumSize(new java.awt.Dimension(41, 35));
        Rectangle_Button.setMinimumSize(new java.awt.Dimension(41, 35));
        Rectangle_Button.setPreferredSize(new java.awt.Dimension(41, 35));
        Rectangle_Button.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Rectangle_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rectangle_ButtonActionPerformed(evt);
            }
        });
        ToolBar.add(Rectangle_Button);

        Line_Button.setText("     ");
        Line_Button.setToolTipText("Line");
        Line_Button.setFocusable(false);
        Line_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Line_Button.setMaximumSize(new java.awt.Dimension(41, 35));
        Line_Button.setMinimumSize(new java.awt.Dimension(41, 35));
        Line_Button.setPreferredSize(new java.awt.Dimension(41, 35));
        Line_Button.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Line_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Line_ButtonActionPerformed(evt);
            }
        });
        ToolBar.add(Line_Button);

        javax.swing.GroupLayout Tool_PanelLayout = new javax.swing.GroupLayout(Tool_Panel);
        Tool_Panel.setLayout(Tool_PanelLayout);
        Tool_PanelLayout.setHorizontalGroup(
            Tool_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ToolBar, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        Tool_PanelLayout.setVerticalGroup(
            Tool_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tool_PanelLayout.createSequentialGroup()
                .addComponent(ToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        getContentPane().add(Tool_Panel, java.awt.BorderLayout.PAGE_START);

        Draw_Panel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Draw_PanelMouseDragged(evt);
            }
        });
        Draw_Panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Draw_PanelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Draw_PanelMouseReleased(evt);
            }
        });
        Draw_Panel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                Draw_PanelComponentResized(evt);
            }
        });

        javax.swing.GroupLayout Draw_PanelLayout = new javax.swing.GroupLayout(Draw_Panel);
        Draw_Panel.setLayout(Draw_PanelLayout);
        Draw_PanelLayout.setHorizontalGroup(
            Draw_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        Draw_PanelLayout.setVerticalGroup(
            Draw_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 264, Short.MAX_VALUE)
        );

        getContentPane().add(Draw_Panel, java.awt.BorderLayout.CENTER);

        Red_Slider.setMajorTickSpacing(100);
        Red_Slider.setMaximum(255);
        Red_Slider.setMinorTickSpacing(25);
        Red_Slider.setPaintLabels(true);
        Red_Slider.setPaintTicks(true);
        Red_Slider.setToolTipText("Red");
        Red_Slider.setValue(0);
        Red_Slider.setPreferredSize(new java.awt.Dimension(100, 45));
        Red_Slider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Red_SliderStateChanged(evt);
            }
        });
        Color_Panel.add(Red_Slider);

        Green_Slider.setMajorTickSpacing(100);
        Green_Slider.setMaximum(255);
        Green_Slider.setMinorTickSpacing(25);
        Green_Slider.setPaintLabels(true);
        Green_Slider.setPaintTicks(true);
        Green_Slider.setToolTipText("Green");
        Green_Slider.setValue(0);
        Green_Slider.setPreferredSize(new java.awt.Dimension(100, 45));
        Green_Slider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Green_SliderStateChanged(evt);
            }
        });
        Color_Panel.add(Green_Slider);

        Blue_Slider.setMajorTickSpacing(100);
        Blue_Slider.setMaximum(255);
        Blue_Slider.setMinorTickSpacing(25);
        Blue_Slider.setPaintLabels(true);
        Blue_Slider.setPaintTicks(true);
        Blue_Slider.setToolTipText("Blue");
        Blue_Slider.setValue(0);
        Blue_Slider.setPreferredSize(new java.awt.Dimension(100, 45));
        Blue_Slider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Blue_SliderStateChanged(evt);
            }
        });
        Color_Panel.add(Blue_Slider);

        Color_Display.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Color_Display.setMinimumSize(new java.awt.Dimension(35, 35));
        Color_Display.setPreferredSize(new java.awt.Dimension(75, 45));

        javax.swing.GroupLayout Color_DisplayLayout = new javax.swing.GroupLayout(Color_Display);
        Color_Display.setLayout(Color_DisplayLayout);
        Color_DisplayLayout.setHorizontalGroup(
            Color_DisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 69, Short.MAX_VALUE)
        );
        Color_DisplayLayout.setVerticalGroup(
            Color_DisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        Color_Panel.add(Color_Display);

        BrushWidth_Panel.setMaximumSize(new java.awt.Dimension(100, 65));
        BrushWidth_Panel.setMinimumSize(new java.awt.Dimension(100, 65));
        BrushWidth_Panel.setPreferredSize(new java.awt.Dimension(100, 65));
        BrushWidth_Panel.setLayout(new java.awt.BorderLayout());

        BrushWidth_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BrushWidth_Label.setText("Brush Width:");
        BrushWidth_Panel.add(BrushWidth_Label, java.awt.BorderLayout.PAGE_START);

        BrushWidth_Slider.setMajorTickSpacing(50);
        BrushWidth_Slider.setMinorTickSpacing(10);
        BrushWidth_Slider.setPaintLabels(true);
        BrushWidth_Slider.setPaintTicks(true);
        BrushWidth_Slider.setToolTipText("Brush Width");
        BrushWidth_Slider.setValue(12);
        BrushWidth_Slider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                BrushWidth_SliderStateChanged(evt);
            }
        });
        BrushWidth_Panel.add(BrushWidth_Slider, java.awt.BorderLayout.CENTER);

        Color_Panel.add(BrushWidth_Panel);

        getContentPane().add(Color_Panel, java.awt.BorderLayout.PAGE_END);

        File_Menu.setText("File");

        Open_MenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        Open_MenuItem.setText("Open");
        Open_MenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Open_MenuItemActionPerformed(evt);
            }
        });
        File_Menu.add(Open_MenuItem);

        NewCanvas_MenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        NewCanvas_MenuItem.setText("New Canvas");
        NewCanvas_MenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewCanvas_MenuItemActionPerformed(evt);
            }
        });
        File_Menu.add(NewCanvas_MenuItem);

        Save_MenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        Save_MenuItem.setText("Save");
        Save_MenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Save_MenuItemActionPerformed(evt);
            }
        });
        File_Menu.add(Save_MenuItem);

        Print_MenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        Print_MenuItem.setText("Print");
        Print_MenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Print_MenuItemActionPerformed(evt);
            }
        });
        File_Menu.add(Print_MenuItem);

        Exit_MenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_BACK_SPACE, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        Exit_MenuItem.setText("Exit");
        Exit_MenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exit_MenuItemActionPerformed(evt);
            }
        });
        File_Menu.add(Exit_MenuItem);

        MenuBar.add(File_Menu);

        Shape_Menu.setText("Shape");

        Circle_MenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        Circle_MenuItem.setText("Circle");
        Shape_Menu.add(Circle_MenuItem);

        Rectangle_MenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        Rectangle_MenuItem.setText("Rectangle");
        Shape_Menu.add(Rectangle_MenuItem);

        Line_MenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        Line_MenuItem.setText("Line");
        Shape_Menu.add(Line_MenuItem);

        MenuBar.add(Shape_Menu);

        Help_Menu.setText("Help");

        Info_MenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        Info_MenuItem.setText("Info");
        Help_Menu.add(Info_MenuItem);

        MenuBar.add(Help_Menu);

        setJMenuBar(MenuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Eraser_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Eraser_ButtonActionPerformed
        // TODO add your handling code here:
        int width = Draw_Panel.getWidth();
        int height = Draw_Panel.getHeight();
        bufferGraphics = Draw_Panel.createImage(width, height+75);
        offScreen = Draw_Panel.createImage(width, height+75);
        Graphics fgg = offScreen.getGraphics();
        fgg.drawImage(bufferGraphics, 0, 0, null);
        Graphics g = Draw_Panel.getGraphics();
        g.drawImage(offScreen, 0, 0, null);
        al.clear();
        circles_getX.clear();
        circles_getY.clear();
    }//GEN-LAST:event_Eraser_ButtonActionPerformed

    private void Red_SliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Red_SliderStateChanged
        // TODO add your handling code here:
        Color_Display.setBackground(new Color(Red_Slider.getValue(), Green_Slider.getValue(), Blue_Slider.getValue()));
    }//GEN-LAST:event_Red_SliderStateChanged

    private void Green_SliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Green_SliderStateChanged
        // TODO add your handling code here:
        Color_Display.setBackground(new Color(Red_Slider.getValue(), Green_Slider.getValue(), Blue_Slider.getValue()));
    }//GEN-LAST:event_Green_SliderStateChanged

    private void Blue_SliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Blue_SliderStateChanged
        // TODO add your handling code here:
        Color_Display.setBackground(new Color(Red_Slider.getValue(), Green_Slider.getValue(), Blue_Slider.getValue()));
    }//GEN-LAST:event_Blue_SliderStateChanged

    private void Circle_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Circle_ButtonActionPerformed
        // TODO add your handling code here:
        type = 0;
    }//GEN-LAST:event_Circle_ButtonActionPerformed

    private void Rectangle_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rectangle_ButtonActionPerformed
        // TODO add your handling code here:
        type = 1;
    }//GEN-LAST:event_Rectangle_ButtonActionPerformed

    private void Line_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Line_ButtonActionPerformed
        // TODO add your handling code here:
        type = 2;
    }//GEN-LAST:event_Line_ButtonActionPerformed

    private void Draw_PanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Draw_PanelMousePressed
        // TODO add your handling code here:
        clickX = evt.getX();
        clickY = evt.getY();
    }//GEN-LAST:event_Draw_PanelMousePressed

    private void Draw_PanelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Draw_PanelMouseReleased
        // TODO add your handling code here:
        Graphics buffer = bufferGraphics.getGraphics();
        buffer.drawImage(offScreen, 0, 0, null);
        releaseX = evt.getX();  
        releaseY = evt.getY();
        if ((type != 3) && (type != 4)) 
            al.add(new ShapeData(clickX, clickY, releaseX, releaseY, type, new Color(
                    Red_Slider.getValue(), Green_Slider.getValue(), Blue_Slider.getValue()), strokeSize)); 
        else if (type == 3) 
            al.add(new ShapeData(popup.font, popup.text, popup.fontStr, popup.size, 
                            releaseX, releaseY, 
                            new Color(Red_Slider.getValue(), Green_Slider.getValue(), Blue_Slider.getValue()), type, strokeSize));
        else if (type == 4) {
            al.add(new ShapeData(circles_getX, circles_getY, 10, 
                        new Color(Red_Slider.getValue(), Green_Slider.getValue(), Blue_Slider.getValue()),
                        type, strokeSize));
        }
    }//GEN-LAST:event_Draw_PanelMouseReleased

    private void Draw_PanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Draw_PanelMouseDragged
        // TODO add your handling code here:
        Graphics2D offBuffer = (Graphics2D)offScreen.getGraphics();
        Graphics2D bufferBehind = (Graphics2D)bufferGraphics.getGraphics();
        offBuffer.setColor(new Color(Red_Slider.getValue(), Green_Slider.getValue(), Blue_Slider.getValue()));
        bufferBehind.setColor(new Color(Red_Slider.getValue(), Green_Slider.getValue(), Blue_Slider.getValue()));
        offBuffer.setStroke(new BasicStroke(strokeSize));
        bufferBehind.setStroke(new BasicStroke(strokeSize));
        offBuffer.drawImage(bufferGraphics, 0, 0, null);
        releaseX = evt.getX();  
        releaseY = evt.getY();
        switch(type)
            {
                case 0: drawCircle(clickX, clickY, releaseX, releaseY, offBuffer); break;
                case 1: drawRect(clickX, clickY, releaseX, releaseY, offBuffer); break;
                case 2: offBuffer.drawLine(clickX, clickY, releaseX, releaseY); break; 
                case 3: offBuffer.setFont(popup.font);
                        offBuffer.drawString(popup.text, releaseX, releaseY);
                        break;
                case 4: bufferBehind.fillOval(evt.getX(), evt.getY(), strokeSize, strokeSize);
                        offBuffer.fillOval(evt.getX(), evt.getY(), strokeSize, strokeSize);
                        circles_getX.add(evt.getX());
                        circles_getY.add(evt.getY());
                        break;
                default: break;
            }
        Graphics buffer = Draw_Panel.getGraphics();
        buffer.drawImage(offScreen, 0, 0, null);
    }//GEN-LAST:event_Draw_PanelMouseDragged

    private void Draw_PanelComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_Draw_PanelComponentResized
        // TODO add your handling code here:
        Dimension newDim     = Draw_Panel.getSize();
        Dimension newBuffer  = resizedImage(bufferGraphics, newDim);
        offScreen      = Draw_Panel.createImage(newBuffer.width, newBuffer.height);
        bufferGraphics = Draw_Panel.createImage(newBuffer.width, newBuffer.height);
        scaled = true;
        if (scaled == true) {
            Graphics2D buffer = (Graphics2D)offScreen.getGraphics();
            Graphics2D buffer2 = (Graphics2D)bufferGraphics.getGraphics();
            for(int i = 0; i < al.size(); i++) {
                buffer.setColor(al.get(i).c1);
                buffer.setStroke(new BasicStroke(al.get(i).strokeSize));
                switch(al.get(i).t1) {
                    case 0: drawCircle(al.get(i).x1, al.get(i).y1, al.get(i).x2, al.get(i).y2, buffer); break;
                    case 1: drawRect(al.get(i).x1, al.get(i).y1, al.get(i).x2, al.get(i).y2, buffer); break;
                    case 2: buffer.drawLine(al.get(i).x1, al.get(i).y1, al.get(i).x2, al.get(i).y2); break; 
                    case 3: buffer.setFont(al.get(i).font);
                            buffer.drawString(al.get(i).text, releaseX, releaseY);
                            break;
                    case 4: for (int j = 0; j < al.get(i).getX.size(); j++) {
                                buffer.fillOval(al.get(i).getX.get(j), al.get(i).getY.get(j), al.get(i).strokeSize, al.get(i).strokeSize);
                            }
                            break;
                    default: break;
                }
            }
            buffer2.drawImage(offScreen, 0, 0, null);
            scaled = false;
        }
    }//GEN-LAST:event_Draw_PanelComponentResized

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseReleased

    private void Open_MenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Open_MenuItemActionPerformed
        // TODO add your handling code here:
        this.openFile();
    }//GEN-LAST:event_Open_MenuItemActionPerformed

    private void Save_MenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Save_MenuItemActionPerformed
        // TODO add your handling code here:
        this.saveFile();
    }//GEN-LAST:event_Save_MenuItemActionPerformed

    private void Print_MenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Print_MenuItemActionPerformed
        // TODO add your handling code here:
        this.printFile();
    }//GEN-LAST:event_Print_MenuItemActionPerformed

    private void Exit_MenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit_MenuItemActionPerformed
        // TODO add your handling code here:
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_Exit_MenuItemActionPerformed

    private void TextEditor_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextEditor_ButtonActionPerformed
        // TODO add your handling code here:
        type  = 3;
        popup = new CustomDialog(this, true);
        popup.setVisible(true);
    }//GEN-LAST:event_TextEditor_ButtonActionPerformed

    private void Pen_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pen_ButtonActionPerformed
        // TODO add your handling code here:
        type = 4;
    }//GEN-LAST:event_Pen_ButtonActionPerformed

    private void BrushWidth_SliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_BrushWidth_SliderStateChanged
        // TODO add your handling code here:
        strokeSize = BrushWidth_Slider.getValue();
    }//GEN-LAST:event_BrushWidth_SliderStateChanged

    private void Open_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Open_ButtonActionPerformed
        // TODO add your handling code here:
        this.openFile();
    }//GEN-LAST:event_Open_ButtonActionPerformed

    private void Save_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Save_ButtonActionPerformed
        // TODO add your handling code here:
        this.saveFile();
    }//GEN-LAST:event_Save_ButtonActionPerformed

    private void Print_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Print_ButtonActionPerformed
        // TODO add your handling code here:
        this.printFile();
    }//GEN-LAST:event_Print_ButtonActionPerformed

    private void NewCanvas_MenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewCanvas_MenuItemActionPerformed
        // TODO add your handling code here:
        int width = Draw_Panel.getWidth();
        int height = Draw_Panel.getHeight();
        bufferGraphics = Draw_Panel.createImage(width, height+75);
        offScreen = Draw_Panel.createImage(width, height+75);
        Graphics fgg = offScreen.getGraphics();
        fgg.drawImage(bufferGraphics, 0, 0, null);
        Graphics g = Draw_Panel.getGraphics();
        g.drawImage(offScreen, 0, 0, null);
        al.clear();
        circles_getX.clear();
        circles_getY.clear();
    }//GEN-LAST:event_NewCanvas_MenuItemActionPerformed
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Paint_GUI().setVisible(true);
            }
        });
    }

    public Dimension resizedImage(Image image, Dimension newImage) {
        int newWidth = Math.max(image.getWidth(null), newImage.width);
        int newHeight = Math.max(image.getHeight(null), newImage.height);
        Dimension combined = new Dimension(newWidth, newHeight);
        return combined;
    }
    
    // Method  : drawCircle
    // Purpose : Used to draw image to image depending on old and new x/y coordinates
    public void drawCircle(int oldx1, int oldy1, int newx1, int newy1, Graphics g)
    {
        if((newx1 < oldx1) && (oldy1 < newy1))
            { g.drawOval(newx1, oldy1, oldx1-newx1, newy1-oldy1);} // end if
        if((newy1 < oldy1) && (oldx1 < newx1))
            { g.drawOval(oldx1, newy1, newx1-oldx1, oldy1-newy1);} // end if
        if((newx1 < oldx1) && (newy1 < oldy1))
            { g.drawOval(newx1, newy1, oldx1-newx1, oldy1-newy1);} // end if
        if((oldx1 < newx1) && (oldy1 < newy1))
            { g.drawOval(oldx1, oldy1, newx1-oldx1, newy1-oldy1);} // end if
    } // end drawCircle
    
    // Method  : drawRect
    // Purpose : Used to draw image to image depending on old and new x/y coordinates
    public void drawRect(int oldx1, int oldy1, int newx1, int newy1, Graphics g)
    {
        if((newx1 < oldx1) && (oldy1 < newy1))
            { g.drawRect(newx1, oldy1, oldx1-newx1, newy1-oldy1);} // end if
        if((newy1 < oldy1) && (oldx1 < newx1))
            { g.drawRect(oldx1, newy1, newx1-oldx1, oldy1-newy1);} // end if
        if((newx1 < oldx1) && (newy1 < oldy1))
            { g.drawRect(newx1, newy1, oldx1-newx1, oldy1-newy1);} // end if
        if((oldx1 < newx1) && (oldy1 < newy1))
            { g.drawRect(oldx1, oldy1, newx1-oldx1, newy1-oldy1);} // end if
    } // end drawRect
    
    public void printFile() {
        PrinterJob print = PrinterJob.getPrinterJob();
        PageFormat format = print.pageDialog(new PageFormat());
        if (print.printDialog()) {
            Book b = new Book();
            b.append((Printable)this.bufferGraphics, format);
            print.setPageable(b);
            try { print.print(); }
                catch(PrinterException ex) { ex.printStackTrace(); }
        }
    }
    
    public void openFile() {
        JFileChooser fileChoice = new JFileChooser(".");
        OpenFilter   filter     = new OpenFilter();
        fileChoice.setFileFilter(filter);
        if(fileChoice.showOpenDialog(null) == 0) {
            try {
                File getFile = fileChoice.getSelectedFile();
                this.bufferGraphics = ImageIO.read(getFile);
                this.repaint();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
    
    public void saveFile() {
        JFileChooser fileChoice = new JFileChooser(".");
        OpenFilter   filter     = new OpenFilter();
        fileChoice.setFileFilter(filter);
        if (fileChoice.showSaveDialog(null) == 0) {
            try {
                File getFile = fileChoice.getSelectedFile();
                ImageIO.write((RenderedImage)((Object)this.bufferGraphics),"png", getFile);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSlider Blue_Slider;
    private javax.swing.JLabel BrushWidth_Label;
    private javax.swing.JPanel BrushWidth_Panel;
    private javax.swing.JSlider BrushWidth_Slider;
    private CircleButton Circle_Button;
    private javax.swing.JMenuItem Circle_MenuItem;
    private javax.swing.JPanel Color_Display;
    private javax.swing.JPanel Color_Panel;
    private javax.swing.JPanel Draw_Panel;
    private EraserButton Eraser_Button;
    private javax.swing.JMenuItem Exit_MenuItem;
    private javax.swing.JMenu File_Menu;
    private javax.swing.JSlider Green_Slider;
    private javax.swing.JMenu Help_Menu;
    private javax.swing.JMenuItem Info_MenuItem;
    private LineButton Line_Button;
    private javax.swing.JMenuItem Line_MenuItem;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenuItem NewCanvas_MenuItem;
    private OpenButton Open_Button;
    private javax.swing.JMenuItem Open_MenuItem;
    private PenButton Pen_Button;
    private PrintButton Print_Button;
    private javax.swing.JMenuItem Print_MenuItem;
    private RectangleButton Rectangle_Button;
    private javax.swing.JMenuItem Rectangle_MenuItem;
    private javax.swing.JSlider Red_Slider;
    private SaveButton Save_Button;
    private javax.swing.JMenuItem Save_MenuItem;
    private javax.swing.JMenu Shape_Menu;
    private TextButton TextEditor_Button;
    private javax.swing.JToolBar ToolBar;
    private javax.swing.JPanel Tool_Panel;
    // End of variables declaration//GEN-END:variables
}
