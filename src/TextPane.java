import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JTextPane;

public class TextPane extends JTextPane {
  
  TextPane() {
    this.setPreferredSize(new Dimension(250,40));
    this.setFont(new Font("Segoe UI",Font.PLAIN,15));
    this.setEditable(false);
    this.setForeground(Color.BLACK);
    this.setBackground(Color.LIGHT_GRAY);    
  }
}
