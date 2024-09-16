import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuFrame extends JFrame {
    private final Color[] colorValues = 
        {Color.BLACK, Color.BLUE, Color.RED, Color.GREEN};   
    private final JRadioButtonMenuItem[] colorItems; 
    private final JRadioButtonMenuItem[] fonts; 
    private final JCheckBoxMenuItem[] styleItems; 
    private final JCheckBoxMenuItem underlineItem; 
    private final JLabel displayJLabel; 
    private final ButtonGroup fontButtonGroup; 
    private final ButtonGroup colorButtonGroup; 
    private int style;

    public MenuFrame() {
        super("Using JMenus");     

        JMenu fileMenu = new JMenu("File"); 
        fileMenu.setMnemonic('F'); 

        JMenuItem aboutItem = new JMenuItem("About...");
        aboutItem.setMnemonic('A'); 
        fileMenu.add(aboutItem); 
        aboutItem.addActionListener(
            new ActionListener() {  
                @Override
                public void actionPerformed(ActionEvent event) {
                    JOptionPane.showMessageDialog(MenuFrame.this,
                        "This is an example\nof using menus",
                        "About", JOptionPane.PLAIN_MESSAGE);
                } 
            } 
        ); 

        JMenuItem exitItem = new JMenuItem("Exit"); 
        exitItem.setMnemonic('x'); 
        fileMenu.add(exitItem); 
        exitItem.addActionListener(
            new ActionListener() {  
                @Override
                public void actionPerformed(ActionEvent event) {
                    System.exit(0); 
                } 
            }
        ); 

        JMenuBar bar = new JMenuBar();
        setJMenuBar(bar);
        bar.add(fileMenu); 

        JMenu formatMenu = new JMenu("Format"); 
        formatMenu.setMnemonic('r');

        String[] colors = {"Black", "Blue", "Red", "Green"};
        JMenu colorMenu = new JMenu("Color");
        colorMenu.setMnemonic('C');

        colorItems = new JRadioButtonMenuItem[colors.length];
        colorButtonGroup = new ButtonGroup(); 
        ItemHandler itemHandler = new ItemHandler();

        for (int count = 0; count < colors.length; count++) {
            colorItems[count] = new JRadioButtonMenuItem(colors[count]); 
            colorMenu.add(colorItems[count]); 
            colorButtonGroup.add(colorItems[count]);
            colorItems[count].addActionListener(itemHandler);
        }

        colorItems[0].setSelected(true); 

        formatMenu.add(colorMenu); 
        formatMenu.addSeparator(); 

        String[] fontNames = {"Serif", "Monospaced", "SansSerif"};
        JMenu fontMenu = new JMenu("Font"); 
        fontMenu.setMnemonic('n'); 

        fonts = new JRadioButtonMenuItem[fontNames.length];
        fontButtonGroup = new ButtonGroup(); 

        for (int count = 0; count < fonts.length; count++) {
            fonts[count] = new JRadioButtonMenuItem(fontNames[count]);
            fontMenu.add(fonts[count]); 
            fontButtonGroup.add(fonts[count]); 
            fonts[count].addActionListener(itemHandler); 
        } 

        fonts[0].setSelected(true); 
        fontMenu.addSeparator();

        String[] styleNames = {"Bold", "Italic", "Underline"}; 
        styleItems = new JCheckBoxMenuItem[2]; // Only for Bold and Italic
        StyleHandler styleHandler = new StyleHandler();
        underlineItem = new JCheckBoxMenuItem(styleNames[2]);
        fontMenu.add(underlineItem);
        underlineItem.addItemListener(styleHandler);
        
        for (int count = 0; count < 2; count++) { // Only add Bold and Italic
            styleItems[count] = new JCheckBoxMenuItem(styleNames[count]);
            fontMenu.add(styleItems[count]); 
            styleItems[count].addItemListener(styleHandler);
        }

        formatMenu.add(fontMenu); 
        bar.add(formatMenu); 

        displayJLabel = new JLabel("Sample Text", SwingConstants.CENTER);
        displayJLabel.setForeground(colorValues[0]);
        displayJLabel.setFont(new Font("Serif", Font.PLAIN, 72));

        getContentPane().setBackground(Color.CYAN);
        add(displayJLabel, BorderLayout.CENTER); 
    } 

    private class ItemHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            for (int count = 0; count < colorItems.length; count++) {
                if (colorItems[count].isSelected()) {
                    displayJLabel.setForeground(colorValues[count]);
                    break;
                } 
            } 

            for (int count = 0; count < fonts.length; count++) {
                if (event.getSource() == fonts[count]) {
                    displayJLabel.setFont(
                        new Font(fonts[count].getText(), style, 72));
                }
            }

            repaint(); 
        } 
    } 

    private class StyleHandler implements ItemListener {
        @Override
        public void itemStateChanged(ItemEvent e) {
            String name = displayJLabel.getFont().getName();
            int fontStyle = Font.PLAIN;

            // Verifica se os estilos de negrito e itálico estão selecionados
            if (styleItems[0].isSelected() && styleItems[1].isSelected()) {
                fontStyle = Font.BOLD | Font.ITALIC;
            } else if (styleItems[0].isSelected()) {
                fontStyle = Font.BOLD;
            } else if (styleItems[1].isSelected()) {
                fontStyle = Font.ITALIC;
            }

            // Atualiza o texto com ou sem sublinhado usando HTML
            String text = "Sample Text"; // Texto padrão, você pode ajustar conforme necessário
            if (underlineItem.isSelected()) {
                displayJLabel.setText("<html><u>" + text + "</u></html>");
            } else {
                displayJLabel.setText(text); // Remove o HTML, se necessário
            }

            // Atualiza a fonte sem o sublinhado
            displayJLabel.setFont(new Font(name, fontStyle, 72));
            repaint(); 
        } 
    }
}




/**************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and               
 * Pearson Education, Inc. All Rights Reserved.                           
 *    // colorItems[0].setSelected(true); 
definicao d selecao d botao de cor   
// for: definir um looping com 3 repetiçoes  
//  String[] styleNames = {"Bold", "Italic"};  varia vem tipo string deestilo
// .setForeground: cor do texto.                                                                *
 *      *event parametro do actionperformace.
 * repaint: repintar 
 * public void itemStateChanged(ItemEvent e)// mudar o estado do item 
 *      displayJLabe: nome da string 
 *    if (styleItems[0].isSelected() && // juntando a seleçao dos dois itens 
 *   font = new Font(name, Font.BOLD + Font.ITALIC, 72);// envia  o nome fda fonte eo tamanho   *
 *  1) if (styleItems[0].isSelected() &&  // if sobre a verificaçao dos dois itens       *
 *   2)  else if (styleItems[0].isSelected())// se so o bold ta marcado     *
 *       *
 *         *
 *        *
 *     *
 *s *
 *   *
 *                    
 *************************************************************************/

