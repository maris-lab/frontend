// Fig. 12.20: RadioButtonTest.java
// Testing RadioButtonFrame.
import javax.swing.JFrame; // biblioteca java 

public class RadioButtonTest // classe publica  
{
   public static void main(String[] args)
   {
      RadioButtonFrame radioButtonFrame = new RadioButtonFrame();
      radioButtonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// definir operçao de fechamento 
      radioButtonFrame.setSize(300, 135); 
      radioButtonFrame.setVisible(true); // definir se é visivel verdadeiro
   } 
} // end class RadioButtonTest // encerramento  do bloco de codigo

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
