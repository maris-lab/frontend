
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class MultipleSelectionFrame extends JFrame 
{
   private final JList<String> colorJList; 
   private final JList<String> copyJList;
   private final JList<String> copyJList2;// copia 3 do JLIst


   private JButton copyJButton;
   private JButton copyJButton2;// copia do 2 JButton

   private static final String[] colorNames = {"Black", "Blue", "Cyan",
      "Dark Gray", "Gray", "Green", "Light Gray", "Magenta", "Orange", 
      "Pink", "Red", "White", "Yellow"};

   
   public MultipleSelectionFrame()
   {
      super("Multiple Selection Lists");
      setLayout(new FlowLayout());

      colorJList = new JList<String>(colorNames);
      colorJList.setVisibleRowCount(5); 
      colorJList.setSelectionMode(
         ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
      add(new JScrollPane(colorJList)); 

      copyJButton = new JButton("Copy >>>"); 
      copyJButton.addActionListener(
         new ActionListener() 
         {  
            
            @Override
            public void actionPerformed(ActionEvent event)
            {
               
               copyJList.setListData(
                  colorJList.getSelectedValuesList().toArray(
                     new String[0]));
            }
         } 
      ); 
       add(copyJButton);

      copyJList = new JList<String>(); 
      copyJList.setVisibleRowCount(5); 
      copyJList.setFixedCellWidth(100);
      copyJList.setFixedCellHeight(15); 
      copyJList.setSelectionMode(
         ListSelectionModel.SINGLE_INTERVAL_SELECTION);
      add(new JScrollPane(copyJList));

      copyJButton2 = new JButton("Copy >>>"); 
      copyJButton2.addActionListener(
         new ActionListener() 
         {  
            
            @Override
            public void actionPerformed(ActionEvent event)
            {
               
               copyJList2.setListData(
                  copyJList.getSelectedValuesList().toArray(
                     new String[0]));
            }
         } 
      ); 
       add(copyJButton2);

      copyJList2 = new JList<String>(); 
      copyJList2.setVisibleRowCount(5); 
      copyJList2.setFixedCellWidth(100);
      copyJList2.setFixedCellHeight(15); 
      copyJList2.setSelectionMode(
         ListSelectionModel.SINGLE_INTERVAL_SELECTION);
      add(new JScrollPane(copyJList2)); 
   } 
} // end class MultipleSelectionFrame


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
