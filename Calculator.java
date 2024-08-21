import java.awt.*;// importa a biblioteca java 
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame // declaraçao que exporta e permite a classe, classe: declaraçao de classe ( pode se tornar um objeto) 
{    
    private final JTextField textField1;
    private final JTextField textField2;
  
    
  
    private final JLabel label1; // apenas para  visualizaçao de leitura de texto 
    private final JLabel label2; 
    
     private final JButton btnCalcular;
    private final JLabel labelNotificacao;
    public Calculator()
    {
        super("Calculadora de soma");
        setLayout(new GridLayout(3,2,5,5));// (3,2,5,5)

        label1 = new JLabel("Digite o numero 1:", SwingConstants.RIGHT); // (declarar o inicio das declaraçoes de parametro do metodo)
        add(label1);
        textField1 = new JTextField(10);
        add(textField1);
        
        label2 = new JLabel("Digite o numero 2:",SwingConstants.RIGHT); 
        add(label2);
        textField2 = new JTextField(10);
        add(textField2); 

          btnCalcular = new JButton( "Calcular"); 
          add(btnCalcular);
          labelNotificacao = new JLabel( "resultado: ?");
          add(labelNotificacao);
            // add(JLabel)
        TextFieldHandler handler = new TextFieldHandler();// handler: maqnipulador de entrada de texto 
        btnCalcular.addActionListener(handler);
        
       
       
    } 


    private class TextFieldHandler implements ActionListener 
    {
    
        @Override // injetando no metodo as informaçoes, injetar os dados
        public void actionPerformed(ActionEvent event)// actionevent: identifica os objt
        {
            
            
          
            if ( textField1.getText().trim().length()== 0) {
                // trim: remove espacos laterais
                // notificar o usuario qu o campo 1 esta vazio
                labelNotificacao.setText(" O campo 1 esta vazio!");
                textField1.requestFocus();

            }else {
                if ( textField2.getText().trim().length()== 0) {
                    labelNotificacao.setText(" O campo 2 esta vazio!");
                    textField2.requestFocus();
                    // notificar o usuario que o campo 2 esta vazio
                
                } else {                                                                                            
                    // aqui esta feito a soma
                    try {

                  
                    int soma = Integer.valueOf(textField1.getText()) + Integer.valueOf(textField2.
                    getText());
                    labelNotificacao.setText(String.format("Resultado: %s", soma));
                    } catch (Exception e) {
                    labelNotificacao.setText("<html><body>Ops! Parece que foi digitado alguma coisa errada, \r\nfavor revisar a digitaçao, pois podem ser digitados apenas numeros inteiros.</body></html>");
                    
                }
                }
            
        } 
        } 
    }
    public static void main(String[] args)
    { 
        Calculator calculator = new Calculator(); 
        calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calculator.setSize(450, 400); 
        calculator.setVisible(true); 
    }
}
