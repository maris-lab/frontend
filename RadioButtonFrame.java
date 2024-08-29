// Fig. 12.19: RadioButtonFrame.java
// Creating radio buttons using ButtonGroup and JRadioButton.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RadioButtonFrame extends JFrame 
{
   private JTextField textField;

   private Font plainFont; 
   private Font boldFont; 
   private Font italicFont;
   private Font boldItalicFont;

   private Color bluecolor; 
   private Color redcolor; 
   private Color yellowcolor;
   private Color blackcolor;

   private JRadioButton plainJRadioButton;
   private JRadioButton boldJRadioButton; 
   private JRadioButton italicJRadioButton; 
   private JRadioButton boldItalicJRadioButton;
   private ButtonGroup radioGroup; 

   private JRadioButton blueJRadioButton;
   private JRadioButton redJRadioButton; 
   private JRadioButton yellowJRadioButton; 
   private JRadioButton blackJRadioButton;
   private ButtonGroup colorradioGroup; 
   
   
   
   public RadioButtonFrame()
   {
      super("RadioButton Test");
      setLayout(new FlowLayout()); 

      textField = new JTextField("Watch the font style change", 25);
      add(textField); 

      
      plainJRadioButton = new JRadioButton("Plain", true);
      boldJRadioButton = new JRadioButton("Bold", false);
      italicJRadioButton = new JRadioButton("Italic", false);
      boldItalicJRadioButton = new JRadioButton("Bold/Italic", false);
      
      add(plainJRadioButton);
      add(boldJRadioButton); 
      add(italicJRadioButton); 
      add(boldItalicJRadioButton);
      
      radioGroup = new ButtonGroup(); 
      radioGroup.add(plainJRadioButton); 
      radioGroup.add(boldJRadioButton); 
      radioGroup.add(italicJRadioButton); 
      radioGroup.add(boldItalicJRadioButton); 
      
      blueJRadioButton = new JRadioButton("Blue", false);
      redJRadioButton = new JRadioButton("Red", false);
      yellowJRadioButton = new JRadioButton("Yellow", false);
      blackJRadioButton = new JRadioButton("Black", true);
      
      add(blueJRadioButton);
      add(redJRadioButton); 
      add(yellowJRadioButton); 
      add(blackJRadioButton); 

      colorradioGroup = new ButtonGroup(); 
      colorradioGroup.add(blueJRadioButton); 
      colorradioGroup.add(redJRadioButton); 
      colorradioGroup.add(yellowJRadioButton); 
      colorradioGroup.add(blackJRadioButton); 

      
      plainFont = new Font("Serif", Font.PLAIN, 14);
      boldFont = new Font("Serif", Font.BOLD, 14);
      italicFont = new Font("Serif", Font.ITALIC, 14);
      boldItalicFont = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
      textField.setFont(plainFont);

      bluecolor = new Color(0,0,255);
      redcolor = new Color(255,0,0);
      yellowcolor = new Color(255,255,0);
      blackcolor = new Color(0,0,0);

      
      plainJRadioButton.addItemListener(
         new RadioButtonHandler(plainFont));
      boldJRadioButton.addItemListener(
         new RadioButtonHandler(boldFont));
      italicJRadioButton.addItemListener(
         new RadioButtonHandler(italicFont));
      boldItalicJRadioButton.addItemListener(
         new RadioButtonHandler(boldItalicFont));

         blueJRadioButton.addItemListener(
            new ColorButtonHandler(bluecolor));
         redJRadioButton.addItemListener(
            new ColorButtonHandler(redcolor));
         yellowJRadioButton.addItemListener(
            new ColorButtonHandler(yellowcolor));
         blackJRadioButton.addItemListener(
            new ColorButtonHandler(blackcolor));
   } 

   
   private class RadioButtonHandler implements ItemListener // classe dentro de uma classe 
   {
      private Font font;

      public RadioButtonHandler(Font f)
      {
         font = f; 
      } 
      private class ColorButtonHandler implements ItemListener
      {
         private Color color;

         public ColorRadioButtonHandler(Font c) {
            
            color = c;
         }
      }
      
      @Override
      public void itemStateChanged(ItemEvent event)
      {
         textField.setFont(font); 
      } 
   } 
} // end class RadioButtonFrame 

/**************************************************************************************************************************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and               
 * Pearson Education, Inc. All Rights Reserved.                           
 *                                                                        
 * // a variavel da classe vai receber o prarametro      *
 * //  new RadioButtonHandler(plainFont));  criacao de um novo objeto        
 * //private class RadioButtonHandler implements ItemListener: classe dentro de uma classe      
 *  // @Override: incluir a açao      
 *     
 *       
 *************************************************************************************************************************************************************************************/
