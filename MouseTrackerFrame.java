import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class MouseTrackerFrame extends JFrame
{
   private final JPanel mousePanel; 
   private final JLabel statusBar;

   
   public MouseTrackerFrame()
   {
      super("Demonstrating Mouse Events");

      mousePanel = new JPanel(); 
      mousePanel.setBackground(Color.WHITE); 
      add(mousePanel, BorderLayout.CENTER); 

      statusBar = new JLabel("Mouse outside JPanel"); 
      add(statusBar, BorderLayout.SOUTH); 

      
      MouseHandler handler = new MouseHandler(); 
      mousePanel.addMouseListener(handler); 
      mousePanel.addMouseMotionListener(handler); 
   } 

   private class MouseHandler implements MouseListener, 
      MouseMotionListener 
   {
      
      @Override
      public void mouseClicked(MouseEvent event)
      {
         statusBar.setText(String.format("Clicked at [left: %d, top: %d, right: %d, bottom: %d]", // quando o mouse for clicado 
            event.getX(), event.getY(), mousePanel.getWidth() - event.getX(), mousePanel.getHeight() - event.getY()));
      } 

      
      @Override
      public void mousePressed(MouseEvent event)
      {
         statusBar.setText(String.format("Pressed at [left:%d, top: %d, right: %d, bottom: %d]",// qando vc clicar e segura o click 
            event.getX(), event.getY(), mousePanel.getWidth() - event.getX(), mousePanel.getHeight() - event.getY()));
      }

      @Override
      public void mouseReleased(MouseEvent event)
      {
         statusBar.setText(String.format("Released at [left: %d, top: %d, right: %d, bottom: %d]", //mouse soltado 
            event.getX(), event.getY(), mousePanel.getWidth() - event.getX(), mousePanel.getHeight() - event.getY()));
      }

      
      @Override
      public void mouseEntered(MouseEvent event)
      {
         statusBar.setText(String.format("Mouse entered at [left: %d, top: %d, right: %d, bottom: %d]", // quando vc entra com o mouse dentro do painel( mouse entra dentro do painel verde)
            event.getX(), event.getY(), mousePanel.getWidth() - event.getX(), mousePanel.getHeight() - event.getY()));
         mousePanel.setBackground(Color.GREEN);
      }

      
      @Override
      public void mouseExited(MouseEvent event)// mouse de saida do painel
      {
         statusBar.setText("Mouse outside JPanel"); // quando o mouse saiu do painel o quadro  volta branco
         mousePanel.setBackground(Color.WHITE);
      }

      
      @Override
      public void mouseDragged(MouseEvent event)
      {
         statusBar.setText(String.format("Dragged at [left:%d, top: %d, right: %d, bottom: %d]", 
            event.getX(), event.getY(), mousePanel.getWidth() - event.getX(), mousePanel.getHeight() - event.getY()));
      } 

      
      @Override
      public void mouseMoved(MouseEvent event) // mouse foi movido do painel 
      {
         statusBar.setText(String.format("Moved at [left:%d,  top:%d, right: %d, bottom: %d]", 
            event.getX(), event.getY(), mousePanel.getWidth() - event.getX(), mousePanel.getHeight() - event.getY()));
      } 
   } // end inner class MouseHandler
} // end class MouseTrackerFrame

/**************************************************************************
 * event.getX();: distancia da borda lateral esquerda 
 * event.getY();:distancia da borda superior  
 * borda da direita= largura do painel                       
 *                                                                        *
 *                                                                        *
 *                                                                        *
 *                                                                        *
 *                                                                        *
 *                                                                        *
 *************************************************************************/
