import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JTextField;

public class TextField extends JTextField {
  
  TextField() {
    this.setPreferredSize(new Dimension(250,40));
    this.setFont(new Font("Segoe UI",Font.PLAIN,30));
    this.setForeground(Color.GREEN);
    this.setBackground(Color.BLACK);
    this.setCaretColor(Color.WHITE);
    
  }
}