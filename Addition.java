// Fig. 12.2: Addition.java
// Addition program that uses JOptionPane for input and output.
import javax.swing.JOptionPane; //  import : arquivo importado( biblioteca)javax: biblioteca do java // swing: modulo ( jOptionPane:auditivo)  

public class Addition {// exportação da classe "Addition"
{

   public static void main(String[] args) {// Aqui é criado um método de executor main 
// metodo de declaraçao somente leitura exportado ( args: argumentaçao) string: tipo de texto 
   // encerra o bloco de códigos do método main 
   {
      // obtenha a entrada do usuario 
      String firstNumber = // baseado em primeiro número de texto(caracteristicas)
         JOptionPane.showInputDialog("Digite o primeiro numero");
      String secondNumber =// caracteristicas no segundo número de texo
         JOptionPane.showInputDialog("Digite o segundo numero");

      // convertar a entrada de valores( string firstNumber1 e 2)
      int number1 = Integer.parseInt(firstNumber); 
      int number2 = Integer.parseInt(secondNumber);
       // int: tipo da variavel  soma dos inteiros 
      int sum = number1 + number2; // adicionar numero ( texto1+ texto2 juntar  a caracteristicas do numero 1 e 2 )

      // exibir o resultado do dialogo da menssagem 
      JOptionPane.showMessageDialog(null, "A soma dos numeros é: " + sum, // soma 
         "Soma de dois inteiros", JOptionPane.PLAIN_MESSAGE); // "PLAIN_MESSAGE" palavra gritanteeee!!!!!
   } 
} // final da ação de blocos
  // final da ação de códigos

/**************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and *
 * Pearson Education, Inc. All Rights Reserved. *
 * *
 * DISCLAIMER: The authors and publisher of this book have used their *
 * best efforts in preparing the book. These efforts include the *
 * development, research, and testing of the theories and programs *
 * to determine their effectiveness. The authors and publisher make *
 * no warranty of any kind, expressed or implied, with regard to these *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or *
 * consequential damages in connection with, or arising out of, the *
 * furnishing, performance, or use of these programs. *
 *************************************************************************/
