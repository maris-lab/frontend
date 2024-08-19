// Fig. 12.7: LabelTest.java
// Testing LabelFrame.
import javax.swing.JFrame;//  ação inicial da importação de biblioteca java  

public class LabelTest // inicio do bloco 
{
   public static void main(String[] args)// declaração de método de executor
   { // método sempre dentro de classe " public static"
      LabelFrame labelFrame = new LabelFrame(); // declaração da "LabelFrame:"(componente) "labelFrame:"(variavel) 
      labelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      labelFrame.setSize(5500, 6000); // altura e largura da imagem ( height: altura) ( width: largura)
      labelFrame.setVisible(true); // se tornar visivel o quadrinho da imagem 
   } // encerramento do bloco e dos códigos 
} // end class LabelTest


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
