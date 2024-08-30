// Fig. 12.21: ComboBoxFrame.java
// JComboBox that displays a list of image names.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class ComboBoxFrame extends JFrame 
{
   private final JComboBox<String> imagesJComboBox; 
   private final JLabel label; 

   private static final String[] names = 
      {"bug1.gif", "bug2.gif",  "travelbug.gif", "buganim.gif", "images.png"};
   private final Icon[] icons = { 
      new ImageIcon(getClass().getResource(names[0])),
      new ImageIcon(getClass().getResource(names[1])), 
      new ImageIcon(getClass().getResource(names[2])),
      new ImageIcon(getClass().getResource(names[3])),
      new ImageIcon(getClass().getResource(names[4]))};

   
   public ComboBoxFrame()
   {
      super("Testing JComboBox");
      setLayout(new FlowLayout());    

      imagesJComboBox = new JComboBox<String>(names); 
      imagesJComboBox.setMaximumRowCount(3); 

      imagesJComboBox.addItemListener(
         new ItemListener() 
         {
            
            @Override
            public void itemStateChanged(ItemEvent event)
            {
               
               if (event.getStateChange() == ItemEvent.SELECTED)
                  label.setIcon(icons[
                     imagesJComboBox.getSelectedIndex()]);
            } 
         } 
      ); 

      add(imagesJComboBox); 
      label = new JLabel(icons[0]); 
      add(label);
      setSize(350, 350);
      setVisible(true); 
   }
} // end class ComboBoxFrame


/**************************************************************************
 * .          linha 15 sao vetores atravez de chaves edeclarado em cochetes // declara um tipo de variaveis                 *
 *   // uma classe e 4 variaveis 
 *  == operador de comparaçao 
 * icons é usado so para strings
 * ele vai ve se esta selecionado, se estiver vai haver uma label e vai ser enviador um dos vetores de icons. os objetos em si sao compativeis.index é o intem dos vtores que estao rm combobox.   
 * bug1.gif", "bug2.gif",  "travelbug.gif", "buganim.gif" esta dentro de uma string. index é um numero de vetor  que começa com zero                                                                   *
 * .                     *
 *************************************************************************/
