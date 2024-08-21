// Fig. 12.9: TextFieldFrame.java
// JTextFields and JPasswordFields.
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class TextFieldFrame extends JFrame 
{//declaraçao de variaveis 
   private final JTextField textField1; 
   private final JTextField textField2; 
   private final JTextField textField3; 
   private final JPasswordField passwordField; 

   
   public TextFieldFrame()
   {
      super("Testing JTextField and JPasswordField");
      setLayout(new FlowLayout());

      textField1 = new JTextField(10); 
      add(textField1);
      
      textField2 = new JTextField("Enter your text here now");
      add(textField2); 

      
      textField3 = new JTextField("Uneditable text field", 21);
      
      textField3.setEditable(false);
      add(textField3);

     
      passwordField = new JPasswordField("Hidden text");
      add(passwordField); 

      
      TextFieldHandler handler = new TextFieldHandler();// handler: maqnipulador de entrada de texto 
      textField1.addActionListener(handler);
      textField2.addActionListener(handler);
      textField3.addActionListener(handler);
      passwordField.addActionListener(handler);
   } 

   
   private class TextFieldHandler implements ActionListener 
   {
      
      @Override // injetando no metodo as informaçoes, injetar os dados
      public void actionPerformed(ActionEvent event)// actionevent: identifica os objt
      {
         String string = ""; 
        
         if (event.getSource() == textField1) // == é um comparador de comparaçao,
            string = String.format("textField1: %s",
               event.getActionCommand());

         
         else if (event.getSource() == textField2)
            string = String.format("textField2: %s",
         
               event.getActionCommand());

        
         else if (event.getSource() == textField3)
            string = String.format("textField3: %s", 
               event.getActionCommand());// ele vai cpiturar  o valor do  objttexto de imput

        
         else if (event.getSource() == passwordField)
            string = String.format("passwordField: %s", 
               event.getActionCommand());

       
         JOptionPane.showMessageDialog(null, string); 
      } 
   } 
} 
/**************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
